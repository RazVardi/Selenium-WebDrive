using System;
using OpenQA.Selenium;
using OpenQA.Selenium.Chrome;
using System.Threading;
class EntryPoint
{
    static void Main()
    {
        string url = "https://testing.todorvachev.com/css-path/";
        string cssPath = "#search-2 > form > label > input";

        IWebDriver driver = new ChromeDriver();

        driver.Navigate().GoToUrl(url);

        IWebElement element = driver.FindElement(By.CssSelector(cssPath));

        if (element.Displayed)
        {
            Console.WriteLine("Yes - I can see the element!");
        } else
        {
            Console.WriteLine("No, the element is not there.");
        }

        Thread.Sleep(7000);

        driver.Quit();
    }
}