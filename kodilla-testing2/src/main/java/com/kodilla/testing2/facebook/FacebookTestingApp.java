package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FacebookTestingApp {

    private static final String XPATH_BUTTON = "//div[contains(@class, \"_6ltg\")]/a";
    private static final String COOKIE_ID = "u_0_h";
    private static final String MONTH = "//div[contains(@class, \"_5k_5\")]/span/span/select[1]";
    private static final String YEAR = "//div[contains(@class, \"_5k_5\")]/span/span/select[3]";
    private static final String DAY = "//div[contains(@class, \"_5k_5\")]/span/span/select[2]";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");


        WebElement cookie = driver.findElement(By.id(COOKIE_ID));
        while (!driver.findElement(By.id(COOKIE_ID)).isDisplayed());
        cookie.click();


        WebElement button = driver.findElement(By.xpath(XPATH_BUTTON));
        button.click();

        WebDriverWait wait = new WebDriverWait(driver, 10L);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(MONTH)));

        WebElement spinnerMonth = driver.findElement(By.xpath(MONTH));
        WebElement spinnerDay = driver.findElement(By.xpath(DAY));
        WebElement spinnerYear = driver.findElement(By.xpath(YEAR));
        Select selectMonth = new Select(spinnerMonth);
        Select selectDay = new Select(spinnerDay);
        Select selectYear = new Select(spinnerYear);

        selectMonth.selectByIndex(12);
        selectDay.selectByIndex(14);
        selectYear.selectByIndex(18);
    }
}
