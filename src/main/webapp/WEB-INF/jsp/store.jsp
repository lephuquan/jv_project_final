<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<jsp:include page="include/store/head.jsp" />
<body>
	<header>
		<jsp:include page="include/store/body_header_top.jsp" />
		<jsp:include page="include/store/body_header_search.jsp" />
	</header>
	<jsp:include page="include/store/body_header_navigation.jsp" />
	<jsp:include page="include/store/navigation_store.jsp" />
	<div class="section">
		<div class="container">
			<div class="row">
				<jsp:include page="include/store/product_filter.jsp" />
				<jsp:include page="include/store/store_product.jsp" />
			</div>
		</div>
	</div>
	<jsp:include page="include/store/news_letter.jsp" />
	<jsp:include page="include/store/footer.jsp" />
	<jsp:include page="include/store/js.jsp" />
</body>
</html>