<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div id="aside" class="col-md-3">
	<jsp:include page="./product_category_filer.jsp" />
	<jsp:include page="./product_price_filer.jsp" />
	<jsp:include page="./product_brand_filer.jsp" />
	<jsp:include page="top_selling.jsp" />
</div>