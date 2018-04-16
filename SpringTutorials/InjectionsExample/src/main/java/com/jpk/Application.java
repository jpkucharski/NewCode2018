package com.jpk;

import com.jpk.service.ServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String arg[]) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        ServiceImpl serviceImpl = applicationContext.getBean("service", ServiceImpl.class);

        System.out.println(serviceImpl.getListOfAllObjectsInDatabase().get(0).getName());
    }
}
