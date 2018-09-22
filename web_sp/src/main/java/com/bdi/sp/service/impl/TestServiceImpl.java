package com.bdi.sp.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bdi.sp.DAO.TestDAO;
import com.bdi.sp.DAO.impl.TestDAOImpl;


@Service
public class TestServiceImpl implements com.bdi.sp.service.TestService {
	@Autowired
	private TestDAO tdao;
	@Override
	public List<Map<String,String>> getList() {
		return tdao.getList();
	}

	@Override
	public void doInsert() {
		// TODO Auto-generated method stub

	}

}
