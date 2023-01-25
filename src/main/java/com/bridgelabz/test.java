package com.bridgelabz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.swing.text.AbstractDocument;

public class test {
    public static void main(String[] args) {
       ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");


       test2 a = (test2) context.getBean("test21");
        System.out.println(a);


    }
}
