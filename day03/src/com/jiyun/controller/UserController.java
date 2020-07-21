package com.jiyun.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jiyun.bean.Dept;
import com.jiyun.bean.Stu;
import com.jiyun.bean.StuVo;
import com.jiyun.bean.User;
import com.jiyun.service.StuService;
import com.jiyun.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService us;
	//跳转登录页面
	@RequestMapping("toLogin")
	public String toLogin(){
		return "login";
	}
	

	@RequestMapping("toLogin")
	@ResponseBody
	public Integer toLogin(@RequestBody User user ){
		int i = us.toLogin(user);
		return i;
	}
	
}

