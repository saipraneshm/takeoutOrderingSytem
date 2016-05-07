var app = angular.module("myApp",['ui.router','ui.bootstrap']);

app.controller("userCtrl",function($scope,$rootScope,$http,$state){
	console.log("am in main ctrl");
	$rootScope.cart = [];
	
	$state.go("userHomeState");
});

app.config(function($stateProvider, $urlRouterProvider) {


	  $stateProvider
	    .state("userHomeState", {
	    	views: {
	    		"userHome" : {
	    			 
	    			  templateUrl : "/userHome",
	    			  controller  : function($scope , $http, $state,$rootScope){
	    				  
	    				  $http.get().success(function(data){
	    					  
	    				  }).error(function(error){
	    					  
	    				  });
	    				  $scope.quantity = 1;
	    				  $scope.menu=[{"id":1,"Name":"Chicken Pizza","Category":"Pizza","UnitPrice":10,"isCollapsed":true},
	    				               {"id":2,"Name":"Chicken Pizza","Category":"Pizza","UnitPrice":10,"isCollapsed":true},
	    				               {"id":3,"Name":"Chicken Pizza","Category":"Pizza","UnitPrice":10,"isCollapsed":true}]
	    				  
	    				  $scope.add = function(item,index){
	    					  console.log(index);
	    					  $scope.menu[index].add = true;
	    					  $scope.menu[index].remove = true;
	    					  $rootScope.cart.push($scope.menu[index]);
	    					  console.log($rootScope.cart);
	    				  }
	    				  
	    				  $scope.remove = function(item,index){
	    					  console.log(index);
	    					  $scope.menu[index].add = false;
	    					  $scope.menu[index].remove = false;
	    					  var id = $scope.menu[index].id;
	    					  for(i=0;i<$rootScope.cart.length;i++){
	    						  if($rootScope.cart[i].id==id){
	    							  var index = $rootScope.cart.indexOf($rootScope.cart[i]);
	    							  $rootScope.cart.splice(index,1);
	    						  }
	    					  }
	    					  console.log($rootScope.cart);
	    				  }
	    				  
	    				  
	    				  
	    				 
	    			  }
	    
	    	}}
	      
	    })
	    
});







