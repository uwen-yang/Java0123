package com.pcschool.ocp.d16_derby.case1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Random;

public class DeleteRecord1 {

    public static void main(String[] args) throws Exception {
        String jdbcUrl = "jdbc:derby://localhost:1527/demo";//資料庫的位置在哪裡?
        String username = "app";
        String password = "app";
        Connection conn = DriverManager.getConnection(jdbcUrl, username, password);
        String sql = "DELETE FROM book WHERE id =?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        //設定資料表欄位內容(1是代表第一個問號的內容, 2代表第二個問號的內容, ...)
        pstmt.setInt(1, 4);
        pstmt.setInt(2, 1);
        //進行更新 (rowcount 會得到異動比數)
        int rowcount = pstmt.executeUpdate();
        if(rowcount > 0){
            System.out.printf("刪除成功: %d\n", rowcount);  
        }else {
            System.out.printf("刪除失敗: %d\n", rowcount);
        }
    }
}
