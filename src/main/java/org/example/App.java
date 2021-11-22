package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class App {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        // 1 - Log in - Log out at https://gamer-mods.ru
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("https://gamer-mods.ru");
        driver.findElement(By.xpath("//div[@class=\"header-right\"]/a[@href=\"javascript:;\"]")).click();
        driver.findElement(By.name("user")).sendKeys("Testtest15");
        driver.findElement(By.name("password")).sendKeys("ghbdtn13");
        driver.findElement(By.id("subbutfrmLg555")).click();
        driver.findElement(By.xpath("//a[@class=\"profile-view pv-button\"]")).click();
        driver.findElement(By.xpath("//a[text()='Выход']")).click();
        Thread.sleep(5000);
        driver.quit();


        // 2 - Find mods
        WebDriver driverSecondTest = new ChromeDriver();
        driverSecondTest.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driverSecondTest.get("https://gamer-mods.ru");
        driverSecondTest.findElement(By.xpath("//div[@class=\"header-right\"]/a[@href=\"javascript:;\"]")).click();
        driverSecondTest.findElement(By.name("user")).sendKeys("Testtest15");
        driverSecondTest.findElement(By.name("password")).sendKeys("ghbdtn13");
        driverSecondTest.findElement(By.id("subbutfrmLg555")).click();
        WebElement searchLine = driverSecondTest.findElement(By.name("query"));
        searchLine.sendKeys("Eldritch knight / Рыцарь Элдрича");
        WebElement searchButton = driverSecondTest.findElement(By.xpath("//form[@id=\"search\"]/input[@name=\"a\"]"));
        searchButton.click();
        Thread.sleep(5000);
        WebElement searchLineAgain = driverSecondTest.findElement(By.name("query"));
        searchLineAgain.sendKeys("Skyrim Exterior Fixes / Внешние исправления Skyrim LE");
        WebElement searchButtonAgain = driverSecondTest.findElement(By.xpath("//form[@id=\"search\"]/input[@name=\"a\"]"));
        searchButtonAgain.click();
        Thread.sleep(5000);
        driverSecondTest.quit();
    }
}