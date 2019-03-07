app.service("ContentCategoryService",function ($http) {
    this.findAll = function () {
        return $http.get("../contentCategory/findAll.do");
    }
});