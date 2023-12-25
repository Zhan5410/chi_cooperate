package com.example;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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

        //input account
        WebElement account = wd.findElement(By.id("uid"));
        account.clear();
        account.sendKeys(obj_list.getUser_account());

        //input password
        WebElement password = wd.findElement(By.id("pwd"));
        password.clear();
        password.sendKeys(obj_list.getUesr_password());

        //login
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
        selectSmonth.selectByValue(obj_list.jco_month.getSelectedItem().toString());

        WebElement sday = wd.findElement(By.id("etxt_sday"));
        Select selectSday = new Select(sday);
        selectSday.selectByValue(obj_list.jco_day.getSelectedItem().toString());

        WebElement emonth = wd.findElement(By.id("etxt_emonth"));
        Select selectEmonth = new Select(emonth);
        selectEmonth.selectByValue(obj_list.jco_month.getSelectedItem().toString());

        WebElement eday = wd.findElement(By.id("etxt_eday"));
        Select selectEday = new Select(eday);
        selectEday.selectByValue(obj_list.jco_day.getSelectedItem().toString());

        button = wd.findElement(By.id("send"));
        button.click();

        JavascriptExecutor js = (JavascriptExecutor)wd;
        String newdate = setDate(js.executeScript("return document.getElementById('rtxt_today').value"));
        js.executeScript("document.getElementById('rtxt_today').value = '" + newdate + "';");
        String dataROC = dateToROC(js.executeScript("return document.getElementById('rtxt_todayroc').value"));
        js.executeScript("document.getElementById('rtxt_todayroc').value = '" + dataROC + "';");

        WebElement radiobutton = wd.findElement(By.id("rtxt_leave_kind22"));
        radiobutton.click();
        WebElement askforwhy = wd.findElement(By.id("rtxt_lea_reason"));
        askforwhy.clear();
        askforwhy.sendKeys("身體不適");

        List<WebElement> checkbox = wd.findElements(By.xpath("//td[@bgcolor='#6699cc']/*"));
        for(int i=0 ; i<checkbox.size() ; i+=2){
            WebElement element = checkbox.get(i);
            element.click();
        }
        
        WebElement submit = wd.findElement(By.id("rtxt_sent"));
        //submit.click();
        wd.close();
        wd.quit();

    }

    public String setDate(Object date){
        String newdate = date.toString();
        String[] util = newdate.split("/");
        //System.out.println("year" + util[0]);
        //System.out.println("month" + util[1]);
        //System.out.println("day" + util[2]);
        util[1] = obj_list.jco_month.getSelectedItem().toString();
        util[2] = obj_list.jco_day.getSelectedItem().toString();
        newdate = util[0] + "/" + util[1] + "/" + util[2];
        //System.out.println(newdate);
        return newdate;
    }

    public String dateToROC(Object date){
        String dateROC = date.toString();
        String year = dateROC.substring(0, 3);
        String MandD = dateROC.substring(3);

        //System.out.println(year + "year");
        MandD = (obj_list.jco_month.getSelectedItem().toString()) + (obj_list.jco_day.getSelectedItem().toString());
        dateROC = year + MandD;
        //System.out.println(dateROC + "dateROC");
        return dateROC;
    }


    public static void main(String[] args) {
        contect start = new contect();
        start.contect2web();
    }
}
