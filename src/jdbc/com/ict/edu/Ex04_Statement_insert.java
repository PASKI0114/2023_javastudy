package jdbc.com.ict.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ex04_Statement_insert {
	public static void main(String[] args) {
	//1. java를 오라클에 접속할수있도록 도와주는 클래스
			Connection conn = null;
			Statement stmt = null;
			ResultSet rs = null;
			
			int result = 0 ;
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				
				//5.접속하기 위한 정보 저장
				String url = "jdbc:oracle:thin:@localhost";
				String user = "c##pletta";
				String password = "1111";
				
				//6.접속하기 :
				conn = DriverManager.getConnection(url, user, password);
				
				//7.SQL작성하기
				String sql = "insert into customer(custid,name,addr,phone)"
						+ "values(6,'이강인', '대한민국 서울', '010-9000-0001')";
				
				//8.SQL을 보낼수있는 구문 만들기
				stmt = conn.createStatement();
				result = stmt.executeUpdate(sql);
				
				
				if(result > 0) {
					sql ="select * from customer order by custid asc";
					//stmt = conn.createStatement();
					rs = stmt.executeQuery(sql);
					
					while(rs.next()) {
						System.out.print(rs.getString(1)+"\t");
						System.out.print(rs.getString(2)+"\t");
						System.out.print(rs.getString(3)+"\t");
						System.out.print(rs.getString(4)+"\n");
					}
				}else{
					System.out.println("삽입실패");
				}
				
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				try {
					rs.close();
					stmt.close();
					conn.close();
				} catch (Exception e2) {
				}
			}
		}
	}

