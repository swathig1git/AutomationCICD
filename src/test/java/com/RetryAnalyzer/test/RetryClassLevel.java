package com.RetryAnalyzer.test;

import org.testng.annotations.Test;

public class RetryClassLevel {
    @Test
    public void classTestFlaky1(){
        System.out.println("Running classTestFlaky1");
        assert true;
    }

    @Test
    public void classTestFlaky2(){
        System.out.println("Running classTestFlaky2");
        assert true;
    }
}
