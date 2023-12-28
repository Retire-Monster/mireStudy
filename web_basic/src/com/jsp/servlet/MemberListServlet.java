package com.jsp.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dto.MemberVO;

@WebServlet("/member/list")
public class MemberListServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<MemberVO> memberList = new ArrayList<MemberVO>();
		String url = "/WEB-INF/views/member/list.jsp";

		for (int i = 0; i < 20; i++) {
			String text = "m" + i;
			MemberVO member = new MemberVO(text, text, text, text, text);

			memberList.add(member);

		}

		request.setAttribute("memberList", memberList);
		request.getRequestDispatcher(url).forward(request, response);

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
