import io.qameta.allure.junit4.DisplayName;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pageobjects.AccountPage;

import static constants.Constant.*;

@DisplayName("Выхода из аккаунта")
public class LogoutAccountTest extends BaseTest {

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
    @DisplayName("Выход по кнопке «Выйти» в личном кабинете")
    public void checkLogoutTest() {
        accountPage
                .clickButtonEnterAccount()
                .sendEmailToField(EMAIL)
                .sendPasswordToField(PASSWORD)
                .clickButtonEnter()
                .clickButtonPersonalArea()
                .clickButtonExit()
                .isDisplayedTextEnter()
                .isDisplayedButtonEnter()
        ;
    }
}
