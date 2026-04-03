package tests;

import base.BaseTest;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoadPage extends BaseTest {
@Test
    public void PageSearch()
    {
        LoginPage login = new LoginPage(driver);
        login.ClickSearch();
        String ActualContent = "Google";
        System.out.println("Page Title is :"+driver.getTitle());
        Assert.assertEquals(driver.getTitle(),ActualContent);
    }



}
