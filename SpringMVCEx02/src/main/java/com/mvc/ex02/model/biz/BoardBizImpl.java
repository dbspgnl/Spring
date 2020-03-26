package com.mvc.ex02.model.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

}
