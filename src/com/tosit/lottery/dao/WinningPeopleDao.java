package com.tosit.lottery.dao;

import com.tosit.lottery.entity.WinningPeople;

import java.sql.*;
import java.util.List;

/**
 * Created by DELL on 2016/8/29.
 */
public class WinningPeopleDao {

    public static final String URL="jdbc:mysql://localhost:3306/lottery";
    public static final String USER="root";
    public static final String PASSWORD="root";
    /**
     *保存所有的中奖人信息
     * @param peoples
     */
    public void saveAll(List<WinningPeople> peoples) {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL,USER,PASSWORD);
            conn.setAutoCommit(false);
            PreparedStatement pstmt = conn.prepareStatement("insert into ts_winningpeople(prize,area,row,seat) values(?,?,?,?)", ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            for(WinningPeople people:peoples)
            {
                pstmt.setString(1,people.getPrize());
                pstmt.setInt(2,people.getArea());
                pstmt.setInt(3,people.getRow());
                pstmt.setInt(4,people.getSeat());
                pstmt.addBatch();
            }

            int[] counts = pstmt.executeBatch();
            System.out.println("add : " + counts.length);
            conn.commit();
        }catch (SQLException e)
        {
            try {
                conn.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            e.printStackTrace();
        }finally {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
