package com.course.test_ng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOnMethod {

    @Test(groups = "server")
    public void server1(){
        System.out.println("server1");
    }

    @Test(groups = "server")
    public void server2(){
        System.out.println("server2");
    }

    @Test(groups = "clint")
    public void clint1(){
        System.out.println("clint1");
    }

    @Test(groups = "clint")
    public void clint2(){
        System.out.println("clint2");
    }

    @BeforeGroups("server")
    public void beforeGroutServer(){
        System.out.println("beforeGroutServer");
    }

    @AfterGroups("server")
    public void afterGroupsServer(){
        System.out.println("afterGroupsServer");
    }

    @BeforeGroups("clint")
    public void beforeGroutClint(){
        System.out.println("beforeGroutClint");
    }

    @AfterGroups("clint")
    public void afterGroupsClint(){
        System.out.println("afterGroupsClint");
    }
}
