package exercises.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSteps {
    public static void main(String[] args) throws InterruptedException {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("http://internetka.in.ua/selenium-chrome-driver/");
        System.out.println(webDriver.getTitle());
        WebElement s = webDriver.findElement(By.cssSelector("#post-1325 > div.entry-meta.entry-header"));
        webDriver.findElement(By.id("search-button")).click();
    }
}
