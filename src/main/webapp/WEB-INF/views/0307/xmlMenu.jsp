<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctp" value="${pageContext.request.contextPath }" />
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>xmlMenu.jsp</title>
	<jsp:include page="/WEB-INF/views/include/bs5.jsp" />
</head>
<body>
<p><br/></p>
<div class="container"> 
	<h2>XML파일 연습</h2>
	<hr>
	<div>
		<a href="${ctp }/0307/test02" class="mb-2 btn btn-success" >주입된 성적 보기</a>
		<a href="${ctp }/0307/test03" class="mb-2 btn btn-primary" >성적 계산</a>
		<a href="${ctp }/0307/test04" class="mb-2 btn btn-info" >JDBC정보 보기</a>
		<a href="${ctp }/0307/test05" class="mb-2 btn btn-secondary" >비만도 구하기</a>
	</div>
	<hr>
	<div><a href="${ctp }" class="btn btn-warning btn-sm">돌아가기</a></div>
</div>
<p><br/></p>
</body>
</html>