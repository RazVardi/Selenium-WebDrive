package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) throws InterruptedException {
	// write your code here
        String url = "https://testing.todorvachev.com/css-path/";
        String cssPath = "#search-2 > form > label > input";

        WebDriver driver = new ChromeDriver();

        driver.get(url);

        WebElement element = driver.findElement((By.cssSelector(cssPath)));

        if (element.isDisplayed())
        {
            System.out.println("Yes - I can see the element!");
        } else
        {
            System.out.println("No, the element is not there.");
        }

        Thread.sleep(7000);

        driver.quit();
    }
}
