app.controller('ContentController',function ($scope,ContentService) {

    //定义广告集合
    $scope.contentList = [];
    $scope.findByCategoryId = function (categoryId) {
        ContentService.findByCategoryId(categoryId).success(function (result) {
            $scope.contentList[categoryId] = result;
        })
    }
});