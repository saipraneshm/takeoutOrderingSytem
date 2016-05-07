<!doctype html>
<html ng-app="myApp">
<head>
	<meta charset="utf-8" />
	<link rel="icon" type="image/png" href="assets/img/favicon.ico">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />

	<title>Light Bootstrap Dashboard by Creative Tim</title>

	<meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0' name='viewport' />
    <meta name="viewport" content="width=device-width" />
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
    
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
    <script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.2.26/angular.min.js"></script>
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
    <script src="js/ui-bootstrap-tpls-1.3.2.js"></script>
    <link href="/css/animate.min.css" rel="stylesheet"/>
    <link href="/css/light-bootstrap-dashboard.css" rel="stylesheet"/>
    <link href="http://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css" rel="stylesheet">
    <link href='http://fonts.googleapis.com/css?family=Roboto:400,700,300' rel='stylesheet' type='text/css'>
    <link href="/css/pe-icon-7-stroke.css" rel="stylesheet" />
    <script src = "/js/angular-ui-router.min.js"></script>
    <script src="/controller/userController.js"></script>

</head>
<body ng-controller="userCtrl">


    

    
        <nav class="navbar navbar-inverse navbar-fixed">
            <div class="container-fluid">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#navigation-example-2">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="#">&nbsp&nbsp&nbspOrder Management System</a>
                </div>
                
                        
                       
                    
                    

                    <ul class="nav navbar-nav navbar-right">
                        <li>
                           <a href="">
                               User Profile
                            </a>
                        </li>
                        <li>
                            <a href="#">
                                Log out
                            </a>
                        </li>
                         <li class="dropdown">
                            &nbsp&nbsp  
                             <button type="button" class="btn btn-default btn-sm">
          <span class="glyphicon glyphicon-shopping-cart"></span>Cart
        
        </button>
                                    <span class="notification">{{cart.length}}</span>
                           &nbsp&nbsp&nbsp&nbsp   
                              
                        </li>
                    </ul>
                </div>
            </div>
        </nav>

    <div ui-view="userHome">
 
    </div>
    


        

    



</body>
</html>
      