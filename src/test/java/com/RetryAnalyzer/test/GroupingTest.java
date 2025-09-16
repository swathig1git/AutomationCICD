package com.RetryAnalyzer.test;

import org.testng.annotations.Test;

public class GroupingTest {
    @Test(groups={"regression"})
    public void regressionTest1(){
        System.out.println("regressionTest1");
    }
    @Test(groups={"regression"})
    public void regressionTest2(){
        System.out.println("regressionTest2");
    }

    @Test(groups={"smoke"})
    public void smokeTest1(){
        System.out.println("smokeTest1");
    }
    @Test(groups={"smoke"})
    public void smokeTest2(){
        System.out.println("smokeTest2");
    }

}
