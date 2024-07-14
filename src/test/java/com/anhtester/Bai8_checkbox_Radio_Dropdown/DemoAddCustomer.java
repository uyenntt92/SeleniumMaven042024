package com.anhtester.Bai8_checkbox_Radio_Dropdown;

import com.anhtester.common.BaseTest;
import homework.locators.LocatorsCRM;
import org.openqa.selenium.By;

public class DemoAddCustomer extends BaseTest {
        public static void main(String[] args) {
            createBrowser();
            driver.get("https://crm.anhtester.com/admin/authentication");
            sleep(1);
            driver.findElement(By.xpath(LocatorsCRM.inputEmail)).sendKeys("admin@example.com");
            driver.findElement(By.xpath(LocatorsCRM.inputPassword)).sendKeys("123456");
            driver.findElement(By.xpath(LocatorsCRM.buttonLogin)).click();
            sleep(1);
            driver.findElement(By.xpath(LocatorsCRM.menuCustomers)).click();
            sleep(1);
            driver.findElement(By.xpath(LocatorsCRM.buttonAddNewCustomer)).click();
            //Chọn Group
            sleep(1);
            driver.findElement(By.xpath(LocatorsCRM.dropdownGroup)).click();
            sleep(1);
            String groupName = "VIP";
            driver.findElement(By.xpath(LocatorsCRM.inputSearchGroup)).sendKeys(groupName);
            //Click chọn item group hoặc nhấn ENTER
            //driver.findElement(By.xpath(LocatorsCRM.inputSearchGroups)).sendKeys(Keys.ENTER);
            driver.findElement(By.xpath("//span[normalize-space()='" + groupName + "']")).click();
            sleep(1);
            driver.findElement(By.xpath(LocatorsCRM.dropdownGroup)).click();

            closeBrowser();
        }
}
