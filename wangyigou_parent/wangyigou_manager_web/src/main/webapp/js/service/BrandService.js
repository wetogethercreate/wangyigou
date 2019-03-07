app.service('BrandService',function ($http) {
    this.findAll = function () {
        return $http.get("../brand/findAll.do");
    }

    this.save = function (brand) {
        return $http.post("../brand/save.do",brand)
    }
})