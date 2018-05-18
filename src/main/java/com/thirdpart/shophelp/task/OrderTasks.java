package com.thirdpart.shophelp.task;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * created by yixinjiang on 2018/5/18
 */
@Component
public class OrderTasks {
    private static final Logger logger = LoggerFactory.getLogger(OrderTasks.class);
    @Scheduled(cron="0/1 * * * * ?")
    public void orderSync(){
        logger.info("orderSync!!");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Scheduled(cron="0/1 * * * * ?")
    public void orderPush(){
        logger.info("orderPush!!");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
