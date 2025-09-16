package com.RetryAnalyzer.test;

import org.testng.annotations.Test;

public class RetryClassLevel {
    @Test
    public void classTestFlaky1(){
        System.out.println("Running classTestFlaky1");
        assert false;
    }

    @Test
    public void classTestFlaky2(){
        System.out.println("Running classTestFlaky2");
        assert false;
    }
}
