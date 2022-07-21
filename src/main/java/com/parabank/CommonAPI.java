package com.parabank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CommonAPI {
    WebDriver driver;
    @BeforeTest
    public void setUP(){
        System.setProperty("webdriver.chrome.driver", "/Users/mingmasherpa/IdeaProjects/automationFramework-parabank/driver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals("ParaBank | Welcome |Online Banking", "ParaBank | Welcome |Online Banking");
    }
    @AfterTest
    public void tearDown(){
        driver.close();
    }
   // @Test
 //public void test1(){


 //}
 @Test
    public void test2(){

     WebElement usernameField= driver.findElement(By.xpath("//input[@name = 'username']"));
     boolean usernameFieldIsDisplayed = usernameField.isDisplayed();
     System.out.println ("check if username field is displayed "+usernameFieldIsDisplayed);
     Assert.assertEquals(true,usernameFieldIsDisplayed);



 }
 @Test
    public void test3(){

     WebElement passwordField= driver.findElement(By.xpath("//input[@name = 'password']"));
     boolean passwordFieldDisplayed = passwordField.isDisplayed();
     System.out.println ("check is password field is displayed  "+passwordFieldDisplayed);
     Assert.assertEquals(true,passwordFieldDisplayed);


 }
 @Test
    public void test4(){

     WebElement loginField= driver.findElement(By.xpath("//input[@value= 'Log In']"));
     boolean loginFieldDisplayed = loginField.isDisplayed();
     System.out.println ("check if login button is displayed "+loginFieldDisplayed);
     Assert.assertEquals(true,loginFieldDisplayed);




 }
 @Test
    public void test5(){
     WebElement username=driver.findElement(By.xpath("//input[@name = 'username']"));
     username.sendKeys("yangshi");
     System.out.println("Username entered");

     WebElement password=driver.findElement(By.xpath("//input[@name = 'password']"));
     password.sendKeys("Parabank1");
     System.out.println("Password entered");

     WebElement loginBtn=driver.findElement(By.xpath("//input[@value= 'Log In']"));
     loginBtn.click();
     System.out.println("Login button clicked");

     WebElement header=driver.findElement(By.xpath("//*[@class='smallText']"));
     String WelcomeText= header.getText();
     Assert.assertEquals("Welcome Nahim03 LastName", WelcomeText);
 }
 }

