package util;
import com.microsoft.sqlserver.jdbc.SQLServerDriver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class MyJDBC {
        private static String username = "sa";
        private static String password = "s@123456";
        private static String url = "jdbc:sqlserver://127.0.0.1:1433;database=Struts2Demo";

        public static Connection buildCollection() {

            Connection connection = null;
            try {
//意思相同
//                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                DriverManager.registerDriver(new SQLServerDriver());
                connection = DriverManager.getConnection(url, username, password);
                if (connection != null) {
                    System.out.println("数据库连接成功!" + connection);
                }
//            } catch (ClassNotFoundException | SQLException e) {
//                e.printStackTrace();
//            }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return connection;
        }

    public static void main(String[] args) {
//            Class.forName()用法
        MyJDBC m1=new MyJDBC();
        m1.buildCollection();
        try {
            MyJDBC  m2= (MyJDBC) Class.forName("MyJDBC").newInstance();
            m2.buildCollection();
        }
        catch (Exception e){
            return;
        }
    }
    }
