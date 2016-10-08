package com.lanniuh.student;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lanniuh.MultipleDataSource;
import com.lanniuh.student.entity.Student;
import com.lanniuh.student.service.StudentService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Created by linjian
 * 16/8/12.
 */
public class StudentTest {
    private ApplicationContext context;

    @Before
    public void init() {
        context = new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    @Test
    public void test() {
//        MultipleDataSource.setDataSourceKey("dataSource-mysql");
        MultipleDataSource.setDataSourceKey("dataSource-sqlserver");
        PageHelper.startPage(1, 2);
        StudentService service = context.getBean("studentService", StudentService.class);
        Page<Student> studentPage = service.getStudentPaged();
        PageInfo<Student> studentPageInfo = studentPage.toPageInfo();
        System.out.println(JSON.toJSONString(studentPageInfo));
    }
}
