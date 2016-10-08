package com.lanniuh.quartz;

import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by linjian
 * 16/8/12.
 */
public class Job1 extends QuartzJobBean {
    private int timeout;
    private static int i = 0;

    //调度工厂实例化后，经过timeout时间开始执行调度
    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    /**
     * 要调度的具体任务
     *
     * @param context
     * @throws JobExecutionException
     */
    @Override
    protected void executeInternal(org.quartz.JobExecutionContext context) throws JobExecutionException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String time = sdf.format(new Date(System.currentTimeMillis()));
        System.out.println("定时任务执行中…current time is: " + time);
    }
}
