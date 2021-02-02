package org.example.ps;

import util.DbUtil;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Author: Mohan
 * Since: Feb 2021
 */
public class DeleteDemo {
    public static final String SQL ="delete from demo_tbl where id =?";

    public static void main(String[] args) {

        try (
                PreparedStatement ps= DbUtil.getConnection().prepareStatement(SQL);
        ) {
            ps.setInt(1, 5);

            System.out.println("Data Deleted");


        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}
