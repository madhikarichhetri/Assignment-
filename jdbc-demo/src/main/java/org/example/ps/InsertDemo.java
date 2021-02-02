package org.example.ps;

import util.DbUtil;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Author: Mohan Adhikari Chhetri
 * Since: Feb 2021
 */
public class InsertDemo {
    public static final String SQL = "insert into demo_tbl(user_name,password) values (?,?)";

    public static void main(String[] args) {

        try (
                PreparedStatement ps= DbUtil.getConnection().prepareStatement(SQL);
        ) {
            ps.setString(1, "Samjan");
            ps.setString(2, "Nishan");
            ps.executeUpdate();
            System.out.println("Data Inserted");


        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}


