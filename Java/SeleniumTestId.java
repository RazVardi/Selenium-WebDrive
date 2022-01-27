package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) throws InterruptedException {
	
        String url = "https://testing.todorvachev.com/id/";
        String ID = "testImage";

        WebDriver driver = new ChromeDriver();

        driver.get(url);

        WebElement element = driver.findElement(By.id(ID));

        if (element.isDisplayed())
        {
            System.out.println("Yes, it's there!");
        } else
        {
            System.out.println("No, it's not there...");
        }

        Thread.sleep(6000);

        driver.quit();
    }
}
