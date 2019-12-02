package com.tyss.retailerspringmvc.dao;

import com.tyss.retailerspringmvc.dto.OrderBean;
import com.tyss.retailerspringmvc.dto.ProductBean;
import com.tyss.retailerspringmvc.dto.RetailerBean;

public interface RetailerDAO {
	public RetailerBean login(int id, String password);
	public int register(RetailerBean bean);
	public ProductBean searchProduct(int id);
	public OrderBean DisplayOrder(int id);
	public boolean changePassword(int id, String password);
}


