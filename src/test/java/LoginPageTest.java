import io.qameta.allure.junit4.DisplayName;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pageObjects.LoginPage;

import static constants.Constant.*;

@DisplayName("Вход")
public class LoginPageTest extends BaseTest {

    LoginPage loginPage;

    @Before
    public void startWebDriver() {
        loginPage = new LoginPage(chrome(BASE_URL));
    }

    @After
    public void closeWebDriver() {
        driver.quit();
    }

    @Test
    @DisplayName("Входа по кнопке «Войти в аккаунт» на главной")
    public void checkEnterAccountTest() {
        loginPage
                .clickButtonEnterAccount()
                .sendEmailToField(EMAIL)
                .sendPasswordToField(PASSWORD)
                .clickButtonEnter()
                .checkTextCreateOrder("Оформить заказ")
        ;
    }

    @Test
    @DisplayName("Входа через кнопку «Личный кабинет»")
    public void checkPersonalAccount() {
        loginPage
                .clickButtonPersonalArea()
                .sendEmailToField(EMAIL)
                .sendPasswordToField(PASSWORD)
                .clickButtonEnter()
                .checkTextCreateOrder("Оформить заказ")
        ;
    }

    @Test
    @DisplayName("Входа через кнопку в форме регистрации")
    public void checkRegistration() {
        loginPage
                .clickButtonEnterAccount()
                .clickLinkTextRegistration()
                .clickLinkTextEnter()
                .sendEmailToField(EMAIL)
                .sendPasswordToField(PASSWORD)
                .clickButtonEnter()
                .checkTextCreateOrder("Оформить заказ")
        ;
    }

    @Test
    @DisplayName("Входа через кнопку в форме восстановления пароля")
    public void checkRestorePassword() {
        loginPage
                .clickButtonPersonalArea()
                .clickLinkTextRestorePassword()
                .clickLinkTextEnter()
                .sendEmailToField(EMAIL)
                .sendPasswordToField(PASSWORD)
                .clickButtonEnter()
                .checkTextCreateOrder("Оформить заказ")
        ;
    }

}
