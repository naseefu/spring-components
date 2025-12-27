package com.componentscan.without_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("componentScan.xml");
        Employee employee = context.getBean("employeeDetails", Employee.class);
        System.out.println(employee.toString());;
    }
}
