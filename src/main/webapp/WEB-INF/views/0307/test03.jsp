<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<c:set var="ctp" value="${pageContext.request.contextPath }" />
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>test03.jsp</title>
	<jsp:include page="/WEB-INF/views/include/bs5.jsp" />
</head>
<body>
<p><br/></p>
<div class="container">
	<h2>성적 계산</h2>
	<div>
		<c:if test="${!empty gradeCalcList }">
			<hr/>
			<table class="table table-hover">
		        <thead class="table-secondary">
			        <tr>
			            <th>성명</th>
			            <th>합계</th>
			            <th>평균</th>
			            <th>학점</th>
			        </tr>
		        </thead>
		        <c:forEach var="vo" items="${gradeCalcList}">
					<tr>
					    <td>${vo.name}</td>
					    <td>${vo.tot}</td>
					    <td><fmt:formatNumber value="${vo.avg}" pattern="0.0"/></td>
					    <td>${vo.grade}</td>
					</tr>
		        </c:forEach>
		    </table>
		</c:if>
		<c:if test="${empty gradeCalcList }">
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