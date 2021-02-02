package org.example.st;

import util.DbUtil;

import java.sql.SQLException;
import java.sql.Statement;

/**
 * Author: Mohan Adhikari Chhetri
 * Since: 2/1/2021
 */
public class CreateTable {


//    public static final String Driver = "com.mysql.cj.jdbc.Driver";
//    public static final String URL = "jdbc:mysql://localhost:3306/demo_db"; //link to database
//    public static final String USER_NAME = "root";
//    public static final String PASSWORD = "root";
    public static final String SQL = "create table demo_tbl(id int not null auto_increment, user_name varchar(45),password varchar(45), primary key(id))";

    public static void main(String[] args) {

        try (
//                Connection con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
//                Statement st = con.createStatement();

                Statement st = DbUtil.getConnection().createStatement();
        ) {
            st.executeUpdate(SQL);
            System.out.println("table created");


        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}




