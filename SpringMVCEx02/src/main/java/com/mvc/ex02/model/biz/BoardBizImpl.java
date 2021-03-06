package com.mvc.ex02.model.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mvc.ex02.model.dao.BoardDao;
import com.mvc.ex02.model.dto.BoardDto;

@Service
public class BoardBizImpl implements BoardBiz {

	@Autowired
	BoardDao dao;
	
	@Override
	public List<BoardDto> selectList() {
		return dao.selectList();
	}

	@Override
	//@Transactional
	public String test() {
		//dummy insert
		dao.insert(
				new BoardDto(0, "test", "test", "test", null));
		//exception
		String test = dao.test(); 
		int length = test.length(); 
		//test는 null이므로 이 기능을 null point exception을 발생시킨다.
		
		return test;
	}

	@Override
	public int insert(BoardDto dto) {
		return dao.insert(dto);
	}

}
