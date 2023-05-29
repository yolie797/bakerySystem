<%-- 
    Document   : navbarUser
    Created on : May 26, 2023, 1:37:47 PM
    Author     : Train
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="myCss.css">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet"/>
        <link href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700&display=swap"rel="stylesheet"/>
        <link href="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/3.6.0/mdb.min.css" rel="stylesheet"/>
        <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/3.6.0/mdb.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js"></script>
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
                                <a class="nav-link" href="jsp/profile.jsp">
                                    <span style="color: white">
                                        <i class="fas fa-user"></i>
                                        ${theUser.getfName()}
                                </a>
                            </li>
                        </ul>
                    </div>
                </div>
            </nav>

            <section>
                <!--Intro--> 
                <div id="intro" class="bg-image vh-100" style="
                     background-image: url('images/bakery-elements-background_23-2147516966.webp');
                     ">
                    <div class="mask" style="background-color: rgba(250, 182, 162, 0.15);"></div>
                </div>
                <!--Intro--> 
            </section>
            <!-- Navbar -->
        </header>
    </body>
</html>
