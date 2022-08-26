package com.in.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.in.entity.Course;
import com.in.entity.Student;
import com.in.repository.Courserepos;
import com.in.repository.Studentrepos;



@Service
public class StudentServe {

	@Autowired
	private Studentrepos repo;
	
	@Autowired
	private Courserepos repoc;
    
	 
	 public String store()
	
	{
    	
		Student s1=new Student();
    	
    	s1.setName("Raju");
    	s1.setCity("Hyd");
    	
        Student s2=new Student();
    	
    	s2.setName("kaushi");
    	s2.setCity("chenna");
    	
    	List<Student> ls = Arrays.asList(s1,s2);

    	
    	Course c1=new Course();
    	
    	c1.setName("java");
    	c1.setLs(Arrays.asList(ls.get(0)));   
    	    
        Course c2=new Course();
        
    	c2.setName("cp");
        c2.setLs(Arrays.asList(ls.get(0)));
    	
        
        c1.setLs(Arrays.asList(ls.get(1)));
    	
        List<Course> lc = Arrays.asList(c1,c2);
    	
    	s1.setLc(lc);
    	
    	s2.setLc(Arrays.asList(lc.get(0)));
    	
    	repo.save(s1);
    	
    	repo.save(s2);
    	
    	

    	
    	
    	
    
    	return "success";
    }
    
    
    public Student getStud()
    {
    	Student s = repo.findById(1).get();
    	
    	return s;
    	
    	
    }
    
    
   
}
