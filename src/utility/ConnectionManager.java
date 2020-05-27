package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import oracle.jdbc.OracleConnection.CommitOption;

public class ConnectionManager {
	public static Connection getConnection() throws IOException, ClassNotFoundException, SQLException {
		
		Connection con= null;
		Properties p = loadPropertiesFile();
		String driver = p.getProperty("driver");
		String url = p.getProperty("url");
		String username = p.getProperty("username");
		String password = p.getProperty("password");
		
		Class.forName(driver);
		
		con = DriverManager.getConnection(url,username,password);
		return con;
		
	}
	public static Properties loadPropertiesFile() throws IOException {
		Properties p =new Properties();
		FileInputStream fs = new FileInputStream("D:\\jdbc projects\\lab-jdbc-connection\\src\\jdbc.properties");
		p.load(fs);
		fs.close();
		return p;
		
	}
	
}
