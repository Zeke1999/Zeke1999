package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.example.dao.UserMapper;
import com.example.entity.ReturnObj;
import com.example.entity.User;
import com.example.service.UserService;

@Controller
public class UserController {
@Autowired
private UserService userService;

@PostMapping("/login")
@ResponseBody //有了这个注解我们的返回不会视为跳转数据，而是放进返回体中
public ReturnObj login(@RequestBody JSONObject params) {
	String username=params.getString("username");
	String password=params.getString("password");
	User user=new User(username,password);
	Boolean result=userService.verifyUser(user);
	if(result) {
		return ReturnObj.buildSuccess();
	}else {
		return ReturnObj.buildFault();
	}
}
}
