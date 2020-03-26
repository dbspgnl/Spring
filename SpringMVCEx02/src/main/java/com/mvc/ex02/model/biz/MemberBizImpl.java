package com.mvc.ex02.model.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvc.ex02.model.dao.MemberDao;
import com.mvc.ex02.model.dto.MemberDto;

@Service
public class MemberBizImpl implements MemberBiz {

	@Autowired
	private MemberDao dao;
	
	@Override
	public MemberDto login(MemberDto dto) {
		return dao.login(dto);
	}

}
