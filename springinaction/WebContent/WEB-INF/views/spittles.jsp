<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>spittles</title>
</head>
<body>
	<c:forEach items="${spittleList}" var="spittle" >
		<li>
			<div class="spittleMessage">
				<c:out value="${spittle.message}" />
			</div>
			<div>
				<span class="spittleTime">
					<c:out value="${spittle.time}" />
				</span>
				<span class="spittleLocation">
					(<c:out value="${spittle.latitude}" />, <c:out value="${spittle.longitude}" />)
				</span>
			</div>
		</li>
	</c:forEach>
</body>
</html>