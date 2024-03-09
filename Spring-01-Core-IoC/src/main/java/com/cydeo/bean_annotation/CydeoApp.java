package com.cydeo.bean_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigApp.class);


        FullTimeMentor ft = context.getBean(FullTimeMentor.class);

        PartTimeMentor pt =  context.getBean(PartTimeMentor.class);


        pt.createAccount();
        ft.createAccount();





    }
}
