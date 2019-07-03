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
    boolean updateRoomInfo(int roomId,int jude)throws  Exception;
    //按照类型搜索房间
    List<RoomInfo>searByType(String roomType)throws Exception;
}
