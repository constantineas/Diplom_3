import io.qameta.allure.junit4.DisplayName;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pageObjects.AccountPage;

import static constants.Constant.*;

@DisplayName("Переход из личного кабинета в конструктор ")
public class BurgerConstructorTest extends BaseTest {

    AccountPage accountPage;

    @Before
    public void startWebDriver() {
        accountPage = new AccountPage(chrome(BASE_URL));
    }

    @After
    public void closeWebDriver() {
        driver.quit();
    }

    @Test
    @DisplayName("Перехода по клику на кнопку «Конструктор» ")
    public void checkEnterConstructorTest() {
        accountPage
                .clickButtonEnterAccount()
                .sendEmailToField(EMAIL)
                .sendPasswordToField(PASSWORD)
                .clickButtonEnter()
                .clickButtonPersonalArea()
                .clickTextConstructor()
                .checkTextCreateOrder("Оформить заказ")
        ;
    }

    @Test
    @DisplayName("Перехода по клику на логотип Stellar Burgers")
    public void checkEnterStellarBurgersTest() {
        accountPage
                .clickButtonEnterAccount()
                .sendEmailToField(EMAIL)
                .sendPasswordToField(PASSWORD)
                .clickButtonEnter()
                .clickButtonPersonalArea()
                .clickStellarBurgers()
                .checkTextCreateOrder("Оформить заказ")
        ;
    }
}
