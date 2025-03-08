<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctp" value="${pageContext.request.contextPath }" />
<html>
<head>
	<title>Home</title>
	<jsp:include page="/WEB-INF/views/include/bs5.jsp" />
</head>
<body>
<p><br/></p>
<div class="container">
	<h1>Hello world!</h1>
	<P>  The time on the server is ${serverTime}. </P>
	<hr/>
	<input type="button" value="새로고침" onclick="location.reload();" class="btn btn-success"/>
	<a href="${ctp }/logTest" class="btn btn-primary">로그연습</a>
	<a href="${ctp }/aop/aopMenu" class="btn btn-info">AOP연습</a>
	<hr/>
	<h2>Folder:0306</h2>
	<div>
		<a href="${ctp}/0306/test01" class="mb-2 btn btn-success btn-sm">test01.jsp</a>
		<a href="${ctp}/0306/test02" class="mb-2 btn btn-primary btn-sm">test02.jsp</a>
		<a href="${ctp}/0306/test03" class="mb-2 btn btn-info btn-sm">test03.jsp</a>
		<a href="${ctp}/0306/test04" class="mb-2 btn btn-secondary btn-sm">test04.jsp</a>
		<a href="${ctp}/0306/test05" class="mb-2 btn btn-warning btn-sm">test05.jsp</a>
		<a href="${ctp}/0306/test06" class="mb-2 btn btn-danger btn-sm">test06.jsp</a>
		<a href="${ctp}/0306/test07" class="mb-2 btn btn-dark btn-sm">test07.jsp</a>
		<a href="${ctp}/0306/test08" class="mb-2 btn btn-light btn-sm">test08.jsp</a>
		<a href="${ctp}/0306/test09" class="mb-2 btn btn-outline-success btn-sm">test09.jsp</a>
		<a href="${ctp}/0306/test10" class="mb-2 btn btn-outline-primary btn-sm">test10.jsp</a>
		<a href="${ctp}/0306/test11" class="mb-2 btn btn-outline-info btn-sm">test11.jsp</a>
		<a href="${ctp}/0306/test12" class="mb-2 btn btn-outline-secondary btn-sm">test12.jsp</a>
		<a href="${ctp}/0306/test13" class="mb-2 btn btn-outline-warning btn-sm">test13.jsp</a>
		<a href="${ctp}/0306/test14" class="mb-2 btn btn-outline-danger btn-sm">test14.jsp</a>
	</div>
	<hr/>
	<h2>Folder:0307</h2>
	<div>
		<a href="${ctp }/0307/test01" class="btn btn-success btn-sm">test01.jsp</a>
		<a href="${ctp }/0307/xmlMenu" class="btn btn-primary btn-sm">XML연습</a>
		<%-- <a href="${pageContext.request.contextPath }/0307/test1">test1.jsp</a> --%>
	</div>
	<hr/>
</div>
<p><br/></p>
</body>
</html>
