package com.jackie.service.impl;

import java.util.List;

import com.jackie.bean.Admin;
import com.jackie.dao.AdminDAO;
import com.jackie.dao.impl.AdminDAOImpl;
import com.jackie.service.AdminService;

public class AdminServiceImpl implements AdminService {
	private AdminDAO adminDao=new AdminDAOImpl();

	@Override
	public int addAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delAdmin(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Admin> findAdmins() {
		
		return adminDao.findAdmins();
	}

	@Override
	public Admin findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
