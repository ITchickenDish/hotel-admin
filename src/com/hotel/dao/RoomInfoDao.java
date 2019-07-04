package com.hotel.dao;

import com.hotel.bean.RoomInfo;

import java.rmi.server.ExportException;
import java.util.*;

public interface RoomInfoDao {
    //增加房间信息
    int addRoomInfo(RoomInfo roomInfo)throws Exception;
    //删除房间信息
    boolean deleteRoomInfo(int roomId)throws Exception;
    //修改房间信息
    boolean updateRoomInfo(int roomId,String update)throws  Exception;
    //按照类型搜索房间
    List<RoomInfo>searByroomId(int roomId)throws Exception;
    //全部客房
    List<RoomInfo>searchAll()throws Exception;
}
