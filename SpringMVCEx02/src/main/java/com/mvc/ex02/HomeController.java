package com.mvc.ex02;

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

import com.mvc.ex02.model.biz.BoardBiz;
import com.mvc.ex02.model.dto.BoardDto;

@Controller
public class HomeController {
	
	@Autowired
	BoardBiz biz;
	
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
	
	@RequestMapping("/insert.do")
	public String insert() {
		logger.info("INSERT FROM");
		return "mvcinsert";
	}
	
	@RequestMapping("/insertres.do")
	public String updateForm(Model model, BoardDto dto) {
		logger.info("INSERT RESULT");	
		int res = biz.insert(dto);
		if(res>0) {
			return "redirect:list.do";
		} else {
			return "redirect:insert.do";
		}
	}
	
	@RequestMapping("/test.do")
	public String test() {
		logger.info("TRANSACTION");
		biz.test();
		return "redirect:list.do";
	}
	
}
