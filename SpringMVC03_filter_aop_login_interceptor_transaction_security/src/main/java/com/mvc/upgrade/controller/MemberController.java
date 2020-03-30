package com.mvc.upgrade.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mvc.upgrade.model.biz.MemberBiz;
import com.mvc.upgrade.model.dto.MemberDto;

@Controller
public class MemberController {
	private Logger logger = LoggerFactory.getLogger(MemberController.class);
	@Autowired
	private MemberBiz biz;
	@Autowired
	BCryptPasswordEncoder passwordEncoder;
	@RequestMapping("/loginform.do")
	public String loginForm() {
		logger.info("LOGIN FORM");
		return "mvclogin";
	}
	@RequestMapping(value="/ajaxlogin.do", method=RequestMethod.POST)
	@ResponseBody
	public Map<String, Boolean> ajaxLogin(HttpSession session,
			@RequestBody MemberDto dto){
		logger.info("AJAX LOGIN");
		/*
		 * @Response : java 객체를 response 객체에 binding
		 * (뷰리졸버를 거치지 않고 바로 ajax로 보내준다)
		 * (서버에서 넘어가는 객체를 jackson이 json 형태로 해준다)
		 * @RequestBody : request 객체에 담겨져 넘어오는 데이터를 java 객체에 binding
		 * (json 형태를 알아서 자바로 변경해준다)
		 */
		MemberDto res = biz.login(dto);
		boolean check = false;
		if(res!=null) {
			if(passwordEncoder.matches(dto.getMemberpw(), res.getMemberpw())) {
				session.setAttribute("login", res);
				check = true;
			}
		}
		Map<String, Boolean> map = new HashMap<String, Boolean>();
		map.put("check", check);
		return map;
	}
	@RequestMapping("/joinform.do")
	public String joinform() {
		logger.info("JOIN FORM");
		return "mvcjoin";
	}
	@RequestMapping(value = "/joinres.do", method = RequestMethod.POST)
	public String joinres(MemberDto dto) {
		logger.info("JOIN RES");
		dto.setMemberpw(passwordEncoder.encode(dto.getMemberpw()));
		System.out.println("Encoding Password: "+dto.getMemberpw());
		
		int res = biz.join(dto);
		if(res>0) {
			//session.setAttribute("login", dto.getMemberid());
			return "redirect:index.html";
		} else {
			return "redirect:loginform.do";
		}
	}
	
}
