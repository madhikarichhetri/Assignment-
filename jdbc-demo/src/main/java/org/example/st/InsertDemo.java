package org.example.st;

import util.DbUtil;

import java.sql.SQLException;
import java.sql.Statement;

/**
 * Author: Mohan Adhikari Chhetri
 * Since: 2/1/2021
 */
public class InsertDemo {
    public static final String SQL = "insert into demo_tbl(user_name,password) values ('Tom', 'kkk')";

    public static void main(String[] args) {

        try (
                Statement st = DbUtil.getConnection().createStatement();
        ) {
            st.executeUpdate(SQL);
            System.out.println("Data Inserted");


        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}


