import io.qameta.allure.junit4.DisplayName;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pageObjects.RegistrationPage;

import static constants.Constant.*;

@DisplayName("Регистрация")
public class RegistrationPageTest extends BaseTest {

    RegistrationPage registrationPage;

    @Before
    public void startWebDriver() {
        registrationPage = new RegistrationPage(chrome(REGISTRATIONS_URL));
    }

    @After
    public void closeWebDriver() {
        driver.quit();
    }

    @Test
    @DisplayName("Некорректный пароль")
    public void falseRegTest() {
        registrationPage
                .sendNameToField(RandomStringUtils.randomAlphanumeric(10))
                .sendEmailToField(RandomStringUtils.randomAlphanumeric(12) + "@yandex.ru")
                .sendPasswordToField("55555")
                .clickButtonRegistration()
                .checkTextIncorrectPassword("Некорректный пароль");
    }

    @Test
    @DisplayName("Успешная регистрация")
    public void trueRegTest() {
        String name = RandomStringUtils.randomAlphanumeric(10);
        String email = RandomStringUtils.randomAlphanumeric(12) + "@yandex.ru";
        registrationPage
                .sendNameToField(name)
                .sendEmailToField(email)
                .sendPasswordToField(PASSWORD)
                .clickButtonRegistration()
                .checkTextEnter("Вход");
    }

}
