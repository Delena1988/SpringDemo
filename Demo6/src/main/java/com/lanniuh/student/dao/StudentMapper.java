package com.lanniuh.student.dao;


import com.github.pagehelper.Page;
import com.lanniuh.student.entity.Student;

public interface StudentMapper {
   Page<Student> getStudentPaged();
}