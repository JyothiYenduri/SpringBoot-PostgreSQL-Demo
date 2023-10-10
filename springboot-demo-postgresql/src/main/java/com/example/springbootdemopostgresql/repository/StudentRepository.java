package com.example.springbootdemopostgresql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springbootdemopostgresql.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
