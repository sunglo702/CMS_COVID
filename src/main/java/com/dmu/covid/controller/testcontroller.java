//@Controller//声明一个控制器
/*public class testcontroller {
​
    @GetMapping("/test")// 请求路径为 ip + port + /test
    // 当访问此路径时会转发至逻辑视图 test
    public String getTest(Model model){
        // list中存放 test
        ArrayList<test> testList = new ArrayList<>();
        for (long i=0; i<5; i++){
            test test = new test();
            test.setId(i);
            test.setAge(18);
            test.setName("这是一个测试");
            testList.add(test);
        }
        // 为视图添加用户
        model.addAttribute("testers",testList);
        // 逻辑视图为 test 即在 templates 下的 test.html
        return "test";
    }
​
}*/
