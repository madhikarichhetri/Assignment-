package org.example.st;

import util.DbUtil;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Author: adhik
 * Since: date
 */
public class SelectDemo {
    public static final String SQL = "select * from demo_tbl";

    public static void main(String[] args) {

        try (
                Statement st = DbUtil.getConnection().createStatement();
        ) {
           ResultSet rs = st.executeQuery(SQL);
           while(rs.next()){
//               System.out.println("Id is: " + rs.getInt(1));
//               System.out.println("username is: " + rs.getString(2));
//               System.out.println("password is : " + rs.getString(3));

               System.out.println("Id is: " + rs.getInt("id"));
               System.out.println("username is: " + rs.getString("user_name"));
               System.out.println("password is : " + rs.getString("password"));
               System.out.println("=============================");
           }



        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}


