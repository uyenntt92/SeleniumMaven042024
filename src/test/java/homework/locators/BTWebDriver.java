package homework.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static com.anhtester.common.BaseTest.sleep;

public class BTWebDriver {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://crm.anhtester.com/admin/clients");
        //login
        driver.findElement(By.xpath(LocatorsCRM.inputEmail)).sendKeys("admin@example.com");
        driver.findElement(By.xpath(LocatorsCRM.inputPassword)).sendKeys("123456");
        driver.findElement(By.xpath(LocatorsCRM.buttonLogin)).click();
        //newproject
        driver.findElement(By.xpath(LocatorsCRM.menuProjects)).click();
        driver.findElement(By.xpath(LocatorsCRM.buttonAddNewProject)).click();
        //AddProjectPage
        driver.findElement(By.xpath(LocatorsCRM.inputProjectname)).sendKeys("AE24");
        //click vào dropdown search CUS
        driver.findElement(By.xpath(LocatorsCRM.dropdownCustomer)).click();
        sleep(1);
        //nhập gtri search
        driver.findElement(By.xpath(LocatorsCRM.inputSearchCustomer)).sendKeys("CAPT");
        //Click chọn Text đã search
        sleep(1);
        driver.findElement(By.xpath(LocatorsCRM.optionCustomer)).click();
        //click vào dropdown Billing
        driver.findElement(By.xpath(LocatorsCRM.dropdownBillingtype)).click();
        sleep(1);
        //Click chọn gtri trong dropBilling
        driver.findElement(By.xpath(LocatorsCRM.optionBillingtype)).click();
        sleep(1);
        //click vào dropdown Status
        driver.findElement(By.xpath(LocatorsCRM.dropdownStatus)).click();
        sleep(1);
        //Click chọn gtri trong dropStatus
        driver.findElement(By.xpath(LocatorsCRM.optionStatus)).click();
        //input time
        driver.findElement(By.xpath(LocatorsCRM.inputTotalRate)).sendKeys("10");
        driver.findElement(By.xpath(LocatorsCRM.inputEstimatedHours)).sendKeys("8");
        //Drop members
        driver.findElement(By.xpath(LocatorsCRM.dropdownMembers)).click();
        driver.findElement(By.xpath(LocatorsCRM.inputSearchMembers)).click();

        driver.findElement(By.xpath(LocatorsCRM.inputStartdate)).clear();
        driver.findElement(By.xpath(LocatorsCRM.inputStartdate)).sendKeys("15-07-2024");

        driver.findElement(By.xpath(LocatorsCRM.inputDeadline)).sendKeys("30-07-2024");

        driver.findElement(By.xpath(LocatorsCRM.checkboxSend)).click();

        Thread.sleep(3000);

        // Project Settings tab
        driver.findElement(By.xpath(LocatorsCRM.tabProjectSettings)).click();

        driver.findElement(By.xpath(LocatorsCRM.dropdownSendContactsNotifications)).click();
        driver.findElement(By.xpath(LocatorsCRM.optionSendContactsNotifications)).click();

        driver.findElement(By.xpath(LocatorsCRM.dropdownVisibleTabs)).click();
        driver.findElement(By.xpath(LocatorsCRM.buttonDeselectAll)).click();
        driver.findElement(By.xpath(LocatorsCRM.buttonSelectAll)).click();

        driver.findElement(By.xpath(LocatorsCRM.checkboxHideTasks)).click();

        driver.findElement(By.xpath(LocatorsCRM.buttonSaveProject)).click();
        Thread.sleep(2000);
        driver.quit();
    }
}
