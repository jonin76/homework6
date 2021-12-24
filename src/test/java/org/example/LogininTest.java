package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogininTest extends AbstractTest {

    @Test
    void loginIn(){
        new LoginPage(getWebDriver()).loginIn();
        Assertions.assertTrue(webDriver.getTitle().equals("aQsi - онлайн кассы для вашего бизнеса, полное соответствие 54-фз. ФН включен в стоимость кассы, быстрая настройка и старт продаж."),"Страница не доступна");
        new LoginPage(getWebDriver()).setLogin("gea+t1@aqsi.ru").setPassword("Qq123456").loginIn();
        Assertions.assertTrue(webDriver.findElement(By.xpath("//div[@id=\"app-root\"]/div/div/div/div/div[1]/ul[1]/div[1]/a/div[2]/p")).getText().equals("Мониторинг"));
    }

    @Test
    void createCategore() {
        new AQSIpage(getWebDriver()).goToDatabase();
        new AQSIpage(getWebDriver()).goToCreate();
        new AQSIpage(getWebDriver()).setCatName("Категория 3");
        new AQSIpage(getWebDriver()).setPaymentType();
        new AQSIpage(getWebDriver()).setTax();
        new AQSIpage(getWebDriver()).saveAs();
        Assertions.assertTrue(webDriver.findElement(By.xpath("//p[@title=\"Категория3\"]")).getText().equals("Категория 3"));

    }

}
