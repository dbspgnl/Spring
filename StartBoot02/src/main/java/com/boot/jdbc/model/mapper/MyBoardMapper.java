package com.boot.jdbc.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.boot.jdbc.model.dto.MyDto;

@Mapper
public interface MyBoardMapper {

	@Select(" SELECT MYNO, MYNAME, MYTITLE, MYCONTENT, MYDATE FROM MYBOARD ORDER BY MYNO DESC ")
	List<MyDto> selectList();
	
	@Select(" SELECT MYNO, MYNAME, MYTITLE, MYCONTENT, MYDATE FROM MYBOARD WHERE MYNO = #{myno} ")
	MyDto selectOne(int myno);
	
	@Insert(" INSERT INTO MYBOARD VALUES(MYNOSEQ.NEXTVAL, #{myname}, #{mytitle}, #{mycontent}, SYSDATE) ")
	int insert(MyDto dto);
	
	int update(MyDto dto);
	
	int delte(int myno);
}
