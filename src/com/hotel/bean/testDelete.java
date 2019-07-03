package com.hotel.bean;

import com.hotel.dao.RoomInfoDaoImpl;

public class testDelete {
    public static void main(String[] args) {
        RoomInfoDaoImpl a = new RoomInfoDaoImpl();
        try {
            a.deleteRoomInfo(205);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
