package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * Created by sooheib on 02/02/16.
 */
public class DataSource {
    private Connection connection;
    private String url;
    private  String login;
    private String password;
    private Properties properties;
    private static DataSource instance;
    private DataSource(){
        Properties properties=new Properties();
        try {
            properties.load(new FileInputStream(new File("Configuration.properties")));
           /*********************************Recuperation url-login-password****************************/
            url=properties.getProperty("url");
            login=properties.getProperty("login");
            password=properties.getProperty("password");
            /*********************************Etablir CNX****************************/
            connection= DriverManager.getConnection(url,login,password);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static DataSource getInstance(){
        if(instance==null)
            instance=new DataSource();
        return instance;
    }
    public Connection getConnection(){
        return connection;
    }
}
