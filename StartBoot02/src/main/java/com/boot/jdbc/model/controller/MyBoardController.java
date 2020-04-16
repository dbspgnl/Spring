package com.boot.jdbc.model.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.boot.jdbc.model.biz.MyBiz;
import com.boot.jdbc.model.dto.MyDto;

@Controller
@RequestMapping("/myboard")
public class MyBoardController {
	
	@Autowired
	private MyBiz myBiz;
	
	@GetMapping("/list")
	public String selectList(Model model) {
		List<MyDto> list = myBiz.selectList();
		model.addAttribute("list", list);
		return "myboardlist";
	}
	
	@GetMapping("/insertform")
	public String insertform() {
		return "insertform";
	}
	
	@PostMapping("/insert")
	public String insert(MyDto dto) {
		int res = myBiz.insert(dto);
		if(res>0) {
			System.out.println("글작성 성공!");
		}
		return "redirect:/myboard/list";
	}
	
	@GetMapping("/detail")
	public String selectOne(int myno, Model model) {
		model.addAttribute("dto", myBiz.selectOne(myno));
		return "detail";
	}


}
