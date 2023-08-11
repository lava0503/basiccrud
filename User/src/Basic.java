import java.sql.*;
public class Basic {
	public void getcontectivity() throws SQLException{
		String url="jdbc:mysql://127.0.0.1:3306/details";
		String username="root";
		String password="1101";
		String Query=("insert into  college values(?,?)");
		
		Connection con=DriverManager.getConnection(url,username,password);
		PreparedStatement pst=con.prepareStatement(Query);
		pst.setString( 1,"lavanya");
		pst.setInt(2, 1);
		pst.executeUpdate();
		
	}
	

}
