package com.selenium;

import net.bytebuddy.implementation.bind.MethodDelegationBinder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Main {

    public static void main(String[] args) throws InterruptedException {
	
        WebDriver driver = new ChromeDriver();

        driver.get("https://testing.todorvachev.com");
        Thread.sleep(15000);
        System.out.printf("test");
        driver.quit();
    }
}