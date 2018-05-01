package com.epam.renat_farakhutdinov.java.lesson7.task7.connection;

import java.sql.Connection;

/**
 * Created by Renat Farakhutdinov on 01.05.2018.
 */
public interface IConnection {
    void process();
    void close();
    Connection getDBConnection();
}
