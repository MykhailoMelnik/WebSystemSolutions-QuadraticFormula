<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<body>
<br>
<h2>
    ${coefficients.cofA}x^2 + ${coefficients.cofB}x + ${coefficients.cofC} = ${coefficients.calculateQuadraticFormula()}
    <form:form action="return">
        <input type="submit" value="Вернуться">
    </form:form>
</h2>
</body>

</html>