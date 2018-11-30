<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page session="false" %>
<html>
<head>
	<%@ include file="../tpl/header.jsp" %>
</head>
<body>
<div class="container">
<%@ include  file="../tpl/nav.jsp" %>

      <!-- Jumbotron -->
      <div class="jumbotron">
        <h2>${title}</h2>
          <h3>Изменение итератор</h3>
          <h3>еще изменение итератор</h3>
          <h3>теперь мои изменения</h3>
          <h3>и ещё раз итератор</h3>
          <h3>и ещё раз я</h3>
      </div>

<%@ include  file="../tpl/footer.jsp" %>
</div>
</body>
</html>

