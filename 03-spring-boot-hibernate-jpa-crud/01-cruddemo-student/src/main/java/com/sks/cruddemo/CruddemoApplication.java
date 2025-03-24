package com.sks.cruddemo;

import com.sks.cruddemo.dao.StudentDAO;
import com.sks.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDao) {
		return runner -> {
			//createStudent(studentDao);
			//createMultiStudent(studentDao);
			//readStudent(studentDao);

			//queryForStudent(studentDao);
			//queryByLastName(studentDao);
			//updateStudent(studentDao);
			//deleteStudent(studentDao);
			deleteAll(studentDao);
		};
	}

	private void deleteAll(StudentDAO studentDAO) {
		studentDAO.deleteAll();
	}

	private void deleteStudent(StudentDAO studentDao) {
		studentDao.delete(1);
	}

	private void updateStudent(StudentDAO studentDao) {
		int studentId = 1;
		Student student = studentDao.findById(studentId);
		student.setEmail("sunilsuman@yahoo.com");
		studentDao.updateStudent(student);
	}

	private void queryByLastName(StudentDAO studentDao) {
		List<Student> list = studentDao.findByLastName("Suman");
		for(Student st : list) {
			System.out.println(st);
		}
	}

	private void queryForStudent(StudentDAO studentDao) {
		List<Student> listOfStudent = studentDao.findAll();
		for(Student student : listOfStudent) {
			System.out.println(student);
		}
	}

	private void readStudent(StudentDAO studentDao) {
		//create student object
		System.out.println("create Student object");
		Student student = new Student("Lisa", "Suman", "lisa@gmail.com");

		//save the student object
		System.out.println("save student");
		studentDao.save(student);

		//display saved id
		int id = student.getId();
		System.out.println("saved Student id = "+id);

		//retrieve student based by id
		Student savedStudent = studentDao.findById(id);

		//display student
		System.out.println("found student = "+ savedStudent);

	}

	private void createMultiStudent(StudentDAO studentDao) {
		System.out.println("creating student object***");

		Student tmpStudent1 = new Student("Sunil4", "Suman4","sks4@gmail.com");
		Student tmpStudent2 = new Student("Sunil1", "Suman1","sks1@gmail.com");
		Student tmpStudent3 = new Student("Sunil2", "Suman2","sks2@gmail.com");
		studentDao.save(tmpStudent1);
		studentDao.save(tmpStudent2);
		studentDao.save(tmpStudent3);
	}

	private void createStudent(StudentDAO studentDao) {
		//create student object
		System.out.println("creating student object***");

		Student tmepStudent = new Student("Sunil", "Suman","sks@gmail.com");


		//save the student object

		studentDao.save(tmepStudent);

		//display the id of student
		System.out.println(tmepStudent.getId());
	}

}
