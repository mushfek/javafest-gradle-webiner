<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>BDT To USD Converter</title>
</head>
<body>
    <div align="center">
        <form action="<c:url value='convert.do'/>" method="post">
            Amount in BDT<input type="number" step="any" name="bdt"> <br>
            <input type="submit" value="Convert">
        </form>
    </div>
</body>
</html>