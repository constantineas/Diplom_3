package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BurgerIngredientsPage extends CorePageObject {

    // Локатор текста кнопки Булки
    @FindBy(xpath = "//span[text()='Булки']")
    public WebElement buttonBun;

    // Локатор текста кнопки Соусы
    @FindBy(xpath = "//span[text()='Соусы']")
    public WebElement buttonSauce;

    // Локатор текста кнопки Начинки
    @FindBy(xpath = "//span[text()='Начинки']")
    public WebElement buttonFilling;

    // Локатор кнопки ингредиентов
    @FindBy(css = ".tab_tab_type_current__2BEPc")
    public WebElement buttonAll;

    // Конструктор
    public BurgerIngredientsPage(WebDriver driver) {
        super(driver);
    }

    // Методы клика по кнопке
    public BurgerIngredientsPage clickButtonBun() {
        clickButton(buttonBun);
        return this;
    }

    public BurgerIngredientsPage clickButtonSauce() {
        clickButton(buttonSauce);
        return this;
    }

    public BurgerIngredientsPage clickButtonFilling() {
        clickButton(buttonFilling);
        return this;
    }

    // Метод проверки тектовой надписи
    public BurgerIngredientsPage checkTextCurrentButton(String expected) {
        checkText(buttonAll, expected);
        return this;
    }
}
