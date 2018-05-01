package com.epam.renat_farakhutdinov.java.lesson7.task7.connection;

import com.epam.renat_farakhutdinov.java.lesson7.task7.connection.impl.MSServerConnection;
import com.epam.renat_farakhutdinov.java.lesson7.task7.connection.impl.MySQLConnection;
import com.epam.renat_farakhutdinov.java.lesson7.task7.connection.impl.OracleSQLConnection;

/**
 * Created by Renat Farakhutdinov on 01.05.2018.
 */
public class ConnectionFactory {
    public static IConnection getConnection(SQLServerTypes type) {
        switch (type) {
            case MY_SQL:
                return new MySQLConnection();
            case MS_SQL:
                return new MSServerConnection();
            case ORACLE:
                return new OracleSQLConnection();
            default:
                return null;
        }
    }
}
