package com.studentmanagementsystem.studentmanagementsystem.repository;

import com.studentmanagementsystem.studentmanagementsystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

// JpaRepository<Student, type of the primary key >
public interface StudentRepository extends JpaRepository<Student, Long> {
}
