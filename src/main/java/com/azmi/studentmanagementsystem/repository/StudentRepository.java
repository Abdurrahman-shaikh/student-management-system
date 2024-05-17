package com.azmi.studentmanagementsystem.repository;

import com.azmi.studentmanagementsystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//@Repository and @Transactional not required because they have default implementation class SimpleJpaRepository which is annotated using @Repository and @Transactional
public interface StudentRepository extends JpaRepository<Student, Long> {
}