<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<jsp:include page="include/product/head.jsp" />
<body>
	<header>
		<jsp:include page="include/product/body_header_top.jsp" />
		<jsp:include page="include/product/body_header_search.jsp" />
	</header>
	<jsp:include page="include/product/body_header_navigation.jsp" />
	<jsp:include page="include/product/navigation_products.jsp" />
	<div class="section">
		<div class="container">
			<jsp:include page="include/product/product_images.jsp" />
			<jsp:include page="include/product/product_detail.jsp" />
			<jsp:include page="include/product/product_info_navigation.jsp" />
		</div>
	</div>
	<jsp:include page="include/product/related_product.jsp" />
	<jsp:include page="include/product/news_letter.jsp" />
	<jsp:include page="include/product/footer.jsp" />
	<jsp:include page="include/product/js.jsp" />

</body>
</html>