package com.hotel.util;

import com.alibaba.druid.pool.DruidDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class DBsql {
    private static DruidDataSource dataSource =  null;
    static {
        try {
            dataSource = new DruidDataSource();
            LoadDbConfig config = new LoadDbConfig();
            String url = String.format("jdbc:%s://%s:%s/%s?%s"
                    ,config.getDbClass(),config.getHost(),config.getPort(),config.getDbName(),config.getSetting());
            dataSource.setUrl(url);
            dataSource.setUsername(config.getUserName());
            dataSource.setPassword(config.getPasswd());
            dataSource.setInitialSize(5);
            dataSource.setPoolPreparedStatements(false);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    public static synchronized Connection getConnection(){
        Connection conn = null;
        try {
            conn = dataSource.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
}
