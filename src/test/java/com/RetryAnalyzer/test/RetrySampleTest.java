package com.RetryAnalyzer.test;
import org.testng.annotations.Test;

public class RetrySampleTest {

    //Method level Retry
    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void testFlaky(){
        System.out.println("Running testFlaky");
        if (Math.random()>0.5){
            throw new RuntimeException("Random Failure");
        }


    }
}
