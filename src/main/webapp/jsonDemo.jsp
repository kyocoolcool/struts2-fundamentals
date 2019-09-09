<%@ page language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
<head>
    <title>Demo Struts2 tag</title>
    <script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
</head>
<body>
<h3 id="h3">OOOOOOOOOOOOOO</h3>
</body>
<script>
    // $(function () {
    //     $("#h3").click(function () {
    //             console.log("xxxxx");
    //             $.post({
    //                 url:'getJsonAction.do',
    //                 //data:"name="+JSON.stringify(user),
    //                 data:{
    //                     "firstName":"King",
    //                     "lastName":"Ten"
    //                 },
    //                 datatype:'json',
    //                 success:function(data){
    //                     console.log(data);
    //                 }
    //             })
    //         })
    //     });
    $(function () {
        // var a=JSON.stringify({ 'firstName' : '薛军军', 'lastName' : '男', });
        $("#h3").click(function () {
            console.log("zzz");
            //傳送List物件寫法
            var users = {"users[0].firstName":"sss","users[0].lastName":"fadsfdsaf","users[1].firstName":"xxx","users[1].lastName":"yyyy"};
            $.ajax({
                type:"post",
                url:"getJsonAction.do",

                data:
                    {
                        // 屬性寫法
                    "firstName": "hello",
                        "lastName":"逼吧你個隆地咚",
                    //     // user對象寫法
                        "user.firstName":"eeee",
                        "user.lastName":"ccccc",
                        // request.getParameter寫法
                    // name:"nnnnn",
                //users of list寫法
                    "users[0].firstName":"sss","users[0].lastName":"fadsfdsaf","users[1].firstName":"xxx","users[1].lastName":"yyyy",
                        "list[0]":"aaaa"
                }
                ,
                dataType:'json',
                success:function(data){
                    alert(data);

                },
                error:function(){
                    alert("系統異常，稍後重試！");
                }
            });
        })
    });
</script>
</html>
