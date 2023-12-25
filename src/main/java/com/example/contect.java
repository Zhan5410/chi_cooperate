package com.example;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.util.sys_parameters;

public class contect {

    private void contect2web(){
        System.setProperty("webdriver.chrome.driver","D:\\Chrome\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver wd = new ChromeDriver(); //googlechrome


        wd.get(sys_parameters.pagemain);
        wd.switchTo().frame("Main");
        WebElement account = wd.findElement(By.id("uid"));
        account.clear();
        account.sendKeys("1108405052");
        //account.sendKeys(obj_list.getUser_account());
        WebElement password = wd.findElement(By.id("pwd"));
        password.clear();
        password.sendKeys("b123485549");
        //password.sendKeys(obj_list.getUesr_password());
        WebElement loginbutton = wd.findElement(By.id("chk"));
        loginbutton.click();

        wd.switchTo().defaultContent();
        wd.switchTo().frame("Lmenu");
        WebElement apply = wd.findElement(By.xpath("/html/body/span/table/tbody/tr[4]/td[2]/table[1]/tbody/tr/td[2]/span"));
        apply.click();
        WebElement ask = wd.findElement(By.xpath("/html/body/span/table/tbody/tr[4]/td[2]/table[2]/tbody/tr[2]/td[2]/table[2]/tbody/tr[4]/td[2]/table/tbody/tr/td[2]/div"));
        ask.click();

        wd.switchTo().defaultContent();
        wd.switchTo().frame("Main");
        WebElement button = wd.findElement(By.id("confirm"));
        button.click();

        WebElement smonth = wd.findElement(By.id("etxt_smonth"));
        Select selectSmonth = new Select(smonth);
        selectSmonth.selectByValue("10");
        //select.selectByValue(null);

        WebElement sday = wd.findElement(By.id("etxt_sday"));
        Select selectSday = new Select(sday);
        selectSday.selectByValue("16");
        //selectSday.selectByValue(null);

        WebElement emonth = wd.findElement(By.id("etxt_emonth"));
        Select selectEmonth = new Select(emonth);
        selectEmonth.selectByValue("10");
        //selectEmonth.selectByValue("null");

        WebElement eday = wd.findElement(By.id("etxt_eday"));
        Select selectEday = new Select(eday);
        selectEday.selectByValue("16");
        //selectEday.selectByValue("null");

        button = wd.findElement(By.id("send"));
        button.click();


        WebElement rtxt_today = wd.findElement(By.id("rtxt_today"));
        rtxt_today.submit();
        //JavascriptExecutor js = (JavascriptExecutor)wd;
        
        //TODO 此處接入腳本
        //js.executeScript();
        /*WebElement today = wd.findElement(By.id("rtxt_today"));
        today.sendKeys("2023/10/15");
        WebElement todayroc = wd.findElement(By.id("rtxt_todayroc"));
        todayroc.sendKeys("1221015");

        WebElement radiobutton = wd.findElement(By.id("rtxt_leave_kind22"));
        radiobutton.click();
        WebElement askforwhy = wd.findElement(By.id("rtxt_lea_reason"));
        askforwhy.clear();
        askforwhy.sendKeys("身體不適");*/
    }


    public static void main(String[] args) {
        contect start = new contect();
        start.contect2web();
    }
}
