using System;
using OpenQA.Selenium;
using OpenQA.Selenium.Chrome;
using System.Threading;
class EntryPoint
{
    static void Main()
    {
        IWebDriver driver = new ChromeDriver();

        driver.Navigate().GoToUrl("https://testing.todorvachev.com/selectors/name");

        IWebElement element = driver.FindElement(By.Name("myName"));

        if (element.Displayed)
        {
            Console.WriteLine("Very good! The element appears on the webpage.");
        } else
        {
            Console.WriteLine("Not good... The element doesn't appear on the webpage");
        }

        Thread.Sleep(6000);

        driver.Quit();
    }
}