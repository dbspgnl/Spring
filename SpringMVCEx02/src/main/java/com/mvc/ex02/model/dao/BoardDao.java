package com.mvc.ex02.model.dao;

import java.util.List;

import com.mvc.ex02.model.dto.BoardDto;

public interface BoardDao {

	String NAMESPACE = "myboard.";
	public List<BoardDto> selectList ();
}
