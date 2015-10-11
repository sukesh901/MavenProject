/**
 * 
 */

app.factory('forecast', ['$http','ngDialog',function($http,ngDialog) { 
	
	var dialogOptions = {
			draggable:true,
		    controller: 'getABook',
		    templateUrl: 'resources/html/modalContent.html'
		  };
	return{
		
		/*getAllBooks:function(){
  return $http.get('allbooks-info') 
            .success(function(data) { 
              return data; 
            }) 
            .error(function(err) { 
              return err; 
            }); 
		},*/
		 getABook:function($scope, item, $http){
			  var base_url='http://localhost:8080/AngularJSProj/';

			return $http({
				  
				  url:base_url+'book-info/'+item,
				  method:'GET',
				  
			  })
			  .success(function(data){
					  $scope.book=data;
				  ngDialog.open({ 
					  scope:$scope,
					  backdrop: 'static',
					  closeByEscape:false,
					  closeByDocument:false,
					  template: 'resources/html/modalContent.html' ,
					  className: 'ngdialog-theme-plain',
					  preCloseCallback:function(){ /* Do something here*/}
					  
						  });
			  });
			
			
		
 
		 },
		 
		 
		 
		 postData:function($scope, item, $http){
			 var base_url='http://localhost:8080/AngularJSProj/';
			// $scope.book = item;
			 //alert("book : " +item.pubdate);
			 var book=item;
				return $http.post('postbook-info',book)
					  
					  		  .success(function(data){
					  
				  });
				
				  }
			 
		 
  };
  /*function getABook($scope, item, dialog){
	  var base_url='http://localhost:8080/AngularJSProj/';
	  alert(" item " +item);
	  $scope.item= $http({
		  
		  url:base_url+'book-info/'+item,
		  method:'GET',
		  
	  })
	  .success(function(data){
		  alert("success data " +data);
		  book=data;
	  });
  }*/
}]);
