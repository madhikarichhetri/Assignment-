package org.example.ps;

import util.DbUtil;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Author: Mohan Adhikari Chhetri
 * Since: Feb 2020
 */
public class UpdateDemo {
    public static final String SQL ="update demo_tbl set user_name= ? ,password = ? where id =?";

    public static void main(String[] args) {

        try (
                PreparedStatement ps= DbUtil.getConnection().prepareStatement(SQL);
        ) {
            ps.setString(1, "Tina");
            ps.setString(2, "bbb");
            ps.setInt(3, 1);
            ps.executeUpdate();
            System.out.println("Data Updated");


        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}
