package uk.bamboolounge.utility;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.internal.Dynamic;
import uk.bamboolounge.basepage.BasePage;

import java.util.List;
import java.util.Random;

/*
Base Class Has Got All Actions And Suitable Methods
 */
public class Util extends BasePage {
    /**
     * This method will generate random number
     *
     * @return
     */
    public int generateRandomNumber() {
        return (int) (Math.random() * 5000 + 1);
    }

    /**
     * This method will click on element
     */
    public void clickOnElement(By by) {
        driver.findElement(by).click();
        //Thread.sleep(4000);   //Whenever use thread we needs to add exception in method
    }

    /**
     * This method will click on element
     */
    public void clickOnElement(WebElement element) {
        element.click();
    }

    /**
     * This method will return text from element
     */
    public String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }

    public String getTextFromElement(WebElement element) {
        return element.getText();
    }

    /**
     * This method will send text to element or field
     */
    public void sendTextToElement(By by, String str) {
        driver.findElement(by).sendKeys(str);
    }

    public void sendTextToElement(WebElement element, String str) {
        element.sendKeys(str);

    }

    /**
     * This method will used to hover mouse on element
     */
    public void mouseHoverToElement(By by) {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(by)).perform();
    }

    public void mouseHoverToElement(WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
    }

    /**
     * This method will used to hover mouse on element and click
     */
    public void mouseHoverToElementAndClick(By by) {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(by)).click().perform();
    }

    public void mouseHoverToElementAndClick(WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().perform();
    }

    /**
     * This method will used to select drop down menu by visible text
     */
    public void selectByVisibleTextFromDropDown(By by, String str) {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(str);
    }

    public void selectByVisibleTextFromDropDown(WebElement element, String str) {
        Select select = new Select(element);
        select.selectByVisibleText(str);
    }

    /**
     * This method will used to select drop down menu by index
     */
    public void selectByIndexFromDropDown(By by, int index) {
        Select select = new Select(driver.findElement(by));
        select.selectByIndex(index);
    }

    public void selectByIndexFromDropDown(WebElement element, int index) {
        Select select = new Select(element);
        select.selectByIndex(index);
    }

    /**
     * This method will used to select drop down menu by value
     */
    public void selectByValueFromDropDown(By by, String value) {
        Select select = new Select(driver.findElement(by));
        select.selectByValue(value);
    }

    public void selectByValueFromDropDown(WebElement element, String value) {
        Select select = new Select(element);
        select.selectByValue(value);
    }

    /*   *//**
     * This method will used to wait web driver until element become clickable
     *//*
    public void waitUntilElementToBeClickable(By by, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(by)));
    }

    *//**
     * This method will used to wait web driver until presence of element located by locator
     *//*
    public void waitUntilPresenceOfElementLocated(By by, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    *//**
     * This method will used to wait web driver until visibility of element located by locator
     *//*
    public void waitUntilVisibilityOfElementLocated(By by, int timeout){
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }
*/

    /**
     * This method will verify that element is displayed
     */
    public boolean verifyThatElementIsDisplayed(By by) {
        WebElement element = driver.findElement(by);
        if (element.isDisplayed()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean verifyThatElementIsDisplayed(WebElement element) {
        if (element.isDisplayed()) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * This method will verify that element is displayed
     */
    public boolean verifyThatTextIsDisplayed(By by, String text) {
        WebElement element = driver.findElement(by);
        if (text.equals(element.getText())) {
            return true;
        } else {
            return false;
        }
    }

    public boolean verifyThatTextIsDisplayed(WebElement element, String text) {
        if (text.equals(element.getText())) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * This method will returns list of web elements
     */
    public List<WebElement> webElementList(By by) {
        return driver.findElements(by);
    }

    //Random String Generator
    public String randomStringGenerator() {
        String characters = "abcdefghijklmnopqrstuvwxyz";
        String randomString = "";
        int length = 5;
        Random rand = new Random();
        char[] text = new char[length];

        for (int i = 0; i < length; i++) {
            text[i] = characters.charAt(rand.nextInt(characters.length()));
        }

        for (int i = 0; i < text.length; i++) {
            randomString += text[i];
        }
        return randomString;
    }


    /*
    Dynamic Assert
     */
    public void verifyActualAndExpected(Object expected, Object actual) {
        Assert.assertEquals(expected, actual);
    }


    /*
    To Get Alert Message From Alert Window
     */
    public String getAlertText() {
        Alert alert = driver.switchTo().alert();
        String alertMessage = alert.getText();
        return alertMessage;
    }


}
