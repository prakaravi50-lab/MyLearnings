package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;

    private By ClickGoogleSearch = By.xpath("/html/body/div[2]/div[4]/form/div[1]/div[1]/div[3]/center/input[1]");

    public LoginPage( WebDriver driver)
    {
        this.driver = driver;
    }
    public void ClickSearch()
    {
        driver.findElement(ClickGoogleSearch).click();
    }
}
