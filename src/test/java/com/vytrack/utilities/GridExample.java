package com.vytrack.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class GridExample {

    public static void main(String[] args) throws MalformedURLException {
       // create url for the Hub
        URL url= new URL("http://localhost:4444/wd/hub");
        //create chromeOptions
        ChromeOptions chromeOptions=new ChromeOptions();
        //FirefoxOptions chromeOptions=new FirefoxOptions();
        // open browser from grid we use RomoteWebDriver
        WebDriver driver=new RemoteWebDriver(url,chromeOptions);

        driver.get("https://www.selenium.dev/");
        System.out.println(driver.getTitle());
        driver.quit();
    }
}
