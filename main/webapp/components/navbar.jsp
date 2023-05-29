<%-- 
    Document   : navbar
    Created on : May 24, 2023, 11:20:09 AM
    Author     : Train
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>NAV_BAR PAGE</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="myCss.css">
        <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css" rel="stylesheet"/>
        <link href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700&display=swap"rel="stylesheet"/>
        <link href="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/3.6.0/mdb.min.css" rel="stylesheet"/>
        <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/3.6.0/mdb.min.js"></script>
    </head>
    <body>
        <header>
            <!-- Navbar -->
            <nav class="navbar navbar-expand-lg navbar-light fixed-top mask-custom shadow-0">
                <div class="container">
                    <a class="navbar-brand" href="#!"><span style="color: #5e9693;">Two</span><span style="color: #fff;">Pie</span><span style="color: blueviolet;">Four</span></a>
                    <button class="navbar-toggler" type="button" data-mdb-toggle="collapse"
                            data-mdb-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false"
                            aria-label="Toggle navigation">
                        <i class="fas fa-bars"></i>
                    </button>
                    <div class="collapse navbar-collapse" id="navbarSupportedContent" >
                        <ul class="navbar-nav me-auto">
                            <li class="nav-item" >
                                <a class="nav-link" href="components/home.jsp"><span style="color: white">Home</span></a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="#!"><span style="color: white">About</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="jsp/products.jsp"><span style="color: white">Products</a>
                            </li>   
                            <li class="nav-item">
                                <a class="nav-link" href="#!"><span style="color: white">Contact</a>
                            </li>
                        </ul>
                        <ul class="navbar-nav d-flex flex-row">
                            <li class="nav-item me-3 me-lg-0">
                                <a class="nav-link" href="#!">
                                    <span style="color: white">
                                        <i class="fas fa-shopping-cart"></i>
                                </a>
                            </li>
                            <li class="nav-item me-3 me-lg-0">
                                <a class="nav-link" href="jsp/login.jsp">
                                    <span style="color: white">
                                        <i class="fas fa-user-plus"></i>
                                </a>
                            </li>
                            <li class="nav-item me-3 me-lg-0">
                                <a class="nav-link" href="">
                                    <span style="color: white">
                                      <i class="bi bi-box-arrow-right"></i>
                                       
                                </a>
                            </li>
                        </ul>
                    </div>
                </div>
            </nav>
            <!-- Navbar -->

            <!--Section: Design Block-->
            <section>
                <!--Intro--> 
                <div id="intro" class="bg-image vh-100" style="
                     background-image: url('images/bakery-elements-background_23-2147516966.webp');
                     ">
                    <div class="mask" style="background-color: rgba(250, 182, 162, 0.15);"></div>
                </div>
                <!--Intro--> 
            </section>
            <!--Section: Design Block-->
        </header>
        <!--        <nav class="navbar navbar-default" >
                    <div class="container-fluid">
                        <div class="navbar-header">
        
                            <img src="images/logo.jpg" class="img-rounded" alt="Bakery Logo"  height="66"> 
                            <a class="navbar-brand" href="#">Online Bakery</a>
                        </div>
                        <ul class="nav navbar-nav navbar-right">
                            <li ><a href="jsp/home.jsp"><span class="glyphicon glyphicon-home"/> Home</a></li>
                            <li><a href="#">About</a></li>
                            <li><a href="jsp/products.jsp">Products</a></li>
                            <li><a href="#"><span class="glyphicon glyphicon-shopping-cart"/> Cart</a></li>
                            <li><a href=".jsp/signUp.jsp"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
                            <li><a href="#"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
                        </ul>
                    </div>
                </nav>-->
    </body>
</html>
