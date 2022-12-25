package pageobjects;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static constants.Constant.TIME_OUT_IN_SECONDS;

public class CorePageObject {
    private final WebDriver driver;

    public CorePageObject(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @Step("Ожидание элемента")
    public WebElement waitForElement(WebElement locator, long time) {
        return new WebDriverWait(driver, Duration.ofSeconds(time))
                .until(ExpectedConditions.visibilityOf(locator));
    }

    @Step("Нажатие на кнопку")
    public CorePageObject clickButton(WebElement button) {
        waitForElement(button, TIME_OUT_IN_SECONDS);
        button.click();
        return this;
    }

    @Step("Ввод значения {name} в поле ")
    public CorePageObject sendKey(WebElement locator, String name) {
        waitForElement(locator, TIME_OUT_IN_SECONDS);
        locator.sendKeys(name);
        return this;
    }

    @Step("Отображается ли элемент")
    public CorePageObject isDisplayed(WebElement locator) {
        waitForElement(locator, TIME_OUT_IN_SECONDS);
        Assert.assertTrue(locator.isDisplayed());
        return this;
    }

    @Step("Проверка отображения текста {expected}")
    public CorePageObject checkText(WebElement locator, String expected) {
        waitForElement(locator, TIME_OUT_IN_SECONDS);
        WebElement actual = locator;
        Assert.assertEquals("Ошибка, должно быть: " + expected, expected, actual.getText());
        return this;
    }

}
