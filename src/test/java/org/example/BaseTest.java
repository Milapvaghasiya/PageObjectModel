package org.example;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utils{
    BrowserManager browserManager=new BrowserManager();
    @BeforeMethod
    public void setUpBrowser(){
        browserManager.OpenBrowser();
    }

    @AfterMethod
    public void tearDownBrowser(){
        browserManager.closeBrowser();
    }

}
