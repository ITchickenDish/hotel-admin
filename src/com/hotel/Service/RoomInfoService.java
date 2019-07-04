package com.hotel.Service;

import com.hotel.bean.RoomInfo;

import java.util.List;

public interface RoomInfoService {
    List<RoomInfo>searchAll();
    List<RoomInfo>searByroomId(int roomId);
    boolean updateRoomInfo(int roomId,String update)throws  Exception;
    int addRoomInfo(RoomInfo roomInfo)throws Exception;
    boolean deleteRoomInfo(int roomId)throws Exception;
}
