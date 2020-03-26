package com.mvc.ex02.model.dto;

public class MemberDto {
	private String memberno;
	private String memberid;
	private String memberpw;
	private String membername;
	
	public MemberDto() {
		
	}

	public MemberDto(String memberno, String memberid, String memberpw, String membername) {
		super();
		this.memberno = memberno;
		this.memberid = memberid;
		this.memberpw = memberpw;
		this.membername = membername;
	}

	public String getMemberno() {
		return memberno;
	}

	public void setMemberno(String memberno) {
		this.memberno = memberno;
	}

	public String getMemberid() {
		return memberid;
	}

	public void setMemberid(String memberid) {
		this.memberid = memberid;
	}

	public String getMemberpw() {
		return memberpw;
	}

	public void setMemberpw(String memberpw) {
		this.memberpw = memberpw;
	}

	public String getMembername() {
		return membername;
	}

	public void setMembername(String membername) {
		this.membername = membername;
	}
	
}
