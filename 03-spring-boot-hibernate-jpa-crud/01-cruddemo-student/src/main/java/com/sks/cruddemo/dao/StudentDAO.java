package com.sks.cruddemo.dao;

import com.sks.cruddemo.entity.Student;

import java.util.List;

public interface StudentDAO {
    void save(Student student);

    Student findById(Integer id);

    List<Student> findAll();

    List<Student> findByLastName(String lastName);

    void updateStudent(Student student);

    void delete(Integer id);
    void deleteAll();
}
