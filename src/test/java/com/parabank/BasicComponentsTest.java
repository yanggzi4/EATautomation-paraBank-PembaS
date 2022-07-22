package com.parabank;

import com.parabank.Base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class BasicComponentsTest extends CommonAPI {
     @Test
    public void test1(){
         String title = getPageTitle();
         System.out.println(title);
         Assert.assertEquals("ParaBank | Welcome |Online Banking", "ParaBank | Welcome |Online Banking");
     }



    @Test
    public void test2(){

        boolean usernameFieldIsDisplayed = isPresent("//input[@name = 'username']");
        System.out.println ("check if username field is displayed "+usernameFieldIsDisplayed);
        Assert.assertEquals(true,usernameFieldIsDisplayed);



    }
    @Test
    public void test3(){

        boolean passwordFieldDisplayed = isPresent("//input[@name = 'password']");
        System.out.println ("check is password field is displayed  "+passwordFieldDisplayed);
        Assert.assertEquals(true,passwordFieldDisplayed);


    }
    @Test
    public void test4(){

        boolean loginFieldDisplayed = isPresent("//input[@value= 'Log In']");
        System.out.println ("check if login button is displayed "+loginFieldDisplayed);
        Assert.assertEquals(true,loginFieldDisplayed);




    }
}
