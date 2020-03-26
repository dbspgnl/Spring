package com.mvc.ex02.model.dao;

import com.mvc.ex02.model.dto.MemberDto;

public interface MemberDao {
	String NAMESPACE = "mymember.";
	public MemberDto login(MemberDto dto);
}
