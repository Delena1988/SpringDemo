package com.lanniuh.springtask;

import org.springframework.stereotype.Service;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Created by linjian
 * 16/8/15.
 */
@Service
public class TaskJob {
    public void job1(){
        System.out.println("任务进行中...");
    }
}



