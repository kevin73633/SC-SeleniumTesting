package com.example.selenium.testcases;

import com.example.selenium.setup.TCASetup;
import com.example.selenium.utils.FileUtils;

import java.io.IOException;
import java.nio.file.*;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class TCA14 {
    
    public static void run(WebDriver driver, WebDriverWait wait) throws InterruptedException {
        // Navigate to results by class page
        System.out.println("TCA14 START");
        TCASetup.navigateToResultsByClass(driver, wait, "//a[.//span[text()='Results'] and contains(., 'Upload')]");

        // TCA14.1: filter by class, subject, and assessment; expand/collapse each term; input marks for each student; save marks for each term
        TCA14_1(driver, wait);

        // TCA14.2: download CSV file for each term; update CSV file with remarks
        TCA14_2(driver, wait);

        System.out.println("✅ TCA14 END");
    }

    public static void TCA14_1(WebDriver driver, WebDriverWait wait) throws InterruptedException {

    }

    public static void filterByLevelAndData(WebDriver driver, WebDriverWait wait) throws InterruptedException{
        //filter by level
        List<WebElement> selectDropdowns = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.tagName("select")));
        selectDropdowns.get(0).findElements(By.tagName("option")).get(1).click(); // Click on the first option in the first dropdown
        Thread.sleep(2000); // Wait for the page to load

        //filter by data set
        selectDropdowns.get(1).findElements(By.tagName("option")).get(1).click(); // Click on the first option in the second dropdown
        Thread.sleep(2000); // Wait for the page to load
    }

    public static void downloadReport(WebDriver driver, WebDriverWait wait) throws InterruptedException, IOException {
        // Click on the download button
        WebElement downloadIcon = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("svg-icon[icon_name='download']")));
        downloadIcon.click();
        Thread.sleep(2000); // Wait for the download to complete
    }
}
    