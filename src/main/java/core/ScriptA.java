package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ScriptA {

    public static void run(WebDriver driver) {

        Auth.authDriver(driver);
        driver.findElement(By.id("header_employee_box")).click();

        Sleep.aSecond();

        driver.findElement(By.id("header_logout")).click();
    }
}
