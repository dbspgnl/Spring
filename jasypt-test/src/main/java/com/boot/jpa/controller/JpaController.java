package com.boot.jpa.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.boot.jpa.dao.JpaDao;
import com.boot.jpa.dto.JpaDto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member")
public class JpaController {
	
	@Autowired
	private JpaDao dao;
	@GetMapping("/list")
	public String selectList(Model model) {
		model.addAttribute("list", dao.findAll());
		return "jpalist";
	}
	
	@GetMapping("/detail")
	public String detail(Model model, int myno) {
		model.addAttribute("dto", dao.findByMyno(myno));
		return "jpadetail";
	}
	
	@GetMapping("/insertForm")
	public String insertForm() {
		return "jpainsert";
	}
	
	@PostMapping("/insertres")
	public String insertRes(JpaDto dto) {
		dto.setMydate(new Date());
		dao.save(dto);
		return "redirect:list";
	}
	
	@GetMapping("/updateform")
	public String updateForm(Model model, int myno) {
		model.addAttribute("dto", dao.findByMyno(myno));
		return "jpaupdate";
	}
	
	@PostMapping("/updateres")
	public String updateRes(JpaDto dto) {
		dto.setMydate(new Date());
		dao.save(dto);
		return "redirect:detail?myno="+dto.getMyno();
	}
	
	@GetMapping("/delete")
	public String delete(int myno) {
		dao.deleteByMyno(myno);
		return "redirect:list";
	}
	
	
}
