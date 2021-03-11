<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div class="aside">
	<h3 class="aside-title">Top selling</h3>
	<div class="product-widget">
		<div class="product-img">
			<img src="<c:url value="resources/images/product01.png"/>" alt="">
		</div>
		<div class="product-body">
			<p class="product-category">Category</p>
			<h3 class="product-name">
				<a href="#">product name goes here</a>
			</h3>
			<h4 class="product-price">
				$980.00
				<del class="product-old-price">$990.00</del>
			</h4>
		</div>
	</div>

	<div class="product-widget">
		<div class="product-img">
			<img src="<c:url value="resources/images/product02.png"/>" alt="">
		</div>
		<div class="product-body">
			<p class="product-category">Category</p>
			<h3 class="product-name">
				<a href="#">product name goes here</a>
			</h3>
			<h4 class="product-price">
				$980.00
				<del class="product-old-price">$990.00</del>
			</h4>
		</div>
	</div>

	<div class="product-widget">
		<div class="product-img">
			<img src="<c:url value="resources/images/product03.png"/>" alt="">
		</div>
		<div class="product-body">
			<p class="product-category">Category</p>
			<h3 class="product-name">
				<a href="#">product name goes here</a>
			</h3>
			<h4 class="product-price">
				$980.00
				<del class="product-old-price">$990.00</del>
			</h4>
		</div>
	</div>
</div>