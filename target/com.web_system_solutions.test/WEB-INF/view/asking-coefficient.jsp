<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<body>
<br>
<h2>ax^2 + bx + c = 0</h2>
<br>
<form:form action="showResult" modelAttribute="coefficients">
    a = <form:input path="cofA" size="5"/><form:errors path="cofA"/>
    <br>
    b = <form:input path="cofB" size="5"/>
    <br>
    c = <form:input path="cofC" size="5"/>
    <input type="submit" value="рассчитать">
</form:form>
</body>
</html>