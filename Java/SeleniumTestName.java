package com.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) throws InterruptedException {
	// write your code here
        WebDriver driver = new ChromeDriver();

        driver.get("https://testing.todorvachev.com/selectors/name");

        WebElement element = driver.findElement(By.name("myName"));

        if (element.isDisplayed())
        {
            System.out.printf("Very good! The element appears on the webpage.");
        } else
        {
            System.out.printf("Not good... The element doesn't appear on the webpage");
        }

        Thread.sleep(6000);

        driver.quit();
    }
}
