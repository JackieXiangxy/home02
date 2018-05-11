package com.jackie.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jackie.bean.Admin;
import com.jackie.service.AdminService;
import com.jackie.service.impl.AdminServiceImpl;

@WebServlet("/home")
public class AdminServlet extends HttpServlet {
	private AdminService adminService;
	private static final long serialVersionUID = 1L;
	
	
	
	public AdminServlet() {
		adminService=new AdminServiceImpl();
	}
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action=request.getParameter("adminquery");
		if (action.equals("adm.getId()")) {
			List<Admin> admins=adminService.findAdmins();
			HttpSession session=request.getSession();
			session.setAttribute("adminlist", admins);
			request.getRequestDispatcher("admin/adminList.jsp").forward(request, response);
			
		}
	
	}

}
