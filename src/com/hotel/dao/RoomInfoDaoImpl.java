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
    public boolean updateRoomInfo(int roomId,String update) throws Exception {
        boolean flag = false;
        Connection conn = DBsql.getConnection();
        String sql ="update room_info set room_info_state=? where room_info_id=?";

        PreparedStatement state = conn.prepareStatement(sql);
            state.setString(1,update);
            state.setInt(2,roomId);
        int result = state.executeUpdate();
        if(result == 1)
            flag = true;
         state.close();
        return flag;
    }

    @Override
    public List<RoomInfo> searByroomId(int roomId) throws Exception {
        List<RoomInfo> result = new ArrayList<RoomInfo>();
        Connection connection = DBsql.getConnection();
        ResultSet rs;
        PreparedStatement pst = connection.prepareStatement("select room_info.*,roomtype_info.roomtype_info_price from room_info,roomtype_info where room_info.room_info_id = ? and room_info.room_info_type = roomtype_info.roomtype_info_name");
        pst.setInt(1,roomId);
        rs = pst.executeQuery();
        while (rs.next()){
            int roomid = rs.getInt(1);
            String roomState = rs.getString(2);
            String roomdescribe = rs.getString(3);
            String roomTy = rs.getString(4);
            String roomPrice = rs.getString(5);
            RoomInfo roomInfo = new RoomInfo();
            roomInfo.setRoomId(roomid);
            roomInfo.setRoomStart(roomState);
            roomInfo.setRoomDescribe(roomdescribe);
            roomInfo.setRoomType(roomTy);
            roomInfo.setPice(roomPrice);
            result.add(roomInfo);
        }
        rs.close();
        pst.close();
        return result;
    }

    @Override
    public List<RoomInfo> searchAll() throws Exception {
        List<RoomInfo> result = new ArrayList<RoomInfo>();
        Connection conn = DBsql.getConnection();
        ResultSet rs;
        Statement st = (Statement)conn.createStatement();
        rs = st.executeQuery("select room_info.*,roomtype_info.roomtype_info_price from room_info,roomtype_info where room_info.room_info_type = roomtype_info.roomtype_info_name");
        while (rs.next()){
            RoomInfo a = new RoomInfo();
            a.setRoomId(rs.getInt(1));
            a.setRoomStart(rs.getString(2));
            a.setRoomDescribe(rs.getString(3));
            a.setRoomType(rs.getString(4));
            a.setPice(rs.getString(5));
            result.add(a);
        }
        rs.close();
        st.close();
        return result;
    }
}
