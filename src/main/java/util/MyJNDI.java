package util;
import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;
public class MyJNDI {
        public static Connection bulidConnection() {
            Connection connection=null;
            try {
                InitialContext ctx = new InitialContext();
                Context envContext = (Context) ctx.lookup("java:comp/env");
                DataSource ds = (DataSource) envContext.lookup("jndi/Struts2Demo");
                connection = ds.getConnection();
                System.out.println("DataSource連結成功"+connection);
            }
            catch(Exception e) {
                e.printStackTrace();
            }
            return connection;

        }

    }
