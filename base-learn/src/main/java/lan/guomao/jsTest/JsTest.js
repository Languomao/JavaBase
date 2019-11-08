/**
 * Created by Languomao on 2018/2/26.
 */
var app = angular.module("myApp" , []);
app.service("myService" , function(){
   var PrivateValue  = "Private";
   this.Variable  =  "this is public";
this.getVariable = function(){return Variable};
});
app.controller("myController" , function($scope){
    $scope.notifyServiceOnChage = function(){
        console.log($scope.WindowHeight);
    };
    $scope.name = "languomao";
});