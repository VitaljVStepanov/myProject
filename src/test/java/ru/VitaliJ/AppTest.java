package ru.VitaliJ;

import static org.junit.Assert.assertTrue;

import com.codeborne.selenide.junit.ScreenShooter;
import org.junit.Rule;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void myGUITest()
    {

        open("https://google.com/");
        $(By.name("q")).setValue("В контакте");
        $(By.className("gNO89b")).click();
        $$(By.tagName("h3")).findBy(text("VK: Welcome!")).click();
        $(By.id("index_email")).setValue("");
        $(By.id("index_pass")).setValue("");
        $(By.id("index_login_button")).click();

    }
}
