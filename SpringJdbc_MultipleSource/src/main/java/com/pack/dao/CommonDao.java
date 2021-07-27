package com.pack.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.pack.model.Employee;
import com.pack.model.Student;

@Repository
public class CommonDao {
	
	@Autowired 
	JdbcTemplate jdbctemplateOne;
	
	@Autowired 
	JdbcTemplate jdbctemplateTwo;
	
	  
	 
	
 
	public void insertEmployee(Employee emp) {
		String sql = "INSERT INTO employee values(?,?)";
				 
		jdbctemplateOne.update(sql,emp.getEmpId(), emp.getEmpName());
				
			 
	}
	
	
	 
	
	  public void insertStudent(Student stud) {
		  String sql= "INSERT INTO student values(?,?)";
	  
	  jdbctemplateTwo.update(sql,stud.getId(),stud.getName());
	  
	  
	    
	  }
	 
}

 
