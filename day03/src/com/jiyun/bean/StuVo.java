package com.jiyun.bean;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class StuVo {
	private Integer pageNum;
	private String sname;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date start;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date end;
	public StuVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StuVo(Integer pageNum, String sname, Date start, Date end) {
		super();
		this.pageNum = pageNum;
		this.sname = sname;
		this.start = start;
		this.end = end;
	}
	@Override
	public String toString() {
		return "StuVo [pageNum=" + pageNum + ", sname=" + sname + ", start=" + start + ", end=" + end + "]";
	}
	public Integer getPageNum() {
		return pageNum;
	}
	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Date getStart() {
		return start;
	}
	public void setStart(Date start) {
		this.start = start;
	}
	public Date getEnd() {
		return end;
	}
	public void setEnd(Date end) {
		this.end = end;
	}
	
}
