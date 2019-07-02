package bean;

public class RoomInfo {
    private int roomId;
    private  String roomStart;
    private  String roomDescribe;
    private  String roomTypeId;
    public RoomInfo(int roomId,String roomStart,String roomDescribe,String roomTypeId){
            this.setRoomId(roomId);
            this.setRoomStart(roomStart);
            this.setRoomDescribe(roomDescribe);
            this.setRoomTypeId(roomTypeId);
    }




    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public String getRoomStart() {
        return roomStart;
    }

    public void setRoomStart(String roomStart) {
        this.roomStart = roomStart;
    }

    public String getRoomDescribe() {
        return roomDescribe;
    }

    public void setRoomDescribe(String roomDescribe) {
        this.roomDescribe = roomDescribe;
    }

    public String getRoomTypeId() {
        return roomTypeId;
    }

    public void setRoomTypeId(String roomTypeId) {
        this.roomTypeId = roomTypeId;
    }
}
