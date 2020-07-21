package com.jiyun.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

import com.jiyun.bean.Dept;
import com.jiyun.bean.Stu;
import com.jiyun.bean.StuVo;

public interface StuMapper {

	List<Stu> findAll(StuVo stuvo);

	List<Dept> findDept();

	@Insert("insert into stu value(null,#{sname},#{age},#{sex},#{depid},#{birthday},#{pic})")
	int addStu(Stu stu);

	int updateStu(Stu stu);

	int delStu(@Param("ids") Integer[] ids);



}
