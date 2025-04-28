package Com.jdbcProgrammingday49;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class MetaData2 {
	private static PreparedStatement pstmt;
	private static Connection con;

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection(ConnectionValues.url1,ConnectionValues.user1,ConnectionValues.pwd1);

		if(con==null) {
			System.out.println("Connection Failed");

		}
		else {
			System.out.println("Connected to the Database");

			String sql = "select * from student";
			Statement stmt = con.createStatement();
			ResultSet res = stmt.executeQuery(sql);
			ResultSetMetaData metadata = res.getMetaData();

			int count = metadata.getColumnCount();
			for(int i = 1;i<=count;i++) {
				System.out.println(metadata.getColumnName(i));
				System.out.println(metadata.getColumnDisplaySize(i));
				System.out.println(metadata.getColumnLabel(i));
				System.out.println(metadata.getSchemaName(i));
				System.out.println(metadata.getTableName(i));
				System.out.println(metadata.getColumnClassName(i));
				System.out.println(metadata.isAutoIncrement(i));
				System.out.println(metadata.isNullable(i));
				System.out.println(metadata.isCaseSensitive(i));
				System.out.println(metadata.isReadOnly(i));
				System.out.println(metadata.isWritable(i));
				System.out.println("=============================");
			}
		}
	}
}

