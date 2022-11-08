package com.kodilla.jdbc;

import org.junit.jupiter.api.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testUpdateBestsellers {

    @Test
    public void testUpdateBestSellers() throws SQLException {
        // Given
        DbManager dbManager = DbManager.getInstance();

        String sqlUpdate = "UPDATE BOOKS SET BESTSELLER = FALSE";
        Statement statement = dbManager.getConnection().createStatement();
        statement.executeUpdate(sqlUpdate);

        // When
        String sqlProcedureCall = "CALL UpdateBestsellers()";
        statement.execute(sqlProcedureCall);

        // Then
        String sqlCheckTable = "SELECT COUNT(*) AS HOW_MANY FROM BOOKS WHERE BESTSELLER= FALSE";
        ResultSet rs = statement.executeQuery(sqlCheckTable);
        int howMany = 0;
        if (rs.next()) {
            howMany = rs.getInt("HOW_MANY");
        }
        statement.close();
        rs.close();
        assertEquals(2, howMany);
    }
}

