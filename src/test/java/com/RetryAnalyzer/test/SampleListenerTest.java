package com.RetryAnalyzer.test;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners (TestListener.class)
public class SampleListenerTest {
    @Test
    public void listenerTest(){
        System.out.println("Executing Listener Test");
    }
}
