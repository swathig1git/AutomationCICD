package com.RetryAnalyzer.test;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedTest {
    @Test
    @Parameters("browser")
//    public void testInBrowser(@Optional("chrome") String browser){
    public void testInBrowser(String browser){

        System.out.println("Running in " + browser);
    }
}
