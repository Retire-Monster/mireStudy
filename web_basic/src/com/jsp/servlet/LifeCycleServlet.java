package com.jsp.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 서블릿을 작성하면 가장먼저 주석을 삭제하고
// @WebServlet의 값을 수정한다.
// url은 소문자를 사용하는 관행이 있다. 또한 url 뎁스는 3뎁스로 끝내는 경향이 있다.
// http 서블릿의 메소드는 훅메소드 임으로 선택적으로 메소드를 오버라이딩 할 수 있다.

//@WebServlet("/life/cycleservlet")
public class LifeCycleServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Get method");
		resp.getWriter().println("Get method");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Post method");
		resp.getWriter().println("Post method");
	}
	

	@Override
	public void destroy() {
		System.out.println("Destroy method");
	}

//	init 메소드는 최초 1회 한번 실행된 후 인스턴스는 서버가 종료될 때 버린다.
//	서블릿이 동작되기 전 준비할 것이 있다면 사용한다.
//	유저 상관없이 최초 실행 한번을 하고 생성된 한개의 인스턴스를 클론형태로 복제해서 다른 유저가 사용한다.
	
//	ServletConfig config 값을 입력해서 path 값을 사용할 수 있음
	@Override
	public void init(ServletConfig config) throws ServletException {
		String param = config.getInitParameter("path");
		System.out.println("init Param : "+param);
		System.out.println("init method");
	}

}
