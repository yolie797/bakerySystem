<%-- 
    Document   : signUp
    Created on : May 24, 2023, 1:31:32 PM
    Author     : Train
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="myCss.css">
        <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css" rel="stylesheet"/>
        <link href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700&display=swap"rel="stylesheet"/>
        <link href="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/3.6.0/mdb.min.css" rel="stylesheet"/>
        <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/3.6.0/mdb.min.js"></script>
    </head>
    <body>
        <section class="h-100" style="background-color: #9A616D;">
            <div class="container py-5 h-100">
                <div class="row d-flex justify-content-center align-items-center h-100">
                    <div class="col">
                        <div class="card card-registration my-4">
                            <div class="row g-0">
                                <div class="col-xl-6 d-none d-xl-block">
                                    <img src="../images/background.jpg"
                                         alt="Sample photo" class="img-fluid"
                                         style="width: 100%;height: 95%" 
                                         />
                                </div>
                                <div class="col-xl-6">
                                    <div class="card-body p-md-5 text-black">
                                        <h3 class="mb-5 text-uppercase">Registration form</h3>
                                        <div class="row">
                                            <form action="../bakery?pro=rp" method="POST">
                                                <div class="col-md-6 mb-4">
                                                    <div class="form-outline">
                                                        <input type="text" id="title" name="title" class="form-control form-control-lg" />
                                                        <label class="form-label" for="title">Title</label>
                                                    </div>
                                                </div>
                                                <div class="col-md-6 mb-4">
                                                    <div class="form-outline">
                                                        <input type="text"  id="firstname" name="firstname" class="form-control form-control-lg" />
                                                        <label class="form-label" for="firstname">First name</label>
                                                    </div>
                                                </div>
                                                <div class="col-md-6 mb-4">
                                                    <div class="form-outline">
                                                        <input type="text" id="lastname" name="lastname" class="form-control form-control-lg" />
                                                        <label class="form-label" for="lastname">Last name</label>
                                                    </div>
                                                </div>
                                                <div class="col-md-6 mb-4">
                                                    <div class="form-outline">
                                                        <input type="text" id="username" name="username" class="form-control form-control-lg" />
                                                        <label class="form-label" for="username">Email Address</label>
                                                    </div>
                                                </div>
                                                <div class="col-md-6 mb-4">
                                                    <div class="form-outline">
                                                        <input type="text"  id="phonenumber" name="phonenumber" class="form-control form-control-lg" />
                                                        <label class="form-label" for="phonenumber">Cell Number</label>
                                                    </div>
                                                </div>
<!--                                                <div class="col-md-6 mb-4">
                                                    <div class="form-outline">
                                                        <input type="text" name="form3Example1n1" class="form-control form-control-lg" />
                                                        <label class="form-label" for="form3Example1n1">ID Number</label>
                                                    </div>
                                                </div>-->
                                                <div class="col-md-6 mb-4">
                                                    <div class="form-outline">
                                                        <input type="text" id="password" name="password" class="form-control form-control-lg" />
                                                        <label class="form-label" for="password">Create Password</label>
                                                    </div>
                                                </div>
                                                <div class="col-md-6 mb-4">
                                                    <div class="form-outline">
                                                        <input type="text"  id="password" name="password" class="form-control form-control-lg" />
                                                        <label class="form-label" for="password">Confirm Password</label>
                                                    </div>
                                                </div>
                                                <div class="d-flex justify-content-end pt-3">
                                                    <!--<button type="button" class="btn btn-light btn-lg">Reset all</button>-->
                                                    <button type="submit" class="btn btn-warning btn-lg ms-2">Submit form</button>
                                                </div>

                                            </form>

                                            <!--                                            <div class="col-md-6 mb-4">
                                                                                            <div class="form-outline">
                                                                                                <input type="text" name="form3Example1n1" class="form-control form-control-lg" />
                                                                                                <label class="form-label" for="form3Example1n1">Address</label>
                                                                                            </div>
                                                                                        </div>
                                                                                        <div class="col-md-6 mb-4">
                                                                                            <div class="form-outline">
                                                                                                <input type="text" name="form3Example1n1" class="form-control form-control-lg" />
                                                                                                <label class="form-label" for="form3Example1n1">Postal Code</label>
                                                                                            </div>
                                                                                        </div>-->
                                        </div>
                                        <!--                                        <div class="row">
                                                                                    <div class="col-md-6 mb-4">
                                        
                                                                                        <select class="select">
                                                                                            <option value="1">Suburb</option>
                                                                                            <option value="2">Olievenhoutbosch</option>
                                                                                            <option value="3">Tembisa</option>
                                                                                            <option value="4">Soshanguve</option>
                                                                                        </select>
                                        
                                                                                    </div>
                                                                                    <div class="col-md-6 mb-4">
                                        
                                                                                        <select class="select">
                                                                                            <option value="1">City</option>
                                                                                            <option value="2">Centurion</option>
                                                                                            <option value="3">Midrand</option>
                                                                                            <option value="4">Pretoria</option>
                                                                                        </select>
                                        
                                                                                    </div>
                                                                                </div>-->






                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
    </body>
</html>
