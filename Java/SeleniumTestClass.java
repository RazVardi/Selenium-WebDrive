package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) throws InterruptedException {
	
        String url = "https://testing.todorvachev.com/class-name/";
        String clss = "testClass";

        WebDriver driver = new ChromeDriver();

        driver.get(url);

        WebElement element = driver.findElement((By.className(clss)));

        System.out.println((element));

        Thread.sleep(100000);

        driver.quit();
    }
}
