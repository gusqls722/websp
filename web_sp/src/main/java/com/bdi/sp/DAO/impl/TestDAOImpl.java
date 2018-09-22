package com.bdi.sp.DAO.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.bdi.sp.DAO.TestDAO;

@Repository
public class TestDAOImpl implements TestDAO {

	@Override
	public List<Map<String, String>> getList() {
		List<Map<String,String>> list
		 = new ArrayList<Map<String,String>>();
		
		for(int i=1;i<=10;i++) {
			Map<String,String> map = new HashMap<String,String>();
			map.put("name", "이름"+i);
			map.put("age", i+"");
			list.add(map);
		}
		return list;
	}

	@Override
	public int doInsert() {
		// TODO Auto-generated method stub
		return 0;
	}

}
