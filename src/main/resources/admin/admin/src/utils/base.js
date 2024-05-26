const base = {
    get() {
        return {
            url : "http://localhost:8080/book-shop/",
            name: "book-shop",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/book-shop/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "校园书籍交易平台"
        } 
    }
}
export default base
