<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%
	int sum = 0;
	for (int i = 1; i < 11; i++) {
		sum += i;
	}

	out.println("1부터 10까지 더한 값 : " + sum );
%>

<hr/>

<!-- scope="page"는 주지 않으면 page 임 -->
<c:set var="sum" value="0" />
<!-- forEach의 i는 지역변수가 아닌 page의 전역변수임 -->
<c:forEach var="i" begin="1" end="10" step="1">
	<c:set var="sum" value="${sum+i }"/>
</c:forEach>
1부터 10까지 더한 값 : ${sum }

<hr/>

집합체 반복문
<%
	int[] k = {1,2,3,4,5,6,7};
	int summ = 0;
	for (int i : k) {
		summ += i;
	}

	out.println("{1, 2, 3, 4, 5, 6, 7} 더한 값 : " + summ );
%>

<hr/>

<c:set var="k" value="1,2,3,4,5,6,7" />
<c:set var="summ" value="0" />
<c:forEach var="i" items="${k }" 	>
	<c:set var="summ" value="${summ+i }" />
</c:forEach>

"{1, 2, 3, 4, 5, 6, 7} 더한 값 : ${summ }"
