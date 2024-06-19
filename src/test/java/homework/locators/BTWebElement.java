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
        driver.findElement(By.xpath(LocatorsCRM.inputEmail)).sendKeys("admin@example.com");
        driver.findElement(By.xpath(LocatorsCRM.inputPassword)).sendKeys("123456");
        driver.findElement(By.xpath(LocatorsCRM.buttonLogin)).click();
        driver.findElement(By.xpath(LocatorsCRM.menuCustomers)).click();
        driver.findElement(By.xpath(LocatorsCRM.buttonAddNewCustomer)).click();
        driver.findElement(By.xpath(LocatorsCRM.inputCompanyName)).sendKeys("Asia");
        driver.findElement(By.xpath(LocatorsCRM.inputVATNumber)).sendKeys("1234");
        driver.findElement(By.xpath(LocatorsCRM.inputPhoneNumber)).sendKeys("0986189780");
        driver.findElement(By.xpath(LocatorsCRM.inputWebsite)).sendKeys("http://ae.asiasoft.biz");
        driver.findElement(By.xpath(LocatorsCRM.dropdownDefaultLanguage)).click();
        driver.findElement(By.xpath(LocatorsCRM.optionVietnamese)).click();
        driver.findElement(By.xpath(LocatorsCRM.inputAddress)).sendKeys("Láng Hạ");
        driver.findElement(By.xpath(LocatorsCRM.inputCity)).sendKeys("HN");
        driver.findElement(By.xpath(LocatorsCRM.buttonSave)).click();
        Thread.sleep(2000);
        driver.quit();
}}
