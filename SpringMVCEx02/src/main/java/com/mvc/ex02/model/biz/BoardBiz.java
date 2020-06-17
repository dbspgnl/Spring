package com.mvc.ex02.model.biz;

import java.util.List;

import com.mvc.ex02.model.dto.BoardDto;

public interface BoardBiz {
	public List<BoardDto> selectList ();
	public String test();
	public int insert(BoardDto dto);
}
