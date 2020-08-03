import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Emp2 {
	
	private static Emp2 emp=new Emp2();
	
	private Emp2() {
		
	}
	
	public static Emp2 getEmp() {
		return emp;
	}
	
}
