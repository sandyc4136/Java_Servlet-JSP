package com.cdac.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class QuestionLoader {

	public List<Question> loadQuestions() { 
		Connection conn = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); 			
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cdac","root","Ayesha@4136"); //establishes a connection to the MySQL database.
			String sql="select * from tbl_question";
			
			PreparedStatement stmt=conn.prepareStatement(sql); // PreparedStatement is used to safely pass parameters to the SQL query. 
			ResultSet rs=stmt.executeQuery();  
			
			List<Question> list = new ArrayList<>();
				
			while(rs.next()){
				Question q = new Question();
				q.setId(rs.getInt("id"));
				q.setQuestion(rs.getString("question"));
				q.setOption1(rs.getString("option1"));
				q.setOption2(rs.getString("option2"));
				q.setOption3(rs.getString("option3"));
				q.setOption4(rs.getString("option4"));
				q.setRightAnswer(rs.getInt("right_answer"));
				list.add(q);
				}
			
				return list; // The method returns the list of Product objects retrieved from the database.
			}
			catch(ClassNotFoundException | SQLException e) {
				e.printStackTrace();	
					return null; 	
				}
			finally {
				try { conn.close(); } catch(Exception e) {}
			}
	}
}
