package com.clcc.rpc;

import com.clcc.rpc.provider.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by fanchao on 2016/10/27.
 */
public class AppConsumer {

    private final static Logger logger = LoggerFactory.getLogger(AppConsumer.class);

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "classpath*:applicationContext.xml");
        context.start();

        logger.info("dubbo consumer begin to start");
        UserService userService = (UserService) context.getBean("userService");
        logger.info(userService.sayHello("jack"));

        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
