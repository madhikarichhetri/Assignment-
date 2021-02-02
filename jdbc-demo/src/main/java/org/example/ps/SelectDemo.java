package org.example.ps;

import util.DbUtil;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Author: Mohan Adhikari
 * Since: Feb 2021
 */
public class SelectDemo {
    public static final String SQL = "select * from demo_tbl where id = ?";

    public static void main(String[] args) {

        try (
                PreparedStatement ps = DbUtil.getConnection().prepareStatement(SQL);
        ) {
            ps.setInt(1, 4);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){

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


