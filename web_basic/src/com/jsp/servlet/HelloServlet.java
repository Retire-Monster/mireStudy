package com.jsp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/hello.html")
public class HelloServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		http://localhost/web_basic/hello.html?message=good day&who=david  ↓아래 파라미터 값을 URL로 직접 넣어 명령을 실행할 때
//		Parameter 는 set 을 할 수없다. 사용자가 준 값을 사용하는 것임으로
//		setAttribute 를 통해 내부적으로 처리하는 값을 jsp로 넘길 수 있다.
//		이러한 패턴을 mvc2 패턴이라 한다.
		
		request.setAttribute("method", "GET!");
		
		request.getRequestDispatcher("/WEB-INF/views/hello.jsp").forward(request, response); // 사용자가 준 값을 JSP에 넘기기

		System.out.println("doGet 실행됨");

	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setAttribute("method", "POST!");
		
		request.getRequestDispatcher("/WEB-INF/views/hello.jsp").forward(request, response); // 사용자가 준 값을 JSP에 넘기기
		
		System.out.println("doPost 실행됨");
	}
	
	@Override
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setAttribute("method", "DELETE!");
		
		request.getRequestDispatcher("/WEB-INF/views/hello.jsp").forward(request, response); // 사용자가 준 값을 JSP에 넘기기
		
		System.out.println("doDelete 실행됨");

	}
}
//====================================================================================================================================//
//
//	아래는 자바로만 실행할 때
//
//====================================================================================================================================//
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		String message = request.getParameter("message");
//		String who = request.getParameter("who");
//		
//		PrintWriter out = response.getWriter();
//		out.println("<!DOCTYPE html>");
//		out.println("<html>");
//		out.println("<head>");
//		out.println("<title>Echo message</title>");
//		out.println("</head>");
//		out.println("<body>");
//		out.println("<h1>metho : POST</h1>");
//		out.println("<h1>To : "+who+"</h1>");
//		out.println("<h1> Message : "+message+"</h1>");
//		out.println("</body>");
//		out.println("</html>");
//		
//		System.out.println("doPost 실행됨");
//	}
//	
//	@Override
//	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		String message = request.getParameter("message");
//		String who = request.getParameter("who");
//		
//		System.out.println("doDelete 실행됨");
//		
//		PrintWriter out = response.getWriter();
//		out.println("<!DOCTYPE html>");
//		out.println("<html>");
//		out.println("<head>");
//		out.println("<title>Echo message</title>");
//		out.println("</head>");
//		out.println("<body>");
//		out.println("<h1>metho : DELETE</h1>");
//		out.println("<h1>To : "+who+"</h1>");
//		out.println("<h1> Message : "+message+"</h1>");
//		out.println("</body>");
//		out.println("</html>");
//	}
//}
//====================================================================================================================================//