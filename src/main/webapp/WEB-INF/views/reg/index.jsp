<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<%@ page session="false" %>

<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<%@ include file="../tpl/header.jsp" %>
</head>
<body>
<div class="container">
<%@ include  file="../tpl/nav.jsp" %>
      <!-- Jumbotron -->
      <div class="jumbotron">
          <h2>${title }</h2>
          <div id = "reg_form">
              <form:form method="POST" action="reg" commandName = "user" class="box-login" accept-charset="utf-8">        
        	      <fieldset class="boxBody">
        	    	  <div class="form-group">
        		    	  <form:label path="login" >Логин:</form:label>
        		    	  <form:input class="form-control" path = "login"  />
				      </div>
        	    	  <div class="form-group">
        			      <form:label path="passw1" >Пароль:</form:label>
        			      <form:input class="form-control" path = "passw1"  />
				      </div>
				      <div class="form-group">
        		    	  <form:label path="passw2" >Повтор:</form:label>
        			      <form:input class="form-control" path = "passw2"  />
				      </div>
				      <div class="form-group">
        			      <form:label path="email" >E-Mail:</form:label>
        			      <form:input class="form-control" path = "email"  />
				      </div>
				      <div class="form-check">
  					      <input type="checkbox" class="form-check-input" id="exampleCheck1">
   					      <label class="form-check-label" for="exampleCheck1">Запомнить меня</label>
 				      </div>
                          <input type="submit" class="btn btn-primary" value="Отправить">
                          <input type="reset" class="btn btn-primary" value="Сбросить">
               	  </fieldset>      
              </form:form>
          </div>
      </div>

<%@ include  file="../tpl/footer.jsp" %>
</div>
</body>
</html>
