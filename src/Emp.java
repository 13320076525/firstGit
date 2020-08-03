import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Emp {
	
	private Connection conn;
	private ResultSet rs;
	private PreparedStatement ps;
	private static int a;
	private int b;
	
	
	public static int getA() {
		return a;
	}

	public static void setA(int a) {
		Emp.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int update(String name,int empno) {
		int flag=0;
		String sql="update emp set ename=? where empno=?";
		conn=JdbcUtil.init().getConnection();
		try {
			ps=conn.prepareStatement(sql);
			ps.setString(1, name);
			ps.setInt(2, empno);
			
			flag=ps.executeUpdate();
	
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JdbcUtil.init().close(conn, ps, rs);
		}
		return flag;		
		
	}
}
