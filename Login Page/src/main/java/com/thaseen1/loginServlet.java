package com.thaseen1;

import java.io.IOException;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class loginServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		
		String nm = request.getParameter("name");
		String ps = request.getParameter("pass");
		
		
		
		
	}
}
