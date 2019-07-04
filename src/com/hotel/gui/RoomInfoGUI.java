package com.hotel.gui;

import com.hotel.Service.RoomInfoServImpl;
import com.hotel.Service.RoomInfoService;
import com.hotel.bean.RoomInfo;
import com.hotel.dao.RoomInfoDaoImpl;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
public class RoomInfoGUI extends RefreshPal implements ActionListener {
    private InfoPal roomInfo;
    private List<String> lblItemNames;
    private List<JComponent> cptItems;
    private List<JButton> btnCommond;
    private RoomInfoService p;
    public RoomInfoGUI(){
        lblItemNames = new ArrayList<String>();
        lblItemNames.add("房间号");
        lblItemNames.add("状态");
        lblItemNames.add("房间描述");
        lblItemNames.add("房间类型");
        //
        lblItemNames.add("房间价格");
        cptItems = new ArrayList<JComponent>();
        for(int i = 0 ;i < 5 ;i++){
            JTextField t = new JTextField(15);
            t.setMaximumSize(t.getPreferredSize());
            cptItems.add(t);
        }
        DefaultListModel<String>model = new DefaultListModel<String>();
        btnCommond = new ArrayList<JButton>();
        btnCommond.add(new JButton("查询"));
        btnCommond.add(new JButton("添加房间"));
        btnCommond.add(new JButton("删除房间"));
        btnCommond.add(new JButton("修改房间状态"));
        btnCommond.add(new JButton("房间类型"));
        for (int i = 0;i<btnCommond.size();i++){
            btnCommond.get(i).addActionListener(this);
        }
        try{
            roomInfo =new InfoPal(lblItemNames,cptItems,btnCommond,3);
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.add(roomInfo);
        p = new RoomInfoServImpl(new RoomInfoDaoImpl());
        fresh();
    }
    @Override
    public void fresh() {
            try{
                roomInfo.freshTable(p.searchAll());
            }catch (Exception e){
                e.printStackTrace();
            }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getActionCommand().equals("查询")){
           String roomid;
           int roomId;
           roomid = ((JTextField)cptItems.get(0)).getText().toString();
           roomId = Integer.parseInt(roomid);
           roomInfo.freshTable(p.searByroomId(roomId));


       }else if(e.getActionCommand().equals("添加房间")){
           RoomInfo add = new RoomInfo();
           String roomid;
           int roomID;
           roomid = ((JTextField)cptItems.get(0)).getText().toString();
           roomID = Integer.parseInt(roomid);
           add.setRoomId(roomID);
           add.setRoomStart(((JTextField)cptItems.get(1)).getText().toString());
           add.setRoomDescribe(((JTextField)cptItems.get(2)).getText().toString());
           add.setRoomType(((JTextField)cptItems.get(3)).getText().toString());
           try {
               p.addRoomInfo(add);
               JOptionPane.showMessageDialog(null,"添加成功");
           } catch (Exception ex) {
               ex.printStackTrace();
           }


       }else if(e.getActionCommand().equals("删除房间")){
           int roomId;
           String roomid;
           roomid = ((JTextField)cptItems.get(0)).getText().toString();
           roomId = Integer.parseInt(roomid);
           try {
               p.deleteRoomInfo(roomId);
               JOptionPane.showMessageDialog(null,"删除成功");
           } catch (Exception ex) {
               ex.printStackTrace();
           }


       }else if(e.getActionCommand().equals("修改房间状态")){
           String roomid = ((JTextField)cptItems.get(0)).getText().toString();
           String update = ((JTextField)cptItems.get(1)).getText().toString();
           System.out.println(update);
           if(update == null || update.equals("")){
               JOptionPane.showMessageDialog(null,"此项不能为空");
           } else {
               int roomID;
               roomID = Integer.parseInt(roomid);
               try {
                   p.updateRoomInfo(roomID,update);
                   JOptionPane.showMessageDialog(null,"更改成功");
               } catch (Exception ex) {
                   ex.printStackTrace();
               }
           }

       }else if(e.getActionCommand().equals("房间类型"));
    }
}
