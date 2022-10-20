package com.joongbu.mybatis_board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.joongbu.mybatis_board.dto.UserDto;

@Mapper  //xml로 작성한 sql을 맵핑하는 type 지정
public interface UserMapper {
	// select id=list :return List
	List<UserDto> list(@Param(value = "start")int startRow,int rows);
	UserDto detail(String userId);
	
	int update(UserDto user);
	int insert(UserDto user);
	int delete(String userId);
}
