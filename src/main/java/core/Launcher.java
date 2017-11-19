package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launcher {

    public static void main(String[] args) {
        WebDriver webDriver = initDriver();
        ScriptA.run(webDriver);
        ScriptB.run(webDriver);
        webDriver.quit();
    }

    private static WebDriver initDriver() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");
        return new ChromeDriver();
    }
}
