package com.epam.renat_farakhutdinov.java.lesson7.task7;

import com.epam.renat_farakhutdinov.java.lesson7.task7.connection.ConnectionFactory;
import com.epam.renat_farakhutdinov.java.lesson7.task7.connection.IConnection;
import com.epam.renat_farakhutdinov.java.lesson7.task7.connection.SQLServerTypes;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Renat Farakhutdinov on 02.05.2018.
 */
// Для каждой записи в выборке добавляем 10 дублей
public class Solution {
    public static void main(String[] args) {
        IConnection connection = ConnectionFactory.getConnection(SQLServerTypes.MY_SQL);
        if (connection != null) {
            connection.process();

            try {
                Statement statement = connection.getDBConnection().createStatement();
                ResultSet rs = statement.executeQuery("select id, name, author from books");

                String insert = "insert int books values (%d, %s, %s)";
                int k = rs.getFetchSize();
                while (rs.next()) {
                    for (int i = 0; i < 10; i++) {
                        int id = rs.getInt(1);
                        String name = rs.getString(2);
                        String author = rs.getString(3);
                        System.out.printf("id: %d, name: %s, author: %s %n", id, name, author);

                        insert = String.format(insert, k++, name, author);
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            connection.close();
        }
    }
}
