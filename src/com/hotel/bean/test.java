package com.hotel.bean;

import com.hotel.dao.RoomInfoDaoImpl;

public class test {
    public static void main(String[] args) {

        try {
            RoomInfo a = new RoomInfo(209,"空闲","配有空调","大床房");
            RoomInfoDaoImpl b = new RoomInfoDaoImpl();
            b.addRoomInfo(a);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
