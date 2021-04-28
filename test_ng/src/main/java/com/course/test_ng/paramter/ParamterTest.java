package com.course.test_ng.paramter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamterTest {

    @Test
    @Parameters({"name", "age"})
    public void paramterTest(String name, Integer age){
        System.out.println("name = " + name);
        System.out.println("age = " + age);
    }
}
