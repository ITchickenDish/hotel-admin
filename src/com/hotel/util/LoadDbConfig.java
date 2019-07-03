package com.hotel.util;

import org.apache.commons.io.FileUtils;
import org.json.JSONObject;

import java.io.File;

    public class LoadDbConfig {
        private String userName;
        private String passwd;
        private String setting;
        private String dbClass;
        private String dbName;
        private String port;
        private String host;
        public LoadDbConfig(){
            File file=new File("src/DbConfig.json");
            try {
                String content= FileUtils.readFileToString(file,"UTF-8");
                JSONObject jsonObject=new JSONObject(content);
                setUserName(jsonObject.getString("userName"));
                setPasswd(jsonObject.getString("password"));
                setSetting(jsonObject.getString("otherSetting"));
                setDbClass(jsonObject.getString("datebase"));
                setDbName(jsonObject.getString("datebaseName"));
                setPort(jsonObject.getString("port"));
                setHost(jsonObject.getString("host"));
            }
            catch (Exception e){
                System.out.println("配置文件读取失败");
            }
        }


        public String getHost() {
            return host;
        }

        public void setHost(String host) {
            this.host = host;
        }

        public static void main(String[] args) {
            LoadDbConfig loadDbConfig = new LoadDbConfig();
            System.out.println("userName:" + loadDbConfig.getUserName());
            System.out.println("passwd:" + loadDbConfig.getPasswd());
            System.out.println("class:" + loadDbConfig.getDbClass());
            System.out.println("port:" + loadDbConfig.getPort());
            System.out.println("setting:" + loadDbConfig.getSetting());
            System.out.println("dbname" + loadDbConfig.getDbName());
        }
        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getPasswd() {
            return passwd;
        }

        public void setPasswd(String passwd) {
            this.passwd = passwd;
        }

        public String getSetting() {
            return setting;
        }

        public void setSetting(String setting) {
            this.setting = setting;
        }

        public String getDbClass() {
            return dbClass;
        }

        public void setDbClass(String dbClass) {
            this.dbClass = dbClass;
        }

        public String getDbName() {
            return dbName;
        }

        public void setDbName(String dbName) {
            this.dbName = dbName;
        }

        public String getPort() {
            return port;
        }

        public void setPort(String port) {
            this.port = port;
        }

    }
