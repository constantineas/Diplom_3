package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends CorePageObject {

    // Локатор поля ввода email
    @FindBy(xpath = ".//fieldset[1]//input")
    public WebElement inputEmailField;

    // Локатор поля ввода пароля
    @FindBy(xpath = ".//fieldset[2]//input")
    public WebElement inputPasswordField;

    // Локатор кнопки войти
    @FindBy(xpath = ".//button[text()='Войти']")
    public WebElement buttonEnter;

    // Локатор кнопки войти в аккаунт
    @FindBy(xpath = ".//button[text()='Войти в аккаунт']")
    public WebElement buttonEnterAccount;

    // Локатор кнопки Оформить заказ
    @FindBy(xpath = ".//button[text()='Оформить заказ']")
    public WebElement buttonCreateOrder;

    // Локатор кнопки Личный Кабинет
    @FindBy(xpath = ".//*[text()='Личный Кабинет']")
    public WebElement buttonPersonalArea;

    // Локатор линктекст Войти
    @FindBy(linkText = "Войти")
    public WebElement linkTextEnter;

    // Локатор линктекст Зарегистрироваться
    @FindBy(linkText = "Зарегистрироваться")
    public WebElement linkTextRegistration;

    // Локатор линктекст Восстановить пароль
    @FindBy(linkText = "Восстановить пароль")
    public WebElement linkTextRestorePassword;

    // Конструктор
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    // Методы клика
    public LoginPage clickButtonEnterAccount() {
        clickButton(buttonEnterAccount);
        return this;
    }

    public LoginPage clickButtonPersonalArea() {
        clickButton(buttonPersonalArea);
        return this;
    }

    public LoginPage clickLinkTextEnter() {
        clickButton(linkTextEnter);
        return this;
    }

    public LoginPage clickLinkTextRegistration() {
        clickButton(linkTextRegistration);
        return this;
    }

    public LoginPage clickLinkTextRestorePassword() {
        clickButton(linkTextRestorePassword);
        return this;
    }

    public LoginPage clickButtonEnter() {
        clickButton(buttonEnter);
        return this;
    }

    // Метод заполенения поля
    public LoginPage sendEmailToField(String name) {
        sendKey(inputEmailField, name);
        return this;
    }

    public LoginPage sendPasswordToField(String name) {
        sendKey(inputPasswordField, name);
        return this;
    }

    // Метод проверки текстовой надписи
    public LoginPage checkTextCreateOrder(String expected) {
        checkText(buttonCreateOrder, expected);
        return this;
    }

}
