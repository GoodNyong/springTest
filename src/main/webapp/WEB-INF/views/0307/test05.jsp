<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<c:set var="ctp" value="${pageContext.request.contextPath }" />
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>test05.jsp</title>
	<jsp:include page="/WEB-INF/views/include/bs5.jsp" />
</head>
<body>
<p><br/></p>
<div class="container">
	<h2>비만도 계산하기</h2>
	<div>
		<c:if test="${!empty bmiList }">
			<hr/>
			<table class="table table-hover">
		        <thead class="table-secondary">
			        <tr>
			            <th>성명</th>
			            <th>키(cm)</th>
			            <th>체중(kg)</th>
			            <th>BMI</th>
			            <th>결과</th>
			        </tr>
		        </thead>
		        <c:forEach var="vo" items="${bmiList}">
					<tr>
						<td>${vo.name}</td>
		                <td>${vo.height}</td>
		                <td>${vo.weight}</td>
					    <td><fmt:formatNumber value="${vo.bmi}" pattern="0.0"/></td>
		                <td>${vo.result}</td>
					</tr>
		        </c:forEach>
		    </table>
		</c:if>
		<c:if test="${empty bmiList }">
			<hr>
			<p>주입된 데이터을 찾을 수 없습니다.</p>
		</c:if>
	</div>	
	<hr/>
	 <h3>새로운 BMI 추가</h3>
    <form method="post">
        <label>이름: </label>
        <input type="text" name="name" required><br><br>
        
        <label>키 (cm): </label>
        <input type="text" name="height" required><br><br>
        
        <label>체중 (kg): </label>
        <input type="text" name="weight" required><br><br>

        <input type="submit" value="추가">
    </form>
	<hr/>
	<div><a href="${ctp }/0307/xmlMenu" class="btn btn-warning btn-sm">돌아가기</a></div>
</div>
<p><br/></p>
</body>
</html>