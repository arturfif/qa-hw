package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Auth {

    private static final String SITE = "http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/";
    private static final String LOGIN = "webinar.test@gmail.com";
    private static final String PASSWORD = "Xcg7299bnSmMuRLp9ITw";

    public static void authDriver(WebDriver driver) {
        driver.get(SITE);

        Sleep.aSecond();

        driver.findElement(By.id("email")).sendKeys(LOGIN);
        driver.findElement(By.id("passwd")).sendKeys(PASSWORD);
        driver.findElement(By.name("submitLogin")).submit();

        Sleep.aSecond();
    }
}
