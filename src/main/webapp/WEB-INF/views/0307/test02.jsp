<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctp" value="${pageContext.request.contextPath }" />
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>test02.jsp</title>
	<jsp:include page="/WEB-INF/views/include/bs5.jsp" />
</head>
<body>
<p><br/></p>
<div class="container">
	<h2>주입된 성적 보기</h2>
	<div>
		<c:if test="${!empty gradeMap }">
			<hr/>
			<table class="table table-hover">
		        <thead class="table-secondary">
			        <tr>
			            <th>성명</th>
			            <th>국어</th>
			            <th>영어</th>
			            <th>수학</th>
			        </tr>
		        </thead>
		        <c:forEach var="entry" items="${gradeMap}">
					<tr>
					    <td>${entry.value.name}</td>
					    <td>${entry.value.kor}</td>
					    <td>${entry.value.eng}</td>
					    <td>${entry.value.math}</td>
					</tr>
		        </c:forEach>
		    </table>
		</c:if>
		<c:if test="${empty gradeMap }">
			<hr>
			<p>주입된 성적을 찾을 수 없습니다.</p>
		</c:if>
	</div>	
	<hr/>
	<div><a href="${ctp }/0307/xmlMenu" class="btn btn-warning btn-sm">돌아가기</a></div>
</div>
<p><br/></p>
</body>
</html>