package com.keven.dp.flyweight;
/** 
* @author Keven  Email:tv2014@126.com
* @version 创建时间：2019年3月21日 下午2:56:14 
* 说明 :
*/
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Vector;;
public class ConnectionPool {
	private Vector<Connection> pool;
	
	private String url = "jdbc:mysql://localhost:3306/test";
	private String userName = "root";
	private String passWord = "root";
	private String driveClasssName= "com.mysql.jdbc.Driver";
	
	private int poolSize = 10;
	private static ConnectionPool instance = null;
	private Connection conn;
	
	public static ConnectionPool getInstance() {
		if (instance == null) {
			inistConect();
		}
		return instance;
	}
	private static synchronized void inistConect() {
		if (instance ==null) {
			instance = new ConnectionPool();
		}

	}
	
	private ConnectionPool() {
		pool = new Vector<Connection>(poolSize);
		for(int i = 0 ; i<poolSize;i++){
			try{
				Class.forName(driveClasssName);
				conn = DriverManager.getConnection(url,userName,passWord);
				pool.add(conn);
			}catch(ClassNotFoundException e){
				e.printStackTrace();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		
	}
	
	
	public synchronized void release(Connection conn){
		pool.add(conn);
	}
	
	public synchronized Connection getConnection(){
		if(pool.size()>0){
			Connection connection = pool.get(0);
			pool.remove(connection);
			return connection;
		}else{
			return null;
		}
	}

}
