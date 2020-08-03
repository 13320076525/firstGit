

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 * 工具类
 * @author 李家万
 * @version 1.0 2020-6-19
 */
public class JdbcUtil {
	private static JdbcUtil util=new JdbcUtil();
	private Connection conn;
	private JdbcUtil() {
		try {
			//加载驱动
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static JdbcUtil init() {
		return util;
	}
	
	/**
	 * 获取数据库连接
	 * @return 
	 */
	public Connection getConnection() {
		try {
			conn=DriverManager.getConnection("jdbc:oracle:thin:@10.1.15.199:1521:orcl","scott","tiger");//10.1.15.199
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	//192.168.43.41
	/**
	 * 关闭资源
	 * @param conn
	 * @param ps
	 * @param rs
	 */
	public void close(Connection conn,PreparedStatement ps,ResultSet rs) {
		try {
			if(rs!=null) {
				rs.close();
			}			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		try {
			if(ps!=null) {
				ps.close();
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		try {
			if(conn!=null) {
				conn.close();
			}			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	
	}
	
}
