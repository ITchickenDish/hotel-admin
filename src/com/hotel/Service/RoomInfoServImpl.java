package com.hotel.Service;

import com.hotel.bean.RoomInfo;
import com.hotel.dao.RoomInfoDao;

import java.util.List;

public class RoomInfoServImpl implements RoomInfoService{
    private RoomInfoDao roomInfoDao;
    public RoomInfoServImpl(RoomInfoDao roomInfodao){
        this.roomInfoDao = roomInfodao;
    }
    @Override
    public List<RoomInfo> searchAll() {
        try{
            return roomInfoDao.searchAll();
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<RoomInfo> searByroomId(int roomId) {
        try{
            return roomInfoDao.searByroomId(roomId);
        }catch (Exception e){
            e.printStackTrace();
        }
        return  null;
    }

    @Override
    public boolean updateRoomInfo(int roomId, String update) throws Exception {
        try{
            return roomInfoDao.updateRoomInfo(roomId,update);
        }catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public int addRoomInfo(RoomInfo roomInfo) throws Exception {
        try{
            return roomInfoDao.addRoomInfo(roomInfo);
        }catch (Exception e){
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public boolean deleteRoomInfo(int roomId) throws Exception {
        try{
            return  roomInfoDao.deleteRoomInfo(roomId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
