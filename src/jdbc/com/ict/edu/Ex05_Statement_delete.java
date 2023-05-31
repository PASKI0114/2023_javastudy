package jdbc.com.ict.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

//박세리의 주소를 대한민국 제주도. 전화번호를 000-9000-0001로 변경하자
public class Ex05_Statement_delete {
	public static void main(String[] args) {
		//오라클에 접속하고 처리하기 위한 3개자 클래스
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		int result = 0;
		try {//1
			Class.forName("oracle.jdbc.driver.OracleDriver"); //4
			String url = "jdbc:oracle:thin:@localhost";
			String user = "c##pletta";
			String password = "1111";
			conn = DriverManager.getConnection(url, user, password);//5
			
			String sql = "delete from customer where name = '이강인'";
			
			stmt = conn.createStatement();//7
			result = stmt.executeUpdate(sql);//8
			if(result>0) {//9
				sql = "select * from customer order by custid";
				rs = stmt.executeQuery(sql);
				while(rs.next()) {
					System.out.print(rs.getString(1)+"\t");
					System.out.print(rs.getString(2)+"\t");
					System.out.print(rs.getString(3)+"\t");
					System.out.print(rs.getString(4)+"\n");
				}
			}
			
		} catch (Exception e) {
		} finally {
			try {//2
				rs.close();//3
				stmt.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
	}
}
