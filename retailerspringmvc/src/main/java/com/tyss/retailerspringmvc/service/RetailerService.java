package com.tyss.retailerspringmvc.service;

import com.tyss.retailerspringmvc.dto.RetailerBean;

public interface RetailerService {
	public RetailerBean login(int id, String password);
	public int register(RetailerBean bean);
	public RetailerBean searchProduct(int id);
	public boolean changePassword(int id, String password);
}
