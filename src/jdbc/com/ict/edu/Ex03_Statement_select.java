package jdbc.com.ict.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//customer 테이블에서 박씨성을 가진 사람의 모든정보 검색
public class Ex03_Statement_select {
	public static void main(String[] args) {
		// 1~3부터 먼저쓰기

		// 1. java를 오라클에 접속할수있도록 도와주는 클래스
		Connection conn = null;
		// 2. SQL 구문 작성을 도와주는 클래스
		Statement stmt = null;
		// 3-1. select 문의 결과를 받는 클래스
		ResultSet rs = null;
		// 3-2 select문을 제외한 결과를 받는 변수
		int result = 0;
		// 4.jdbc 드라이버 로딩 : 오라클, MySQL등 각각 내용이 다르다.
		try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
			// 5.접속하기 위한 정보 저장
			// 오라클과 MySQL 각각 내용이 다르다.
			String url = "jdbc:oracle:thin:@localhost";
			String user = "c##pletta";
			String password = "1111";

			// 6.접속하기 :
			conn = DriverManager.getConnection(url, user, password);

			// 7.SQL작성하기
			String sql = "SELECT * FROM customer WHERE name LIKE '박%'";

			// 8.SQL을 보낼수있는 구문 만들기
			stmt = conn.createStatement();

			// 9.SQL을 담아서 보내고 결과받기
			// 9-1.select
			rs = stmt.executeQuery(sql);

			// 9-2. select 제외(insert, update, delete)
			// result = stmt.excuteUpdate(sql);
			// 이거 열임
			while (rs.next()) {
				System.out.print(rs.getString(1) + "\t");
				System.out.print(rs.getString(2) + "\t");
				System.out.print(rs.getString(3) + "\t");
				System.out.println(rs.getString(4) + "\t");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
