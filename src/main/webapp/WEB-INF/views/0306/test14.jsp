<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctp" value="${pageContext.request.contextPath }" />
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>test14.jsp</title>
	<jsp:include page="/WEB-INF/views/include/bs5.jsp" />
	<script>
		if(${!empty message}) alert("${message}");
	</script>
</head>
<body>
<p><br/></p>
<div class="container"> 
	<h2>이곳은 test14.jsp 입니다.</h2>
	<div>정회원의 사번은 첫글자가 'i/c/s'로 시작해야합니다.</div>
	<hr/>
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
	<hr/>
	<div><a href="${ctp }" class="btn btn-warning btn-sm">돌아가기</a></div>
</div>
<p><br/></p>
</body>
</html>