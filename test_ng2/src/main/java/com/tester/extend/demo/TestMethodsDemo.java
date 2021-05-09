package com.tester.extend.demo;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestMethodsDemo {

    @Test
    public void test1(){
        System.out.println("test111111111");
        Assert.assertEquals(1, 1);
    }

    @Test
    public void test2(){
        System.out.println("test22222222222");
        Assert.assertEquals("aaa", "aaa");
    }

    @Test
    public void test3(){
        System.out.println("test3333333333");
        Reporter.log("哦，我的王母娘娘阿");
        Reporter.log("打开企业微信");
        Reporter.log("进入主页");
        Reporter.log("进入添加联系人界面");
        Reporter.log("添加联系人");
        throw new RuntimeException("这是异常");
    }

}
