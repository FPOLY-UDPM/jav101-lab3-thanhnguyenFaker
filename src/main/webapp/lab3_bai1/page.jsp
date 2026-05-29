<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%-- Thư viện JSTL Core chuẩn giúp lặp dữ liệu --%>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>BÀI 1: ĐỔ DỮ LIỆU VÀO SELECT BOX</title>
</head>
<body>

<h2>Chọn quốc gia của bạn:</h2>
<form>
    <select name="country">
        <%-- Vòng lặp duyệt qua list "countries" được truyền từ Servlet --%>
        <c:forEach var="ct" items="${countries}">
            <option value="${ct.id}">${ct.name}</option>
        </c:forEach>
    </select>
</form>

</body>
</html>