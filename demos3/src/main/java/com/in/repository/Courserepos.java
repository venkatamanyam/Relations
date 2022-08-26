package com.in.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in.entity.Course;



public interface Courserepos extends JpaRepository<Course,Integer>{

}
