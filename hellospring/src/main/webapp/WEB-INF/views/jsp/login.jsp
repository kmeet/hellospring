<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="en">
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- Meta, title, CSS, favicons, etc. -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>Club Login</title>

    <!-- Bootstrap -->
    <spring:url value="/resources/core/vendors/bootstrap/dist/css/bootstrap.min.css" var="bootstrapCss"/>
    <link href="${bootstrapCss}" rel="stylesheet">
    <!-- Font Awesome -->
    <spring:url value="/resources/core/vendors/font-awesome/css/font-awesome.min.css" var="fontAwesomeCss"/>
    <link href="${fontAwesomeCss}" rel="stylesheet">
    <!-- NProgress -->
    <spring:url value="/resources/core/vendors/nprogress/nprogress.css" var="nProgressCss"/>
    <link href="${nProgressCss}" rel="stylesheet">
    <!-- Animate.css -->
    <spring:url value="/resources/core/vendors/animate.css/animate.min.css" var="animateCss"/>
    <link href="${animateCss}" rel="stylesheet">

    <!-- Custom Theme Style -->
    <spring:url value="/resources/core/build/css/custom.min.css" var="customThemeCss"/>
    <link href="${customThemeCss}" rel="stylesheet">
    <spring:url value="/login" var="loginUrl"/>
    <spring:url value="/signup" var="signUpUrl"/>
  </head>

  <body class="login">
    <div>
      <a class="hiddenanchor" id="signup"></a>
      <a class="hiddenanchor" id="signin"></a>

      <div class="login_wrapper">
        <div class="animate form login_form">
          <section class="login_content">
            <form:form class="login-form" method="post" modelAttribute="loginForm" action="${loginUrl}">
              <h1>BoHO Login</h1>
              <div>
                <input type="text" class="form-control" name="userName" value="${user.userName}" placeholder="Username" required="" />
              </div>
              <div>
                <input type="password" name="password" value="${user.password}" class="form-control" placeholder="Password" required="" />
              </div>
              <div>
              	<input type="submit" class="btn btn-default submit" value="Login" />
                <!-- <a class="btn btn-default submit" href="index.html">Log in</a> -->
                <a class="reset_pass" href="#">Lost your password?</a>
              </div>

              <div class="clearfix"></div>

              <div class="separator">
                <p class="change_link">New to site?
                  <a href="#signup" class="to_register"><b> Create Account </b></a>
                </p>

                <div class="clearfix"></div>
                <br />

                <div>
                  <h1><span class="glyphicon glyphicon-education" aria-hidden="true"/> Brains of Highest Orders!</h1>
                  <p>©MeetK 2016 All Rights Reserved.</p>
                </div>
              </div>
            </form:form>
          </section>
        </div>

        <div id="register" class="animate form registration_form">
          <section class="login_content">
            <form:form class="login-form" method="post" modelAttribute="loginForm" action="${signUpUrl}">
              <h1>Create Account</h1>
              <div>
                <input type="text" name="userName" value="${user.userName}" class="form-control" placeholder="Username" required="" />
              </div>
              <div>
                <input type="email" name="primaryEmailId" value="${user.primaryEmailId}" class="form-control" placeholder="Email" required="" />
              </div>
              <div>
                <input type="password" name="password" value="${user.password}" class="form-control" placeholder="Password" required="" />
              </div>
              <div>
                <input type="submit" class="btn btn-default" value="Create My Account"/>
              </div>

              <div class="clearfix"></div>

              <div class="separator">
                <p class="change_link">Already a member ?
                  <a href="#signin" class="to_register"> Log in </a>
                </p>

                <div class="clearfix"></div>
                <br/>

                <div>
                  <h1><span class="glyphicon glyphicon-education" aria-hidden="true"/> Brains of Highest Orders!</h1>
                  <p>©MeetK 2016 All Rights Reserved.</p>
                </div>
              </div>
            </form:form>
          </section>
        </div>
      </div>
    </div>
  </body>
</html>