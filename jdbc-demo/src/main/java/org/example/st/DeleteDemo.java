package org.example.st;

import util.DbUtil;

import java.sql.SQLException;
import java.sql.Statement;

/**
 * Author: adhik
 * Since: date
 */
public class DeleteDemo {
    public static final String SQL = "delete from demo_tbl where id = 3";

    public static void main(String[] args) {

        try (
                Statement st = DbUtil.getConnection().createStatement();
        ) {
            st.executeUpdate(SQL);
            System.out.println("Data deleted");


        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}

