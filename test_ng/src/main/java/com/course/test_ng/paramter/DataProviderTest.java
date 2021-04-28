package com.course.test_ng.paramter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProviderTest {

    @Test(dataProvider="data")
    public void test1(String name, Integer age){
        System.out.println("name:" + name);
        System.out.println("age:" + age);
    }

    @DataProvider(name="data")
    public Object[][] data1(){
        Object[][] o = new Object[][]{
                {"zhangsan", 20},
                {"lisi", 30},
                {"wangwu", 40}
        };
        return o;
    }

    @Test(dataProvider="data2")
    public void test2(String name, Integer age){
        System.out.println("test2222");
        System.out.println("name:" + name);
        System.out.println("age:" + age);
    }

    @Test(dataProvider="data2")
    public void test3(String name, Integer age){
        System.out.println("tes333333");
        System.out.println("name:" + name);
        System.out.println("age:" + age);
    }

    @DataProvider(name="data2")
    public Object[][] datas(Method method){
        Object[][] s = null;
        if(method.getName().equals("test2")){
            s = new Object[][]{
                    {"zhangsan", 41},
                    {"lisi", 42}
            };
        }else if(method.getName().equals("test3")){
            s = new Object[][]{
                    {"wangwu", 50},
                    {"zhanliu", 52}
            };
        };
        return s;
    }


}
