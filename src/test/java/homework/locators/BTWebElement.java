package homework.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BTWebElement {
    public static void main(String[] args) throws InterruptedException{
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://crm.anhtester.com/admin/clients");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@example.com");


        Thread.sleep(2000);
        driver.quit();
}}
