<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 디렉티브 -->    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%
	int k =100;
	if(k >10) {
		out.println("k는 10보다 큽니다.");
	}
%>
<hr>
<%
	pageContext.setAttribute("k",1);
%>
<c:set scope="page" var="k" value="100" />

<c:if test="<%=k>10 %>">
	k는 10보다 큽니다.
</c:if>
<hr>
<c:if test="${k>50 }">
	k는 50보다 큽니다.
</c:if>