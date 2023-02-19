package com.example.dao;

import org.apache.ibatis.annotations.Mapper;

import com.example.entity.User;

@Mapper
public interface UserMapper {
	User getUser(String username);
}
