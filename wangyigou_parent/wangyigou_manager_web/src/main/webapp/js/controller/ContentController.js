app.controller("ContentController",function ($scope,ContentService,ContentCategoryService) {
    $scope.findAll = function () {
        ContentService.findAll().success(function (result) {
            $scope.list = result;

            alert(result)
        })
    };

    $scope.status = ["无效","有效"]


    $scope.findCategory = function () {
        ContentCategoryService.findAll().success(function (result) {

            alert(result)
            $scope.categoryList = result;
        })
    }
});