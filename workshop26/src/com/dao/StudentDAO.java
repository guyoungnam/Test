package com.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import com.dto.PageDTO;
import com.dto.StudentDTO;

public class StudentDAO {

	public int totalCount(SqlSession session) {
		return session.selectOne("totalCount");
	}
	
    public PageDTO selectAllPageStudent(SqlSession session, int curPage){
		
    	PageDTO pDTO = new PageDTO();
        int perPage = 3;
    	int offset=(curPage-1)*perPage;
		List<StudentDTO> list = session.selectList("selectAllStudent",null, new RowBounds(offset, perPage));
		pDTO.setPerPage(perPage);
		
		pDTO.setCurPage(curPage);
		pDTO.setList(list);
		pDTO.setTotalCount(totalCount(session));
		return pDTO;
	}
	
}
