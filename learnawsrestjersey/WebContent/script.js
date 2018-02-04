var app = angular.module("myapp", []);

app.controller("MainController", function($scope) {
    $scope.message = "Hello Angular+AWS!!!";
});

app.controller("RestController",function($scope,$http){
	
	
	var onReposuccess = function(response){
		console.log("Inside Repo Success::::");
		$scope.repositories = response.data;
	};
	
	$scope.searchuser = function(userngmodel,$log){
		
		console.log("Inside button click");
		//$log.info("Searched User name is:::");
		var url1 = "https://api.github.com/users/";
		var url2 = userngmodel;
		var url = url1 + url2;
		console.log("URL:::"+url);
		$http.get(url).then(function(response,userngmodel){
			
			$scope.user = response.data;
		});
		
		$http.get(url+"/repos").then(onReposuccess);
		
	};
	
	
});