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

    private DataSource(){
        Properties properties=new Properties();
        try {
            properties.load(new FileInputStream(new File("Configuration.properties")));
            url=properties.getProperty("url");
            login=properties.getProperty("login");
            password=properties.getProperty("password");
            connection= DriverManager.getConnection(url,login,password);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
