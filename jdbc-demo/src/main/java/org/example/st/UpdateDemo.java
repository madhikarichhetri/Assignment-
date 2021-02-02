package org.example.st;

import util.DbUtil;

import java.sql.SQLException;
import java.sql.Statement;

/**
 * Author: adhik
 * Since: date
 */
public class UpdateDemo {
    public static final String SQL = "update demo_tbl set user_name= 'sammy' ,password = 'ddd' where id =2";

    public static void main(String[] args) {

        try (
                Statement st = DbUtil.getConnection().createStatement();
        ) {
            st.executeUpdate(SQL);
            System.out.println("Data Updated");


        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}

