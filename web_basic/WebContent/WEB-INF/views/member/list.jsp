<%@page import="com.jsp.dto.MemberVO"%>
<%@page import="com.sun.xml.internal.bind.v2.schemagen.xmlschema.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 
	<% out.println(request.getAttribute("memberList")); %>
	<hr>
	<%=request.getAttribute("memberList") %>
	<hr>
	${requestScope.memberList }
	<hr>
	${memberList }
--><!--표에서 라벨을 줄때는 th-->
	<table border="1">
		<tr>
			<th>아이디</th>
			<th>패스워드</th>
			<th>이름</th>
			<th>이메일</th>
			<th>전화번호</th>
		</tr>
		
		<!-- JSP의 임포트 명령어 Shift + Ctrl + M -->
<%--	<%
			List<MemberVO> memberLis
				= (ArrayList<MemberVO>)request.getAttribute("memberList");
			if(memberList != null) for(MemberVO member : memberList){
				pageContext.setAttribute("member", member);
		%>--%>
		<!-- not 의 표현 'empty' <-값 0, null, len -->
		<c:if test="${not empty memberList }">
			<c:forEach var="member" items="${memberList }">
				<tr>
					<td>${member.id }</td>
					<td>${member.pwd }</td>
					<td>${member.name }</td>
					<td>${member.email }</td>
					<td>${member.phone }</td>
				</tr>
			</c:forEach>
		</c:if>

	</table>

</body>
</html>