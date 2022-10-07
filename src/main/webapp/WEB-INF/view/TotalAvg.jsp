<%@page import="com.itflix.dto.Movie"%>
<%@page import="ch.qos.logback.core.recovery.ResilientSyslogOutputStream"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>	    
<!DOCTYPE html>
<%
	request.getAttribute("movie2");
%>
	
	<!--single값 설정  -->
	<c:set var="grades" value="${movie2.review.r_grade}"/>
	<!--MovieSingle 페이지 별점 계산 -->
	<!--평점이 없는경우  -->
	<c:if test="${grades==null }">
		<a style="font-size: 10pt; color:#0DEEC9">x</a> 
	</c:if>
	<!--평점 0점 이상 20점 미만일 경우  -->
	<c:if test="${grades ge 0 && grades lt 20}">
		 <a style="font-size: 15pt; color:#0DEEC9">0</a> 
	</c:if>
	<!--평점 20점 이상 40점 미만일 경우  -->
	<c:if test="${grades ge 20 && grades lt 40}">
		 <a style="font-size: 15pt; color:#0DEEC9">1</a> 
	</c:if>
	<!--평점 40점 이상 60점 미만일 경우  -->
	<c:if test="${grades ge 40 && grades lt 60}">
		<a style="font-size: 15pt; color:#0DEEC9">2</a> 
	</c:if>
	<!--평점 60점 이상 80점 미만일 경우  -->
	<c:if test="${grades ge 60 && grades lt 80}">
		<a style="font-size: 15pt; color:#0DEEC9">3</a> 
	</c:if>
	<!--평점 80점 이상 90점 미만일 경우  -->
	<c:if test="${grades ge 80 && grades lt 90}">
		<a style="font-size: 15pt; color:#0DEEC9">4</a> 
	</c:if>
	<!-- 평점 100점 이상인 경우 -->
	<c:if test="${grades eq 100}">
		<a style="font-size: 12pt; color:#0DEEC9">5</a> 
	</c:if>
	




	<!--Main 페이지 별점 계산 -->	
	
	
	
	
							