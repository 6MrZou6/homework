package org.zoudeng.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.zoudeng.entity.Login;

//ģ�Ͳ㣬���ڴ����¼����ѯ���ݣ�
public class LoginDao {
public static int login(Login login) {//��¼
	PreparedStatement pstmt=null;
	Connection connection =null;
	ResultSet rs=null;
	
	int result=-1;  //-1  ϵͳ�쳣  0��¼ʧ�ܣ��û������������   1����¼�ɹ���
	try {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databasename=studb","sa","zd666999");
	String sql="select count(*) from UserInfo where UserName=? and UserPwd=?";
	pstmt = connection.prepareStatement(sql);
	pstmt.setString(1, login.getUserName());
	pstmt.setString(2, login.getUserPwd());
	rs = pstmt.executeQuery();
	while(rs.next()) {
		result=rs.getInt(1);
	}if(result>0) {
		return 1;
	}else {
		return 0;
	}
		
	}  catch (SQLException e) {

		e.printStackTrace();
		return -1;
	}
	catch (ClassNotFoundException e) {

		e.printStackTrace();
		return -1;
	}
	catch (Exception e) {
		e.printStackTrace();
		return -1;
	}finally {
		if(rs!=null)
			try {
				if(rs!=null)
				rs.close();
				if(connection!=null)
					connection.close();
				if(pstmt!=null)
					pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
	}

}
}
