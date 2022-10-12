package StepDefinitions;

import Utilities.GWDBasic;
import com.aventstack.extentreports.service.ExtentTestManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Hooks {

    @Before
    public void before()
    {
        System.out.println("Senaryo başladı");
    }

    @After
    public void after(Scenario scenario)
    {
        System.out.println("Senaryo Bitti.... : " + scenario.getStatus());

        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");

        if (scenario.isFailed()){
            // klasöre
            TakesScreenshot screenshot = (TakesScreenshot) GWDBasic.getDriver();
            File ekranDosyasi = screenshot.getScreenshotAs(OutputType.FILE);

            ExtentTestManager.getTest().addScreenCaptureFromBase64String(getBase64Screenshot());
            try {
//                FileUtils.copyFile(ekranDosyasi,
//                        new File("target/FailedScreenShots/"+ scenario.getId()+date.format(formatter)+".png"));
                FileUtils.copyFile(ekranDosyasi,
                        new File("target/FailedScreenShots/"+ GWDBasic.tarihSaatDamgasi() + ".png"));

            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        // ekran görüntüsü al senaryo hatalı ise
        GWDBasic.quitDriver();
    }

    public String getBase64Screenshot()
    {
        return ((TakesScreenshot) GWDBasic.getDriver()).getScreenshotAs(OutputType.BASE64);
    }

}