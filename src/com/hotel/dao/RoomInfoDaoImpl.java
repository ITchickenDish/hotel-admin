package com.hotel.dao;

import com.hotel.bean.RoomInfo;
import com.hotel.util.DBsql;

import java.sql.Connection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class RoomInfoDaoImpl implements RoomInfoDao{
    @Override
    public int addRoomInfo(RoomInfo roomInfo) throws Exception {
        int key = -1;
        Connection conn = DBsql.getConnection();
        Statement state = (Statement)conn.createStatement();
        String sql = "insert into room_info(room_info_id,room_info_state,room_info_describe,room_info_type)values('"
        +roomInfo.getRoomId()+"','"+roomInfo.getRoomStart()+"','"+roomInfo.getRoomDescribe()+"','"+roomInfo.getRoomType()+"')";
        int result = state.executeUpdate(sql,Statement.RETURN_GENERATED_KEYS);
        if(result == 1){
//            ResultSet keys = state.getGeneratedKeys();
//            keys.next();
//            key = keys.getInt(1);
            System.out.println("yes");
        }

        state.close();
        return key;
    }

    @Override
    public boolean deleteRoomInfo(int roomID) throws Exception{
        boolean flag =false;
        Connection conn = DBsql.getConnection();
        Statement state = (Statement)conn.createStatement();
        String sql ="delete from room_info where room_info_id ="+roomID;
        int result = state.executeUpdate(sql);
        if(result == 1)
            flag = true;
        state.close();
        return flag;
    }

    @Override
    public boolean updateRoomInfo(int roomId,int jude) throws Exception {
        boolean flag = false;
        Connection conn = DBsql.getConnection();
        String sql ="update room_info set room_info_state=? where room_info_id=?";

        PreparedStatement state = conn.prepareStatement(sql);
        if(jude == 1){
            state.setString(1,"已定");
            state.setInt(2,roomId);
        }
        int result = state.executeUpdate();
        if(result == 1)
            flag = true;
         state.close();
        return flag;
    }

    @Override
    public List<RoomInfo> searByType(String roomType) throws Exception {
        List<RoomInfo> result = new ArrayList<RoomInfo>();
        Connection connection = DBsql.getConnection();
        ResultSet rs;
        PreparedStatement pst = connection.prepareStatement("selece *")
        return null;
    }
}
