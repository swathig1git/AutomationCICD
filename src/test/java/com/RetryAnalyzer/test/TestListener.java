package com.RetryAnalyzer.test;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {
    @Override
    public void onTestStart(ITestResult result){
        System.out.println("Starting Test " + result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result){
        System.out.println("Test passed "+result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result){
        System.out.println("Test failed : "+result.getName());
    }

    @Override
    public void onTestSkipped(ITestResult result){
        System.out.println("Test skipped: " + result.getName());
    }

    @Override
    public void onStart(org.testng.ITestContext context){
        System.out.println("Test Suite started : " + context.getName());
    }

    @Override
    public void onFinish(org.testng.ITestContext context){
        System.out.println("Test Suite finished: " + context.getName());
    }
}
