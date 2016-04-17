/**
 * 
 */
/**
 * 
 */
angular.module('sortApp',[])
.controller('mainController',function($scope)
{
	$scope.sortType='name';
$scope.category=[
                 {pid:'1',pname:'wire',cost:1000,description:"good to use"},
                 {pid:'2',pname:'wood',cost:2000,description:"good to handle"},
                 {pid:'3',pname:'air',cost:3000,description:"good to listen"},
                 {pid:'1',pname:'tabla',cost:1000,description:"good to use"},
                 {pid:'2',pname:'violin',cost:2000,description:"good to handle"},
                 {pid:'3',pname:'veena',cost:3000,description:"good to listen"},
                 {pid:'1',pname:'tabla',cost:1000,description:"good to use"},
                 {pid:'2',pname:'violin',cost:2000,description:"good to handle"},
                 {pid:'3',pname:'veena',cost:3000,description:"good to listen"},
                 {pid:'1',pname:'yamaha',cost:1000,description:"good to use"},
                 {pid:'2',pname:'sony',cost:2000,description:"good to handle"},
                 {pid:'3',pname:'htc',cost:3000,description:"good to listen"},
                 {pid:'1',pname:'keyboard',cost:1000,description:"good to use"},
                 {pid:'2',pname:'drum',cost:2000,description:"good to handle"},
                 {pid:'3',pname:'orchestral',cost:3000,description:"good to listen"}
               
                 
                 
                ];

$scope.instrument=[
                 {pid:'1',pname:'tabla',cost:1000,description:"good to use"},
                 {pid:'2',pname:'violin',cost:2000,description:"good to handle"},
                 {pid:'3',pname:'veena',cost:3000,description:"good to listen"}
                 
                 
                ];

$scope.Brand=[
                 {pid:'1',pname:'yamaha',cost:1000,description:"good to use"},
                 {pid:'2',pname:'sony',cost:2000,description:"good to handle"},
                 {pid:'3',pname:'htc',cost:3000,description:"good to listen"}
                 
                 
                ];
$scope.accessories=[
                 {pid:'1',pname:'keyboard',cost:1000,description:"good to use"},
                 {pid:'2',pname:'drum',cost:2000,description:"good to handle"},
                 {pid:'3',pname:'orchestral',cost:3000,description:"good to listen"}
                 
                 
                ];
}		


);

