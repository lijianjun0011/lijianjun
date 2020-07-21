package com.jiyun.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jiyun.bean.Dept;
import com.jiyun.bean.Stu;
import com.jiyun.bean.StuVo;
import com.jiyun.mapper.StuMapper;

@Service
public class StuService {
@Autowired
private StuMapper stuMapper;

public List<Stu> findAll(StuVo stuvo) {
	
	return stuMapper.findAll(stuvo);
}

public List<Dept> findDept() {
	// TODO Auto-generated method stub
	List<Dept> dlist = stuMapper.findDept();
	return dlist;
}

public int addStu(Stu stu) {
	int i = stuMapper.addStu(stu);
	return i;
}

public int updateStu(Stu stu) {
	int i = stuMapper.updateStu(stu);
	return i;
}

public int delStu(Integer[] ids) {
	int i = stuMapper.delStu(ids);
	return i;
	
}
}
