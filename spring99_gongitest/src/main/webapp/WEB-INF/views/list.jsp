<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>list.jsp</title>
</head>
<body>
<h1>게시판</h1>
<a href="${pageContext.request.contextPath }/list">전체글보기</a> | <a href="${pageContext.request.contextPath }/">홈으로</a><br>
<table width="600" border="1" >
	<tr>
		<th>글번호</th>
		<th>작성자</th>
		<th>글제목</th>
		<th>글내용</th>
	</tr>
	<c:forEach var="vo" items="${list }">
		<tr>
			<td>${vo.num }</td>
			<td>${vo.writer }</td>
			<td><a href="${pageContext.request.contextPath }/detail?num=${vo.num }">${vo.title }</a></td>
			<td>${vo.content }</td>
			
			
		</tr>
	</c:forEach>
	
	
</table>
<div >
	<c:if test="${pu.prevPage }">
				<a href="${pageContext.request.contextPath }/list?pageNum=${pu.pageNum-1}&field=${field}&keyword=${keyword}"><span>이전</span></a></c:if>
	<c:forEach var="i" begin="${pu.startPageNum }" end="${pu.endPageNum }">
		
		<c:choose>
			<c:when test="${pu.pageNum==i }"><!-- 현재페이지 -->
				<a href="${pageContext.request.contextPath }/list?pageNum=${i }&field=${field}&keyword=${keyword}">
				<span style='color:blue;font-weight: bold'>[${i }]</span>
				</a>
			</c:when>
			<c:otherwise>
				<a href="${pageContext.request.contextPath }/list?pageNum=${i }&field=${field}&keyword=${keyword}">
				<span style='color:gray;'>[${i }]</span>
				</a>
				
				
			</c:otherwise>
		</c:choose>
		
     
	</c:forEach>
	<c:if test="${pu.nextPage }">
				<a href="${pageContext.request.contextPath }/list?pageNum=${pu.pageNum+1 }&field=${field}&keyword=${keyword}"><span>다음</span></a></c:if>
	

	
</div>
<div>
	<form method="post" action="${pageContext.request.contextPath }/list">
		<select name="field">
			<option value="title" <c:if test="${field=='title' }">selected</c:if> >제목</option>
			<option value="content" <c:if test="${field=='content' }">selected</c:if>>내용</option>
			<option value="cort" <c:if test="${field=='content' || field=='title' }">selected</c:if>>제목+내용</option>
		</select>
		<input type="text" name="keyword" value="${keyword }">
		<input type="submit" value="검색">
	</form>
</div>


</body>
</html>


















