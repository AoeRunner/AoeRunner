package com.course.test_ng.groups;

import org.testng.annotations.Test;

@Test(groups = "teacher")
public class GroupsOnClass1 {

    public void teacher1(){
        System.out.println("GroupsOnClass1 teacher1");
    }
}
