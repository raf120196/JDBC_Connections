package com.epam.renat_farakhutdinov.java.lesson7.task7.connection.impl;

import com.epam.renat_farakhutdinov.java.lesson7.task7.connection.IConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Renat Farakhutdinov on 01.05.2018.
 */
// Не устанавливал себе MS Server
public class MSServerConnection implements IConnection {
    private static final String URL = "jdbc:oracle:thin:...";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    // private SQLServerConnection connection;

    @Override
    public void process() {
//        try {
//            Class.forName("com.mysql.jdbc.Driver").newInstance();
//            connection = (com.mysql.jdbc.Connection) DriverManager.getConnection(URL, USERNAME, PASSWORD);
//            System.out.println("Connection has been initialized!");
//        } catch (SQLException e) {
//            System.out.println("SQL Exception: " + e.getMessage());
//            System.out.println("SQL State: " + e.getSQLState());
//            System.out.println("Vendor Error: " + e.getErrorCode());
//            connection = null;
//        } catch (IllegalAccessException | InstantiationException | ClassNotFoundException e) {
//            System.out.println(e.getMessage());
//        }
    }

    @Override
    public void close() {
//        try {
//            connection.close();
//            System.out.println("Connection has been closed!");
//        } catch (SQLException e) {
//            System.out.println("SQL Exception: " + e.getMessage());
//            System.out.println("SQL State: " + e.getSQLState());
//            System.out.println("Vendor Error: " + e.getErrorCode());
//        } finally {
//            connection = null;
//        }
    }

    @Override
    public Connection getDBConnection() {
        //return connection;
        return null;
    }
}
