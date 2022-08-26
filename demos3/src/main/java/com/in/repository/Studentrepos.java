package com.in.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.in.entity.Student;

public interface Studentrepos extends JpaRepository<Student,Integer> {

}
