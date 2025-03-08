<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctp" value="${pageContext.request.contextPath }" />
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>test12.jsp</title>
	<jsp:include page="/WEB-INF/views/include/bs5.jsp" />
</head>
<body>
<p><br/></p>
<div class="container"> 
	<h2>이곳은 test12.jsp 입니다.</h2>
	<hr/>
	<%-- <div><a href="${ctp}/0306/test10_OK/i1234" class="btn btn-success btn-sm mb-2">홍길동(인사과)</a></div>
	<div><a href="${ctp}/0306/test10_OK/c2345" class="btn btn-primary btn-sm mb-2">김말숙(총무과)</a></div>
	<div><a href="${ctp}/0306/test10_OK/s3456" class="btn btn-info btn-sm mb-2">이기자(생산과)</a></div> --%>
	<form method="post">
		<div class="input-group mb-3">
			<div class="input-group-text">사번 :</div> 
			<input type="text" name="eid" class="form-control" required>
		</div>
		<div class="input-group mb-3">
			<div class="input-group-text">성명 :</div>
			<input type="text" name="name" class="form-control" required>
		</div>
		<div><input type="submit" value="회원가입" class="btn btn-success form-control mb-3"></div>
	</form>
	<div>
		<c:if test="${!empty vo }">
			<hr/>
			<div>성 명 : ${vo.name }</div>
			<div>부서명 : ${vo.team }</div>
			<div>사 번 : ${vo.eid }</div>
		</c:if>
	</div>
	<hr>
	<div><a href="${ctp }" class="btn btn-warning btn-sm">돌아가기</a></div>
</div>
<p><br/></p>
</body>
</html>