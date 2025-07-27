import java.sql.*;
public class JDBCdemo {

	public static void main(String[] args) throws SQLException {
		String url = "jdbc:mysql://localhost3306/jdbcdemo";
		String userName = "root";
		String passWord = "gowsika123";
		String query = "select * from employee";
		Connection con = DriverManager.getConnection(url, userName, passWord);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		rs.next();
		con.close();
	}

}
