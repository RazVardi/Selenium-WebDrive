using System;
using OpenQA.Selenium;
using OpenQA.Selenium.Chrome;
using System.Threading;
class EntryPoint
{
    static void Main()
    {
        string url = "https://testing.todorvachev.com/class-name/";
        string clss = "testClass";

        IWebDriver driver = new ChromeDriver();

        driver.Navigate().GoToUrl(url);

        IWebElement element = driver.FindElement(By.ClassName(clss));

        Console.WriteLine(element);

        Thread.Sleep(10000);

        driver.Quit();
    }
}