package com.parabank;

import com.parabank.Base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends CommonAPI {
    @Test
    public void test5(){
        type("//input[@name = 'username']","yangshi");
        System.out.println("Username entered");

        type("//input[@name = 'password']","Parabank1");
        System.out.println("Password entered");

        click("//input[@value= 'Log In']");
        System.out.println("Login button clicked");

        String WelcomeText= getElementText("//*[@class='smallText']");
        Assert.assertEquals("Welcome Nahim03 LastName", WelcomeText);
    }
    @Test
    public void test6(){
        type("//input[@name = 'username']","");
        System.out.println("Username entered");

        type("//input[@name = 'password']","Parabank1");
        System.out.println("Password entered");

        click("//input[@value= 'Log In']");
        System.out.println("Login button clicked");


        String errorMessageText= getElementText("//*[@class='error']");
        Assert.assertEquals("Please enter a username and password.", errorMessageText);

    }
    @Test
    public void test7(){
        type("//input[@name = 'username']","yangshi");
        System.out.println("Username entered");

        type("//input[@name = 'password']","");
        System.out.println("Password entered");

        click("//input[@value= 'Log In']");
        System.out.println("Login button clicked");

        String errorMessageText= getElementText("//*[@class='error']");
        Assert.assertEquals("Please enter a username and password.", errorMessageText);
    }
}
