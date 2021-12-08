package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class DesktopResult extends Utils
{
    public void veryfyUserNavigatestoDesktopPage()
    {
        Assert.assertTrue(driver.getCurrentUrl().contains("desktop"));

        }}
