package com.script972.Model;

import com.mysql.fabric.jdbc.FabricMySQLDriver;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;


/**
 * Created by script972 on 27.12.2016.
 */
public class DBProcessor {
    private Connection connection;
    public void DBProcessor()throws SQLException {
        DriverManager.registerDriver(new FabricMySQLDriver());
    }

    public Connection getConnection(String url, String username, String password) throws SQLException{
        if(connection!=null)
            return connection;
        connection=DriverManager.getConnection(url,username,password);
        return connection;

    }


}


