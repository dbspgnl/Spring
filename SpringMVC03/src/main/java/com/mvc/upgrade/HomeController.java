package com.mvc.upgrade;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mvc.upgrade.model.biz.BoardBiz;
import com.mvc.upgrade.model.dto.BoardDto;

@Controller
public class HomeController {
	
	@Autowired
	private BoardBiz biz;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/home.do", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping("/list.do")
	public String selectList(Model model) {
		logger.info("SELECT LIST");
		model.addAttribute("list", biz.selectList());
		return "mvclist";
	}
	
	@RequestMapping("/detail.do")
	public String detail(Model model, int myno) {
		logger.info("SELECT One");
		BoardDto dto = biz.selectOne(myno);
		model.addAttribute("dto", dto);
		return "mvcdetail";
	}
	
	@RequestMapping("/updateform.do")
	public String updateForm(Model model, int myno) {
		logger.info("UPDATE FORM");
		BoardDto dto = biz.selectOne(myno);
		model.addAttribute("dto", dto);
		return "mvcupdate";
	}
	
	@RequestMapping(value="/updateres.do", method=RequestMethod.POST)
	public String updateRes(BoardDto dto) {
		logger.info("UPDATE RESULT");
		
		int res = biz.update(dto);
		if(res>0) {
			return "redirect:detail.do?myno="+dto.getMyno();
		} else {
			return "redirect:updateform.do?myno="+dto.getMyno();
		}
	}
	
	@RequestMapping("/insert.do")
	public String insert() {
		logger.info("INSERT FROM");
		return "mvcinsert";
	}
	
	@RequestMapping("/insertres.do")
	public String updateForm(Model model, String myname, String mytitle, String mycontent) {
		logger.info("INSERT RESULT");
		
		BoardDto dto = new BoardDto();
		dto.setMyname(myname);
		dto.setMytitle(mytitle);
		dto.setMycontent(mycontent);
		
		int res = biz.insert(dto);
		if(res>0) {
			return "redirect:list.do";
		} else {
			return "redirect:insert.do";
		}
	}
	
	@RequestMapping("/delete.do")
	public String delete(int myno) {
		logger.info("DELETE RESULT");
		
		int res = biz.delete(myno);
		if(res>0) {
			return "redirect:list.do";
		} else {
			return "redirect:detail.do?myno="+myno;
		}
	}
	
}
