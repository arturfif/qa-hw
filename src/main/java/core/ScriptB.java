package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ScriptB {

    public static void run(WebDriver driver) {

        Auth.authDriver(driver);

        int tabCount =  driver.findElements(By.className("maintab")).size();

        for (int i = 0; i < tabCount; i++) {

            List<WebElement> tabs = driver.findElements(By.className("maintab"));
            if (tabs.isEmpty()) {
                tabs = driver.findElements(By.className("link-levelone"));
            }

            tabs.get(i).click();

            Sleep.aSecond();
            System.out.println(driver.findElement(By.tagName("h2")).getText());
            driver.navigate().refresh();
            Sleep.aSecond();
            System.out.println("After refresh: " + driver.findElement(By.tagName("h2")).getText());

        }
    }
}
