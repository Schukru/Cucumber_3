package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import java.time.LocalDateTime;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GWDBasic {

    public static WebDriver driver;
    public static WebDriver getDriver()
    {
        if (driver == null) {

            Locale.setDefault( new Locale("EN"));   // extent report Türkçe
            System.setProperty("user.language","EN");       // diliyle çalışmaması nedeniyle eklendi

            Logger.getLogger("").setLevel(Level.SEVERE);
            System.setProperty(org.slf4j.impl.SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "Error");
            System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");

            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();

        //     firefox
        //  WebDriverManager.firefoxdriver().setup();
        //  driver = new FirefoxDriver();

        }
        return driver;
    }

    public static void quitDriver() {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if (driver != null){
            driver.quit();
            driver=null;
        }
    }

    public static void Bekle(int saniye)
    {
        try {
            Thread.sleep(saniye*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static String tarihSaatDamgasi(){

        LocalDateTime tarihSaat = LocalDateTime.now();
        String zamanDamgasi = tarihSaat.toString();

        zamanDamgasi = zamanDamgasi.replaceAll("[-.:]","_");
        zamanDamgasi = zamanDamgasi.replaceAll("[T]"," - ");

        return zamanDamgasi;
    }

}
