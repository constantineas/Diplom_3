import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static constants.Constant.TIME_OUT_IN_SECONDS;

public class BaseTest {

    WebDriver driver;

    public WebDriver chrome(String baseUrl) {
        System.setProperty("webdriver.chrome.driver", "src/test/driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIME_OUT_IN_SECONDS));
        driver.get(baseUrl);
        return driver;
    }

    public WebDriver yandex(String baseUrl) {
        System.setProperty("webdriver.chrome.driver", "src/test/driver/yandexdriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIME_OUT_IN_SECONDS));
        driver.get(baseUrl);
        return driver;
    }
}
