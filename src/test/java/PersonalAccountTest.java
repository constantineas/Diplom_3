import io.qameta.allure.junit4.DisplayName;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pageObjects.AccountPage;

import static constants.Constant.*;

@DisplayName("Переход в личный кабинет")
public class PersonalAccountTest extends BaseTest {

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
    @DisplayName("Успешная ли авторизация в личный кабинет")
    public void checkEnterAccountTest() {
        accountPage
                .clickButtonEnterAccount()
                .sendEmailToField(EMAIL)
                .sendPasswordToField(PASSWORD)
                .clickButtonEnter()
                .clickButtonPersonalArea()
                .isDisplayedFieldName()
                .isDisplayedFieldLogin()
                .isDisplayedFieldPassword()
        ;
    }
}
