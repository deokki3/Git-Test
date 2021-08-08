<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>detail.jsp</title>
</head>
<body>
<table border="1" width="500">
	<tr>
		<td>글번호</td><td>${vo.num }</td>
	</tr>
	<tr>
		<td>작성자</td><td>${vo.writer }</td>
	</tr>
	<tr>
		<td>글제목</td><td>${vo.title }</td>
	</tr>
	<tr>
		<td>글내용</td><td>${vo.content }</td>
	</tr>
	<tr>
		<fmt:formatDate value="${vo.regdate }" pattern="YYYY/MM/dd HH:mm:ss" var="regdate"/>
		<td>작성일</td><td>${regdate }</td>
	</tr>
	<tr>
		<td>다음글</td><td><a href="${pageContext.request.contextPath }/detail?num=${next.num }">${next.title }</a></td>
	</tr>
	<tr>
		<td>이전글</td><td><a href="${pageContext.request.contextPath }/detail?num=${prev.num }">${prev.title }</a></td>
	</tr>
	<tr>
	<td>삭제하기</td><td><a href="${pageContext.request.contextPath }/delete?num=${vo.num }">삭제</a><td>
	</tr>
</table>
</body>
</html>









