package com.lanniuh.student.service.impl;

import com.github.pagehelper.Page;
import com.lanniuh.student.dao.StudentMapper;
import com.lanniuh.student.entity.Student;
import com.lanniuh.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by linjian
 * 16/8/12.
 */
@Service("studentService")
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Page<Student> getStudentPaged() {
        return studentMapper.getStudentPaged();
    }
}
