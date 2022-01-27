package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) throws InterruptedException {
	// write your code here
        String url = "https://testing.todorvachev.com/css-path/";
        String xPath = "//*[@id='cat']";

        WebDriver driver = new ChromeDriver();

        driver.get(url);

        WebElement element = driver.findElement((By.xpath(xPath)));

        if (element.isDisplayed())
        {
            System.out.println(("Yes, it's displayed!"));
        } else
        {
            System.out.println("No, it's not displayed...");
        }

        Thread.sleep(7000);

        driver.quit();
    }
}