package com.pcschool.ocp.d16_derby;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import javax.naming.spi.DirStateFactory;

public class SelectRecord {

    public static void main(String[] args) throws Exception {
        String jdbcUrl = "jdbc:derby://localhost:1527/demo";//資料庫的位置在哪裡?
        String username = "app";
        String password = "app";
        Connection conn = DriverManager.getConnection(jdbcUrl, username, password);
        //建立資料庫連線
        Statement stmt = conn.createStatement();
        //執行查詢SQL
        String sql = "SELECT id, bename, ts FROM book";
        ResultSet rs = stmt.executeQuery(sql);
        //將資料輪循後印出
        System.out.printf("%4s %10s %4s %30s\n","序號","書名","價格","建立時間");
        System.out.printf("----------------------------------------------\n");
        while (rs.next()) {
            int id = rs.getInt("id");
            String bename = rs.getString("bename");
            int price = rs.getInt("price");
            Timestamp ts = rs.getTimestamp("ts");
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E");
            System.out.printf("%4d %10s %4d %20s\n", id, bename, price, sdf.format(ts));

        }

        //關閉連線
        conn.close();
    }
}
