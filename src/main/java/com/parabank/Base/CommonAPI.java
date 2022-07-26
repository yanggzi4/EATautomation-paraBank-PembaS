package com.parabank.Base;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class CommonAPI {
    public WebDriver driver;

    @BeforeTest
    public void setUP() {
        System.setProperty("webdriver.chrome.driver", "/Users/mingmasherpa/IdeaProjects/automationFramework-parabank/driver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://parabank.parasoft.com/parabank/index.htm");

    }

    @AfterTest
    public void tearDown() {
        driver.close();
    }
    public String getPageTitle(){
        return driver.getTitle();
    }

    public String getElementText(String locator){
        try{
            return driver.findElement(By.cssSelector(locator)).getText();
        }catch (Exception e){
            return driver.findElement(By.xpath(locator)).getText();
        }
    }
    public void click(String locator) {
        try {
            driver.findElement(By.cssSelector(locator)).click();
        } catch (Exception e) {
            driver.findElement(By.xpath(locator)).click();
        }
    }
    public void type(String locator, String text) {
        try {
            driver.findElement(By.cssSelector(locator)).sendKeys(text);
        } catch (Exception e) {
            driver.findElement(By.xpath(locator)).sendKeys(text);
        }
    }
    public boolean isPresent(String locator){
        try{
            return driver.findElement(By.cssSelector(locator)).isDisplayed();
        }catch(Exception e){
            return driver.findElement(By.xpath(locator)).isDisplayed();
        }
    }

}

