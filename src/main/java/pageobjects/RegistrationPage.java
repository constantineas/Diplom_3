package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends CorePageObject {
    // Локатор поля ввода имени
    @FindBy(xpath = ".//fieldset[1]//input")
    private WebElement inputNameField;

    // Локатор поля ввода email
    @FindBy(xpath = ".//fieldset[2]//input")
    private WebElement inputEmailField;

    // Локатор поля ввода Пароля
    @FindBy(xpath = ".//fieldset[3]//input")
    private WebElement inputPasswordField;

    // Локатор кнопки Зарегистрироваться
    @FindBy(xpath = ".//button[text()='Зарегистрироваться']")
    private WebElement buttonRegistration;

    // Локатор текста сообщения Некорректный пароль
    @FindBy(xpath = "//*[text() = 'Некорректный пароль']")
    private WebElement textIncorrectPassword;

    // Локатор текста сообщения Такой пользователь уже существует
    @FindBy(xpath = "//*[text() = 'Такой пользователь уже существует']")
    private WebElement textUserAlreadyExists;

    // Локатор успешная регистрация
    @FindBy(xpath = "//*[text() = 'Вход']")
    private WebElement textEnter;

    // Конструктор
    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    // Метод клика по кнопке
    public RegistrationPage clickButtonRegistration() {
        clickButton(buttonRegistration);
        return this;
    }

    // Методы заполенения поля
    public RegistrationPage sendNameToField(String name) {
        sendKey(inputNameField, name);
        return this;
    }

    public RegistrationPage sendEmailToField(String name) {
        sendKey(inputEmailField, name);
        return this;
    }

    public RegistrationPage sendPasswordToField(String name) {
        sendKey(inputPasswordField, name);
        return this;
    }

    // Методы проверки текстовой надписи
    public RegistrationPage checkTextIncorrectPassword(String expected) {
        checkText(textIncorrectPassword, expected);
        return this;
    }

    public RegistrationPage checkTextUserAlreadyExists(String expected) {
        checkText(textUserAlreadyExists, expected);
        return this;
    }

    public RegistrationPage checkTextEnter(String expected) {
        checkText(textEnter, expected);
        return this;
    }

}
