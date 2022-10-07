<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>	    
<!DOCTYPE html>
<%
	request.getAttribute("movie2");
%>
									<c:set var="grade" value="${movie2.review.r_grade}"/>
									<!--평점이 없는경우  -->
									<c:if test="${grade==null }">
										<a style="font-size: 15pt; color:#0DEEC9">리뷰가 없어요!</a> 
									</c:if>
									<!--평점 0점 이상 20점 미만일 경우  -->
									<c:if test="${grade ge 0 && grade lt 20}">
										 <i class="ion-ios-star"></i>
										 <i class="ion-ios-star-outline"></i> 
										 <i class="ion-ios-star-outline"></i> 
										 <i class="ion-ios-star-outline"></i> 
										 <i class="ion-ios-star-outline"></i> 
									</c:if>
									<!--평점 20점 이상 40점 미만일 경우  -->
									<c:if test="${grade ge 20 && grade lt 40}">
										 <i class="ion-ios-star"></i>
										 <i class="ion-ios-star"></i>
										 <i class="ion-ios-star-outline"></i> 
										 <i class="ion-ios-star-outline"></i> 
										 <i class="ion-ios-star-outline"></i> 
									</c:if>
									<!--평점 40점 이상 60점 미만일 경우  -->
									<c:if test="${grade ge 40 && grade lt 60}">
										 <i class="ion-ios-star"></i>
										 <i class="ion-ios-star"></i>
										 <i class="ion-ios-star"></i>
										 <i class="ion-ios-star-outline"></i> 
										 <i class="ion-ios-star-outline"></i> 
									</c:if>
									<!--평점 60점 이상 80점 미만일 경우  -->
									<c:if test="${grade ge 60 && grade lt 80}">
										 <i class="ion-ios-star"></i>
										 <i class="ion-ios-star"></i>
										 <i class="ion-ios-star"></i>
										 <i class="ion-ios-star"></i>
										 <i class="ion-ios-star-outline"></i> 
									</c:if>
									<!-- 평점 80점 이상인 경우 -->
									<c:if test="${grade ge 80 }">
										<i class="ion-ios-star"></i>
										<i class="ion-ios-star"></i>
										<i class="ion-ios-star"></i>
										<i class="ion-ios-star"></i>
										<i class="ion-ios-star"></i>
									</c:if>
								