package com.anhtester.Bai8_checkbox_Radio_Dropdown;

import com.anhtester.common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdownStatic extends BaseTest {
    public static void main(String[] args) {
        createBrowser();
        driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
        //khoi tao doi tuong class select
        sleep(2);
Select select = new Select(driver.findElement(By.xpath("//select[@id='select-demo']")));
        //Chọn option theo 3 hàm hỗ trợ
select.selectByVisibleText("Monday");
sleep(1);
select.selectByValue("Tuesday");
sleep(1);
select.selectByIndex(5);//vị trí thứ 6 bdau từ 0
        //Kiem tra gtri chọn đúng chưa
        System.out.println(select.getFirstSelectedOption().getText());
        closeBrowser();

    }
}
