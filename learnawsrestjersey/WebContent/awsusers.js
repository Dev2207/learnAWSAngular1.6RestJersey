var app = angular.module("userapp", []);

app.controller("UserController",function($scope){
	
	$scope.message = "Welcome to User Page!";

});

app.controller("UserDetailsController",function($scope,$http){
	var onsuccess = function(response){
		$scope.users = response.data;
		console.log("User Detail"+$scope.users);
	};
	
	var onError = function(response){
		$scope.error = "Something went wrong! Not able to fetch AWS RDS Users";
	};
	
	$scope.getuser = function($log){
		console.log("Inside button click");
		//$log.info("Get Aws user:::");
		var url = "http://localhost:8081/learnawsrestjersey/rest/aws/users";
		console.log("URL:::"+url);
		$http.get(url).then(onsuccess,onError);
	};
		
	
	
});