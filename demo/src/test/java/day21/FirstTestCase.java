package day21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
// import org.openqa.selenium.edge.EdgeDriver;
// import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTestCase {
  public static void main(String[] args) {
    System.out.println("testing....");
    // 1. Lunch browser (Chrome)
    // ChromeDriver driver = new ChromeDriver(); // this is used only for chrome
    // WebDriver driver = new ChromeDriver(); // with this we can use any browser
    // WebDriver driver = new EdgeDriver(); // with this we can use edge browser
    // WebDriver driver = new FirefoxDriver(); // with this we can use Firefox
    // browser
    WebDriver driver = new ChromeDriver(); // with this we can use chrome browser

    // 2. Open the URL https://lego.mybrickhouse.com/
    driver.get("https://lego.mybrickhouse.com");

    // 3. Validate title should be "mybrickhouse – Ample Technologies Pvt Ltd"

    String actual_title = driver.getTitle();
    if (actual_title.equals("mybrickhouse – Ample Technologies Pvt Ltd")) {
      System.out.println("Test passed");
    } else {
      System.out.println("Test failed");
    }

    // 4. close the browser
    // driver.close();
    driver.quit();
  }
}
