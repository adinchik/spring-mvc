<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>

<html>
<body>
<h1>Welcome page</h1>

<%--<h1> ${products[0].title}</h1>--%>

<%--, ${name}.--%>

<ul>
    <c:forEach var="item" items="${products.products}">
        <li>${item.id}</li>
        <li>${item.title}</li>
        <li>${item.cost}</li>
    </c:forEach>
</ul>

<%--<ul>--%>
    <%--<c:forEach var="item" items="${products}">--%>
        <%--<li>${item.title}</li>--%>
    <%--</c:forEach>--%>
<%--</ul>--%>

</body>
</html>