package com.azmi.studentmanagementsystem;

import com.azmi.studentmanagementsystem.entity.Student;
import com.azmi.studentmanagementsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
		Student student1 = new Student("Abdur", "Rahman", "abdur@gmail.com");
		studentRepository.save(student1);

		Student student2 = new Student("Snjay", "Jadhav", "sanjay@gmail.com");
		studentRepository.save(student2);

		Student student3 = new Student("Raju", "Jadhav", "raju@gmail.com");
		studentRepository.save(student3);
	}
}
