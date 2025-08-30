package day22;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocatorsDemo {

  public static void main(String[] args) {
    WebDriver driver = new ChromeDriver();
    driver.get("https://lego.mybrickhouse.com");
    // driver.get("https://www.google.com/");
    driver.manage().window().maximize();
    driver.findElement(By.className("cc-popup-close")).click();

    // name locator
    // driver.findElement(By.name("q")).sendKeys("https://lego.mybrickhouse.com/");
    // boolean sectionDisplayed =
    // driver.findElement(By.id("shopify-section-template--24938864083266__card_collection_hgzcCt")).isDisplayed();
    // System.out.println(sectionDisplayed);
    // linktext and partiallinktext
    // driver.findElement(By.partialLinkText("Search")).click();
    // driver.findElement(By.partialLinkText("Brick Deals")).click();

    // tagname and class

    // List<WebElement> headerLinks =
    // driver.findElements(By.className("site-nav__item"));
    // System.out.println("Total no of links: " + headerLinks.size()); // 10

    List<WebElement> listItems = driver.findElements(By.tagName("li"));
    System.out.println("Total no of list items: " + listItems.size()); // 276

    List<WebElement> anchorLinks = driver.findElements(By.tagName("a"));
    System.out.println("Total no of anchorLinks : " + anchorLinks.size()); // 435

    List<WebElement> images = driver.findElements(By.tagName("img"));
    System.out.println("Total no of images : " + images.size()); // 86

    driver.findElement(By.partialLinkText("Brick Deals")).click();
    System.out.println(driver.findElement(By.partialLinkText("Speed Champions Mercedes-AM")).getText());

    driver
        .findElement(
            By.partialLinkText(
                "Speed Champions Mercedes-AMG"))
        .click();

    // driver.quit();
  }
}
