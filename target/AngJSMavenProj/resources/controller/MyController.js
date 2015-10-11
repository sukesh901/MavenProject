/**
 * @author Ramakrishna
 */
app.controller('MyController',['$scope','forecast','ngDialog','$http' ,function($scope,forecast,ngDialog,$http){
	
		/*forecast.getAllBooks().success(function(data){
		console.log("suc" +data);
		$scope.books=data;
	});*/
	
	
	$scope.genres = ['Fiction', 'Crime', 'Fantasy', 'Comedy'];
	
	
	$scope.book={
			
			genre:['Fiction']
			
			/*pubdate:$('#datetimepicker4').datetimepicker().val()*/
	};
	                
/*	$scope.selection = ['Fiction', 'Comedy'];*/
	
	
	$scope.toggleSelection = function toggleSelection(genre) {
	      var idx = $scope.selection.indexOf(genre);
	      
	      // is currently selected
	      if (idx > -1) {
	        $scope.selection.splice(idx, 1);
	      }
	      
	      // is newly selected
	      else {
	        $scope.selection.push(genre);
	      }
	    };
	
	$scope.maxLength=20;
	$scope.title='Top 100 books of the year';
	$scope.priceRange = [0, 6000];

	$scope.filterPrice=function(book){
		if(book.price.price > $scope.priceRange[0] && book.price.price < $scope.priceRange[1]){
			return true;
		}
		
	};
	$scope.orderByPrice=function(book){
		if($scope.orderBy == "price-low-high"){
			
			return book.price.price;
		}
		if($scope.orderBy == "price-high-low"){
			
			return -book.price.price;
		}
		else return book.price.price;
		
	};
	
	$scope.moreDetails=function(data){
		
		/*$timeout(function(){
		    $dialog.dialog({}).open('resources/html/modalContent.html');  
		  }, 3000);*/
		forecast.getABook($scope,data,$http);
	};
	
	
		$scope.postData=function(data){
			
			forecast.postData($scope,data,$http);
		
	};
	
	
}]);