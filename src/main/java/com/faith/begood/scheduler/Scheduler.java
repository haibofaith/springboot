package com.faith.begood.scheduler;

import com.faith.begood.BegoodApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author:haibo.xiong
 * @date:2018/12/28
 * @description:
 */
@Component
public class Scheduler {
    private static final Logger logger = LoggerFactory.getLogger(Scheduler.class);
    @Scheduled(cron = "0 * * * * ?")
    public void cronJobSch() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        Date now = new Date();
        String strDate = sdf.format(now);
        logger.info("Java cron job expression:: " + strDate);
    }
}
