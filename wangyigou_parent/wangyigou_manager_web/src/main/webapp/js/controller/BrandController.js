app.controller('BrandController',function ($scope,BrandService) {
    $scope.findAll = function () {
        BrandService.findAll().success(function (result) {
            alert(result)
            $scope.list = result;
        })
    }


    $scope.save = function () {
        BrandService.save(brand).success(function (result) {
            if (result.success) {
                alert('保存成功')
            }else {
                alert("保存失败")
            }
        })
    }
});