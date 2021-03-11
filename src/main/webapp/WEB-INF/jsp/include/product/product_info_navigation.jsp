<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div class="col-md-12">
	<div id="product-tab">
		<!-- product tab nav -->
		<ul class="tab-nav">
			<li class="active"><a data-toggle="tab" href="#tab1">Description</a></li>
			<li><a data-toggle="tab" href="#tab2">Details</a></li>
			<li><a data-toggle="tab" href="#tab3">Reviews (3)</a></li>
		</ul>
		<div class="tab-content">
			<jsp:include page="./product_info_description.jsp" />
			<jsp:include page="./product_info_detail.jsp" />
			<jsp:include page="./product_info_review.jsp" />
		</div>
	</div>
</div>