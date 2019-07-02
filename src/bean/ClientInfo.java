package bean;

public class ClientInfo {
    private int clientID;
    private String clientName;
    private String clientSex;
    private String clientPhone;
    private String clientIdent;
    private String clientAccount;
    private String clientKey;
    public ClientInfo(){

    }

 public ClientInfo(String clientName,String clientSex,String clientPhone,String clientIdent,String clientKey){
        this.setClientName(clientName);
        this.setClientSex(clientSex);
        this.setClientPhone(clientPhone);
        this.setClientIdent(clientIdent);
        this.setClientAccount(clientAccount);
        this.setClientKey(clientKey);
        clientID = -1;
 }


    public int getClientID() {
        return clientID;
    }

//    public void setClientID(int clientID) {
//        this.clientID = clientID;
//    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientSex() {
        return clientSex;
    }

    public void setClientSex(String clientSex) {
        this.clientSex = clientSex;
    }

    public String getClientPhone() {
        return clientPhone;
    }

    public void setClientPhone(String clientPhone) {
        this.clientPhone = clientPhone;
    }

    public String getClientIdent() {
        return clientIdent;
    }

    public void setClientIdent(String clientIdent) {
        this.clientIdent = clientIdent;
    }

    public String getClientAccount() {
        return clientAccount;
    }

    public void setClientAccount(String clientAccount) {
        this.clientAccount = clientAccount;
    }

    public String getClientKey() {
        return clientKey;
    }

    public void setClientKey(String clientKey) {
        this.clientKey = clientKey;
    }
}
