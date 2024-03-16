/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author laiva
 */
public class ConnectDB {
    public static Connection dbConnector() {
        try {
            String url = "jdbc:mysql://localhost/quanlykhachsan";
            String user = "root";
            String password = "";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, user, password);
            return conn;
        } catch (ClassNotFoundException | SQLException e) {
            return null;
        }
    }
    public static void main(String[] args) {
        Connection conn = ConnectDB.dbConnector();
        if (conn==null) {
            System.out.println("Fail");
        } else {
            System.out.println("Oke");
        }
    }
}
