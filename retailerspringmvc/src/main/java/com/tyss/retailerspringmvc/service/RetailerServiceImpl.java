package com.tyss.retailerspringmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyss.retailerspringmvc.dao.RetailerDAO;
import com.tyss.retailerspringmvc.dto.RetailerBean;

@Service
public class RetailerServiceImpl implements RetailerService {
	@Autowired
	private RetailerDAO dao;
	
	
	@Override
	public RetailerBean login(int id, String password) {
		return dao.login(id, password);
	}

	@Override
	public int register(RetailerBean bean) {
		return dao.register(bean);
	}


	@Override
	public boolean changePassword(int id, String password) {
		return dao.changePassword(id, password);
	}

	@Override
	public RetailerBean searchProduct(int id) {
		return null;
	}
	
}
