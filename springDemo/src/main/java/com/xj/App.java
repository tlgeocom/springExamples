package com.xj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args){
        //1.创建Spring IOC 容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        //2.从IOC容器中获取bean实例



        MavenAndSpring mavenAndSpring = (MavenAndSpring) ac.getBean("mavenAndSpring");
        mavenAndSpring.hello();
    }
}
