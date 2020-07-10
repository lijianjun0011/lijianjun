package com.jiyun.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jiyun.bean.Dept;
import com.jiyun.bean.Stu;
import com.jiyun.service.StuService;

@Controller
public class StuController {
@Autowired
private StuService stuService;

@RequestMapping("toShow")
public String toShow(){
	return "show";
}

	@RequestMapping("findAll")
	@ResponseBody
	public List<Stu> findAll(){
		List<Stu>list = stuService.findAll();
		System.out.println("list");
		return list;
	}
	//跳转添加页面
	@RequestMapping("toAdd")
	public String toAdd(){
		return "add";
	}
	//查询地址列表
	@ResponseBody
	@RequestMapping("findDept")
	public List<Dept> findDept(){
		List<Dept> dlist = stuService.findDept();
		return dlist;
	}
	//添加
		@ResponseBody
		@RequestMapping("addStu")
		public int addStu(@RequestBody Stu stu){
			int i = stuService.addStu(stu);
			return i;
		}
	//修改
		@ResponseBody
		@RequestMapping("updateStu")
		public int updateStu(@RequestBody Stu stu){
			int i = stuService.updateStu(stu);
			return i;
		}
	//删除
		@ResponseBody
		@RequestMapping("delStu")
			public int delStu(@RequestBody Integer[] ids){
				int i = stuService.delStu(ids);
				return i;
			}
		}

