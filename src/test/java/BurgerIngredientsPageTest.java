import io.qameta.allure.junit4.DisplayName;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pageObjects.BurgerIngredientsPage;

import static constants.Constant.*;

@DisplayName("Раздел «Конструктор»")
public class BurgerIngredientsPageTest extends BaseTest {

    BurgerIngredientsPage burgerIngredients;

    @Before
    public void startWebDriver() {
        burgerIngredients = new BurgerIngredientsPage(chrome(BASE_URL));
    }

    @After
    public void closeWebDriver() {
        driver.quit();
    }

    @Test
    @DisplayName("Перехода к разделу Булки")
    public void checkGoToBunTest() {
        burgerIngredients
                .clickButtonSauce()
                .clickButtonBun()
                .checkTextCurrentButton("Булки")
        ;
    }

    @Test
    @DisplayName("Перехода к разделу Соусы")
    public void checkGoToSauceTest() {
        burgerIngredients
                .clickButtonSauce()
                .checkTextCurrentButton("Соусы")
        ;
    }

    @Test
    @DisplayName("Перехода к разделу Начинки")
    public void checkGoToFillingTest() {
        burgerIngredients
                .clickButtonFilling()
                .checkTextCurrentButton("Начинки")
        ;
    }

}
