using System;
using OpenQA.Selenium;
using OpenQA.Selenium.Chrome;
using System.Threading;
class EntryPoint
{
    static void Main()
    {
        //*[@id="post-108"]/div/figure/img
        string url = "https://testing.todorvachev.com/css-path/";
        string xPath = "//*[@id='cat']";

        IWebDriver driver = new ChromeDriver();
        
        driver.Navigate().GoToUrl(url);

        IWebElement element = driver.FindElement(By.XPath(xPath));

        if (element.Displayed)
        {
            Console.WriteLine("Yes, it's displayed!");
        } else
        {
            Console.WriteLine("No, it's not displayed...");
        }

        Thread.Sleep(7000);

        driver.Quit();

    }
}