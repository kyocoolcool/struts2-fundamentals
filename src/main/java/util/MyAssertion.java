package util;

public class MyAssertion {
  /*在運行時，需要配置運行時選項 "Run"，在 "Argumengts"
   （參數）頁面中，在 "VM Arguments" 中填入 "-ea" 選項（不帶引號），
    才可以讓assert語句在運行時其作用。
   */
        public static void main(String[] args) {
            String name = "Zhang San";
//                    name = null;
// 若把變量name賦值為null，則assert為假，"Name is Null."會被顯示
            assert(name != null):"Name is Null.";
            System.out.println(name);


//            if(args.length > 0) {
//                System.out.println(args[0]+args[1]);
//                System.out.println("MyAssertion.main");
//                System.out.println("args = [" + args + "]");
//            }
//            else {
//                assert args.length == 0;
//                System.out.println("沒有輸入引數");
//
//            }
        }
}
