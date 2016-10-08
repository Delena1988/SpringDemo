package com.lanniuh.springtask;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by linjian
 * 16/8/15.
 */
@Component("taskJob2")
public class TaskJob2 {
    @Scheduled(cron = "0 * * * * ?")
    public void job2(){
        System.out.println("注解形式,任务进行中");
    }
}
