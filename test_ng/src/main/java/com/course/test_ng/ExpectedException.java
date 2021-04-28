package com.course.test_ng;

import org.testng.annotations.Test;

public class ExpectedException {
    /**
     * 什么时候会用到异常测试？
     * 在我们期望结果为某一个异常的时候
     * 比如：我们传入了某些不合法的参数，程序抛出了异常
     * 我的预期结果就是这个异常
     */

    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptinnSucess(){
        System.out.println("这是异常测试");
        throw new RuntimeException();
    }
}
