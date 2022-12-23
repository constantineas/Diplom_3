package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends CorePageObject {

    // Локатор кнопки Войти в аккаунт
    @FindBy(xpath = ".//button[text()='Войти в аккаунт']")
    public WebElement buttonEnterAccount;

    // Локатор поле ввода email
    @FindBy(xpath = ".//fieldset[1]//input")
    public WebElement inputEmailField;

    // Локатор поле ввода Пароля
    @FindBy(xpath = ".//fieldset[2]//input")
    public WebElement inputPasswordField;

    // Локатор кнопки Войти
    @FindBy(xpath = ".//button[text()='Войти']")
    public WebElement buttonEnter;

    // Локатор кнопки Выход
    @FindBy(xpath = ".//button[text()='Выход']")
    public WebElement buttonExit;

    // Локатор кнопки Личный Кабинет
    @FindBy(xpath = ".//*[text()='Личный Кабинет']")
    public WebElement buttonPersonalArea;

    // Локатор текста Имя
    @FindBy(xpath = ".//*[text()='Имя']")
    public WebElement inputTypeName;

    // Локатор текста Логин
    @FindBy(xpath = ".//*[text()='Логин']")
    public WebElement inputTypeLogin;

    // Локатор текста Пароль
    @FindBy(xpath = ".//*[text()='Пароль']")
    public WebElement inputTypePassword;

    // Локатор текста Вход
    @FindBy(xpath = ".//*[text()='Вход']")
    public WebElement textEnter;

    // Локатор текста Конструктор
    @FindBy(xpath = ".//*[text()='Конструктор']")
    public WebElement textConstructor;

    // Локатор кнопки Оформить заказ
    @FindBy(xpath = ".//button[text()='Оформить заказ']")
    public WebElement buttonCreateOrder;

    // Локатор Stellar Burgers
    @FindBy(xpath = "//a[.//*[@id='filter0_f']]")
    public WebElement stellarBurgers;

    // Конструктор
    public AccountPage(WebDriver driver) {
        super(driver);
    }

    // Методы кликов по элементам
    public AccountPage clickStellarBurgers() {
        clickButton(stellarBurgers);
        return this;
    }

    public AccountPage clickTextConstructor() {
        clickButton(textConstructor);
        return this;
    }

    public AccountPage clickButtonEnter() {
        clickButton(buttonEnter);
        return this;
    }

    public AccountPage clickButtonExit() {
        clickButton(buttonExit);
        return this;
    }

    public AccountPage clickButtonEnterAccount() {
        clickButton(buttonEnterAccount);
        return this;
    }

    public AccountPage clickButtonPersonalArea() {
        clickButton(buttonPersonalArea);
        return this;
    }

    // Методы видимости элементов
    public AccountPage isDisplayedButtonEnter() {
        isDisplayed(buttonEnter);
        return this;
    }

    public AccountPage isDisplayedTextEnter() {
        isDisplayed(textEnter);
        return this;
    }

    public AccountPage isDisplayedFieldName() {
        isDisplayed(inputTypeName);
        return this;
    }

    public AccountPage isDisplayedFieldLogin() {
        isDisplayed(inputTypeLogin);
        return this;
    }

    public AccountPage isDisplayedFieldPassword() {
        isDisplayed(inputTypePassword);
        return this;
    }

    // Методы заполенения полей
    public AccountPage sendPasswordToField(String name) {
        sendKey(inputPasswordField, name);
        return this;
    }

    public AccountPage sendEmailToField(String name) {
        sendKey(inputEmailField, name);
        return this;
    }

    // Метод проверки текстовой надписи
    public AccountPage checkTextCreateOrder(String expected) {
        checkText(buttonCreateOrder, expected);
        return this;
    }

}
