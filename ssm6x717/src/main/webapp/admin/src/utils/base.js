const base = {
    get() {
        return {
            url : "http://localhost:8080/ssm6x717/",
            name: "ssm6x717",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm6x717/front/h5/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "基于微信小程序的企业职工薪资查询系统设计与实现"
        } 
    }
}
export default base
