package com.dto;

import java.util.List;

public class PageDTO {

	private List<StudentDTO> list;
	private int curPage;
	private int perPage = 5;
	private int totalCount;
	
	public PageDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public List<StudentDTO> getList() {
		return list;
	}
	public void setList(List<StudentDTO> list) {
		this.list = list;
	}
	public int getCurPage() {
		return curPage;
	}
	public void setCurPage(int curPage) {
		this.curPage = curPage;
	}
	public int getPerPage() {
		return perPage;
	}
	public void setPerPage(int perPage) {
		this.perPage = perPage;
	}
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	
	
	
	
	
	
	
	
	
}
