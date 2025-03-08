<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctp" value="${pageContext.request.contextPath }" />
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>aopMenu.jsp</title>
	<jsp:include page="/WEB-INF/views/include/bs5.jsp" />
	<script>
	'use strict';
	
	function calc(){
		let num = prompt("수를 입력하세요");
		location.href = "${ctp}/aop/aopTest02?num="+num;
	}
	</script>
</head>
<body>
<p><br/></p>
<div class="container"> 
	<h2>AOP 연습</h2>
	<div>Aspect Oriented Programing : 관점 지향 프로그래밍</div>
	<div>어떤 로직을 기준으로 핵심적인 관점, 부가적인 관점으로 나누어, 그 기준으로 각각을 모듈화하여 분석</div>
	<hr/>
	<div>
		<a href="${ctp }/aop/aopTest01" class="btn btn-success btn-sm">로그찍기</a>
		<a href="javascript:calc()" class="btn btn-primary btn-sm">1~?합</a>
		<a href="${ctp }/aop/aopTest03" class="btn btn-info btn-sm">1~1000000까지짝수합(for)</a>
		<a href="${ctp }/aop/aopTest04" class="btn btn-warning btn-sm">1~1000000까지짝수합(while)</a>
		<hr/>
		<a href="${ctp }" class="btn btn-outline-success btn-sm">돌아가기</a>
	</div>
</div>
<p><br/></p>
</body>
</html>