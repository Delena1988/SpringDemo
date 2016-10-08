package com.lanniuh.quartz;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by linjian
 * 16/8/13.
 */
public class Job2 {
    public void doJob2() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String time = sdf.format(new Date(System.currentTimeMillis()));
        System.out.println("不继承QuartzJobBean方式-调度进行中...current time is: "+time);
    }
}
