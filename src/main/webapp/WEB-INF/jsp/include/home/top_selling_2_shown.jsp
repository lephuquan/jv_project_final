<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div class="col-md-4 col-xs-6">
	<div class="section-title">
		<h4 class="title">Top selling</h4>
		<div class="section-nav">
			<div id="slick-nav-3" class="products-slick-nav"></div>
		</div>
	</div>

	<div class="products-widget-slick" data-nav="#slick-nav-3">
		<jsp:include page="top_selling_2_shown_first.jsp" />
		<jsp:include page="top_selling_2_shown_second.jsp" />
	</div>
</div>

