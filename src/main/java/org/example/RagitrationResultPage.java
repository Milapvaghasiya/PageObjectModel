package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RagitrationResultPage extends  Utils {
    public void registrationResult(){
        String actualRegisterSuccessMessage=getTextFromElement(By.xpath("//div[@class=\"result\"]"));
        String expectedRegisterSuccessMessage="Your registration completed";
        Assert.assertTrue(actualRegisterSuccessMessage.equals(expectedRegisterSuccessMessage));

    }

}
