package com.bridgelabz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.swing.text.AbstractDocument;

public class test {
    public static void main(String[] args) {
       ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");


       Data a = (Data)context.getBean("data");
        System.out.println(a);


    }
}
