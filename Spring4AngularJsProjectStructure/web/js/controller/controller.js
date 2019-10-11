'use strict';
var app = angular.module('app');

app.controller('HomeController', function ($scope, $location, $http, $rootScope, LoginService) {
    $rootScope.logout = function () {
        LoginService.ClearCredentials();
        $location.path('/login');
    };

});

app.controller('UserController', function ($scope, $location, $http, $rootScope, LoginService, UserService) {

    $scope.usersList = [];
    $scope.user = {};
    getAllUsers(UserService, $scope);
    $scope.userEdit = function (user) {

        UserService.GetById(user.id)
                .then(function (res) {
                    if (res.status == '200') {
                        console.log(res);
                        $scope.user = res.data;
                    }
                }).catch(function (err) {
            console.log(err);
        });
    };

});

app.controller("empController", function ($scope, $location, $http, $rootScope) {
 
    $scope.msg = "test";
    $scope.employ = {id: '', name: '', email: '', phone: '', gender: '', jobTitle: '', psd: '', repsd: '', address: ''};
  //$scope.employeList = [];
  //$scope.employeList ={id: '', name: '', email: '', phone: '', gender: '', jobTitle: '', psd: '', repsd: '', address: ''};
    showEmployee();

    $scope.addEmploy = function () {

        const empData = JSON.stringify(this.employ);
        console.log(empData);

        $http.post('/empcreate', empData).then(function (res) {

        }).catch(function (err) {

        });
    };

    function showEmployee() {
        $http.get('/showAllEmployee')
                .then(function (res) {  
                    if (res.status == '200') {
                        $scope.employe = res.data;
                    }
                }).catch(function (err) {
            console.log(err);
        });
    }
    ;

    $scope.emploueeDetails = function (id) {
     $scope.employeList=[];
        $http.get("/empDetails/" + id).then(function (res) {            
            if (res.status == '200') {
             $scope.employeList.push(res.data);
            //  $scope.employeList=res.data;
                console.log($scope.employeList);
            }
        }).catch(function (err) {
            console.log(err);
        });

 //$location.path("/getById");
//        $http.get("/transferDetails/" + id).then(function (res) {
//            console.log(res);
//            if (res.status == '200') {
//                $scope.transferList = res.data;              
//            }
//        }).catch(function (err) {
//            console.log(err);
//        });
        
        
//        $http.get("/retirementDetails/" + id).then(function (res) {
//            console.log(res);
//            if (res.status == '200') {
//                $scope.retirement = res.data;
//                // $location.path("/getById");              
//            }
//        }).catch(function (err) {
//            console.log(err);
//        });



//        $http.get("/retirementDetails/" + id).then(function (res) {
//            console.log(res);
//            if (res.status == '200') {
//                $scope.retiremen = res.data;
//                // $location.path("/getById");              
//            }
//        }).catch(function (err) {
//            console.log(err);
//        });

//        $http.get("/appraisalDetails/" + id).then(function (res) {
//            console.log(res);
//            if (res.status == '200') {
//                $scope.retiremen = res.data;
//                // $location.path("/getById");              
//            }
//        }).catch(function (err) {
//            console.log(err);
//        });
        

    };




});



app.controller("retirementCtrl", function ($scope, $location, $http, $rootScope, ) {
    $scope.retirement = {eId: '', eName: '', employedDate: '', retiredDate: '', lastPromotedDate: '', positionLast: '', emolument: ''};

    $scope.storeRetirement = function () {

        console.log(this.retirement);

        var data = JSON.stringify(this.retirement);
        console.log(data);

        $http.post('/retirement', data).then(function (res) {
            console.log(res);

        }).catch(function (err) {

        });
    };
});


app.controller("appraisalCtrl", function ($scope, $location, $http, $rootScope, ) {
    $scope.appraisal = {empId: '', name: '', date: '', pointScore: '', remark: ''};

    $scope.storeAppraisal = function () {

        const apprsData = JSON.stringify(this.appraisal);
        console.log(apprsData);
        $http.post('/appraisaldata', apprsData).then(function (res) {
            console.log(res);
        }).catch(function (err) {

        });
    };
});








app.controller("transferCtrl", function ($scope, $location, $http, $rootScope, ) {
    $scope.saveTransfer = function () {
        var transferData = JSON.stringify(this.transfer);
        console.log(transferData);
        $http.post('/transferData', transferData).then(function (res) {

        }).catch(function (err) {

        });
    };
});



function getAllUsers(UserService, $scope) {
    UserService.GetAll()
            .then(function (res) {
                if (res.status == '200') {
                    console.log(res.data);
                    $scope.usersList = res.data;
                }
            }).catch(function (err) {
        console.log(err);
    });
}