package com.pcschool.ocp.d16_derby.case2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Random;

public class UpdateRecord {

    public static void main(String[] args) throws Exception {
        String jdbcUrl = "jdbc:derby://localhost:1527/demo";//資料庫的位置在哪裡?
        String username = "app";
        String password = "app";
        Connection conn = DriverManager.getConnection(jdbcUrl, username, password);
        //假設要修改 id = 1 這一筆的價格 = 600
        Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
        String sq1 = "SELECT * FROM book WHERE id = 1";
        ResultSet rs = stmt.executeQuery(sq1);
        if (rs.last()) {
            rs.updateInt("price", 600);
            rs.updateRow();
            System.out.println("Update OK");
        } else {
            System.out.println("Update Error (查無資料)");
        }
        conn.close();
    }
}
