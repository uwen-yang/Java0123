package com.pcschool.ocp.d16_derby.case4_book;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/*
   進行 Book 的新增, 修改, 刪除, 查詢之行為
 */
public class BookCRUD {

    private BookDao dao = BookDao.getInstance();
    private Connection conn = dao.getConn();
    // 查詢所有 book 資料
    private List<Book> books;

    public List<Book> queryAll() {
        String sq1 = "SELECT id, bename, price, ts FROM book";
        try (Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sq1)) {
            while (rs.next()) {
                Book book = new Book(rs.getInt("id"),
                        rs.getString("bename"),
                        rs.getInt("price"),
                        rs.getTimestamp("ts"));
                book.add(book);
            }
        } catch (Exception e) {

        }
        return books;
    }

    //查詢單筆資料
    public Book getBook(int id) {
        Book book = null;
        String sq1 = "SELECT id, bname, price, ts FROM book WHERE id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sq1)) {
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                book = new Book(rs.getInt("id"),
                        rs.getString("bename"),
                        rs.getInt("price"),
                        rs.getTimestamp("ts"));
            }
        } catch (Exception e) {
        }

        return book;
    }

    //新增單筆
    public boolean addBook(Book book) {
        String sq1 = "INSERT INTO book(bename, price) VALUES(?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(sq1)) {
            pstmt.setString(1, book.getBname());
            pstmt.setInt(2, book.getPrice());
            int rowcount = pstmt.executeUpdate();
            return rowcount > 0 ? true : false;
        } catch (Exception e) {
        }
        return false;
    }

    //修改單筆
     public boolean updateBook(Book book) {
        String sql = "UPDATE book SET bname=?, price=? WHERE id=?";
        try(PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, book.getBname());
            pstmt.setInt(2, book.getPrice());
            pstmt.setInt(3, book.getId());
            int rowcount = pstmt.executeUpdate();
            return rowcount > 0 ? true : false;
        } catch (Exception e) {
        }
        return false;
    }
//刪除單筆
     public boolean deleteBook(int id) {
        String sql = "DELETE FROM book WHERE id=?";
        try(PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            int rowcount = pstmt.executeUpdate();
            return rowcount > 0 ? true : false;
        } catch (Exception e) {
        }
        return false;
    }
    
    
    
}
