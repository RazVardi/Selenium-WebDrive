using System;
using OpenQA.Selenium;
using OpenQA.Selenium.Chrome;
using System.Threading;
class EntryPoint
{
    static void Main()
    {
        string url = "https://testing.todorvachev.com/id/";
        string ID = "testImage";

        IWebDriver driver = new ChromeDriver();

        driver.Navigate().GoToUrl(url);

        IWebElement element = driver.FindElement(By.Id(ID));

        if (element.Displayed)
        {
            Console.WriteLine("Yes, it's there!");
        } else
        {
            Console.WriteLine("No, it's not there...");
        }

        Thread.Sleep(6000);

        driver.Quit();
    }
}