package com.course.test_ng;

import org.testng.annotations.Test;

public class TimeOutTest {

    @Test(timeOut = 2000)
    public void test1() throws InterruptedException {
        Thread.sleep(3000);
    }
}
