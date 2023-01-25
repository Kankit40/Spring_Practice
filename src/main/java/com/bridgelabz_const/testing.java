package com.bridgelabz_const;

import com.bridgelabz.test2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testing {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("config1.xml");


        Data1 a = (Data1) context.getBean("test212");
        System.out.println(a);
    }
}
