<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 8/6/19
  Time: 8:49 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <jsp:include page="meta.jsp"/>
    <title>AutoBazar.az Registration Page</title>
    <jsp:include page="css.jsp"/>
</head>

<body>

<!--=================================
  loading -->

<div id="loading">
    <div id="loading-center">
        <img src="images/loader.gif" alt="">
    </div>
</div>

<!--=================================
  loading -->


<!--=================================
 header -->

<header id="header" class="defualt">
    <jsp:include page="topbar.jsp"/>

    <jsp:include page="menu.jsp"/>
</header>

<!--=================================
 header -->


<!--=================================
 inner-intro -->

<section class="inner-intro bg-1 bg-overlay-black-70">
    <div class="container">
        <div class="row text-center intro-title">
            <div class="col-md-6 text-md-left d-inline-block">
                <h1 class="text-white">Register </h1>
            </div>
            <div class="col-md-6 text-md-right float-right">
                <ul class="page-breadcrumb">
                    <li><a href="#"><i class="fa fa-home"></i> Home</a> <i class="fa fa-angle-double-right"></i></li>
                    <li><a href="#">pages</a> <i class="fa fa-angle-double-right"></i></li>
                    <li><span>Register</span> </li>
                </ul>
            </div>
        </div>
    </div>
</section>

<!--=================================
 inner-intro -->


<!--=================================
 register-form  -->

<section class="register-form page-section-ptb">
    <div class="container">
        <div class="row justify-content-center">
            <div class="col-md-10">
                <div class="section-title">
                    <span>Welcome to </span>
                    <h2>AutoBazar.az</h2>
                    <div class="separator"></div>
                </div>
            </div>
        </div>
        <div class="row justify-content-center">
            <div class="col-lg-8 col-md-12">
                <form method="post" action="register">
                    <div class="gray-form">
                    <div class="row">
                        <div class="form-group col-md-6">
                            <label>Your Name*</label>
                            <c:choose>
                                <c:when test="${not empty requestScope.registrationErrorMap.name}">
                                    <input class="form-control" type="text" placeholder="Your Name" name="name" value="${requestScope.registrationForm.name}">
                                </c:when>
                                <c:otherwise>
                                    <input class="form-control" type="text" placeholder="Your Name" name="name">
                                </c:otherwise>
                            </c:choose>
                            <c:forEach items="${requestScope.registrationErrorMap.name}" var="error">
                                ${error} <br/>
                            </c:forEach>
                        </div>
                        <div class="form-group col-md-6">
                            <label>Surname*</label>
                            <c:choose>
                                <c:when test="${not empty requestScope.registrationErrorMap.surname}">
                                    <input class="form-control" type="text" placeholder="Surname" name="surname" value="${requestScope.registrationForm.surname}">
                                </c:when>
                                <c:otherwise>
                                    <input class="form-control" type="text" placeholder="Surname" name="surname">
                                </c:otherwise>
                            </c:choose>
                            <c:forEach items="${requestScope.registrationErrorMap.surname}" var="error">
                                ${error} <br/>
                            </c:forEach>
                        </div>
                    </div>
                    <div class="form-group">
                        <label>Email *</label>
                        <c:choose>
                            <c:when test="${not empty requestScope.registrationErrorMap.email}">
                                <input  class="form-control" type="text" placeholder="Enter your email" id = "email" name="email" value="${requestScope.registrationForm.email}">
                            </c:when>
                            <c:otherwise>
                                <input  class="form-control" type="text" placeholder="Enter your email" id = "email" name="email">
                            </c:otherwise>
                        </c:choose>
                        <c:forEach items="${requestScope.registrationErrorMap.email}" var="error">
                            ${error} <br/>
                        </c:forEach>
                    </div>
                    <div class="form-group">
                        <label>Password* </label>
                        <input class="form-control" type="password" placeholder="Password" name="password">
                    </div>
                    <div class="form-group">
                        <label>Re-enter Password*</label>
                        <input class="form-control" type="password" placeholder="Password" name="password_confirm">
                    </div>
                    <div class="form-group">
                        <label>Mobile phone *</label>
                        <input id="phone" class="form-control" type="text" placeholder="Enter your mobile no" name="phone">
                    </div>

                    <div class="form-group">
                        <div class="remember-checkbox">
                            <input type="checkbox" name="one" id="one" />
                            <label for="one">Accept our <a href="#"> privacy policy</a> and <a href="#"> customer agreement</a></label>
                        </div>
                    </div>
<%--                    <a href="#" class="button red"> Register an account </a>--%>
                    <input type="submit" value="Register an account">
                    <p class="link">Already have an account? please <a href="#"> login here </a></p>
                </div>
                </form>
            </div>
        </div>
    </div>
</section>

<!--=================================
 register-form  -->


<!--=================================
 footer -->

<jsp:include page="footer.jsp"/>

<!--=================================
 footer -->


<!--=================================
back to top -->

<div class="car-top">
    <span><img src="images/car.png" alt=""></span>
</div>

<!--=================================
back to top -->

<!--=================================
 jquery -->

<jsp:include page="js.jsp"/>

</body>

<script>
    $(document).ready(function () {

        function isEmail(email) {
            var regex = /^([a-zA-Z0-9_.+-])+\@(([a-zA-Z0-9-])+\.)+([a-zA-Z]{2,4})+$/;
            return regex.test(email);
        }

        $('#email').change(function () {
            var email_value = $('#email').val();
            console.log('email = ' + email_value);

            var is_valid = isEmail(email_value);
            console.log('email valid = ' + is_valid);

            if(is_valid) {
                // valid email, call ajax email validation
                $.ajax({
                    url: 'reg-validate',
                    data: {email: email_value},
                    success(tofiq) {
                        console.log('server response = ' + tofiq);

                        if(tofiq) {
                            alert('Email ' + email_value + ' artiq qeydiyyatdan kecib');
                        }
                    }
                });
            } else {
                // invalid email
                alert('Email ' + email_value + ' dogru deyil');
            }


        });

    });
</script>
</html>
