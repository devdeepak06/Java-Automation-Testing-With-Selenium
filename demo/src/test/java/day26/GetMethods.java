package day26;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class GetMethods {
  public static void main(String[] args) {
    WebDriver driver = new ChromeDriver();
    driver.get("https://lego.mybrickhouse.com");
    driver.manage().window().maximize();
    driver.findElement(By.className("cc-popup-close")).click();
    
    // Get title
    String title = driver.getTitle();
    System.out.println("Title of the page: " + title);
    
    // Get current URL
    String currentUrl = driver.getCurrentUrl();
    System.out.println("Current URL: " + currentUrl);

    // Get page source
    String pageSource = driver.getPageSource();
    System.out.println("Page Source length: " + pageSource.length());
    
    // Get window handle
    String windowHandle = driver.getWindowHandle();
    System.out.println("Window Handle: " + windowHandle);

    // Get window handles
    var windowHandles = driver.getWindowHandles();
    System.out.println("Number of open windows: " + windowHandles.size());

    // Close the browser
    driver.quit();

  }

}
