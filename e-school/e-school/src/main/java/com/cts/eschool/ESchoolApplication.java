package com.cts.eschool;

import com.cts.eschool.Service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ESchoolApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext ss = SpringApplication.run(ESchoolApplication.class, args);
		StudentService s = ss.getBean(StudentService.class);
		s.addNewStudentDetail(101, "Apoorva", 80);
		s.addNewStudentDetail(102, "Alex", 92);
		s.addNewStudentDetail(103, "Park", 65);

		s.getAllStudentDetails();
		s.getStudentDetailsById(101);
		s.updateStudentScore(101,85);
		s.deleteStudentDetails(102);
		s.getAllStudentDetails();
	}

}
