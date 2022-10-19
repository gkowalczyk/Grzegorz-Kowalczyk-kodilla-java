package com.kodilla.jdbc;

import org.junit.jupiter.api.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testSelectUsers {
    @Test
    void testSelectUsers() throws SQLException {
        //given
        DbManager dbManager = DbManager.getInstance();
        //When
        String sqlQuery = "SELECT * FROM BOOKS";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);
        //then
        int counter = 0;
        while (rs.next()) {
            System.out.println(rs.getInt("BOOK_ID") + "." +
                    rs.getString("TITLE") + "," +
                    rs.getString("PUBYEAR")+ "," +
                    rs.getString("BESTSELLER")+ ","  );
            counter++;
        }
        rs.close();
        statement.close();
        assertEquals(5,counter);
        System.out.println("counter:" + counter);
    }
}
