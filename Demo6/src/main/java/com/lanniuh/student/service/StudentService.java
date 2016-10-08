package com.lanniuh.student.service;

import com.github.pagehelper.Page;
import com.lanniuh.student.entity.Student;

/**
 * Created by linjian
 * 16/8/12.
 */
public interface StudentService {
    Page<Student> getStudentPaged();
}
