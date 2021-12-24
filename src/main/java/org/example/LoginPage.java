package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;



public class LoginPage extends AbstractPage {

    @FindBy(name = "emailOrPhone")
    private WebElement login;

    @FindBy(name = "password")
    private WebElement password;

    @FindBy(xpath = "//div[@id=\"app-root\"]/div/section/div/form/div/div[5]/button/span[1]")
    private WebElement submit;

    @FindBy(xpath = "//div[@id=\"app-root\"]/div/div/div/div/div[1]/ul[4]/div/div[2]/p")
    private WebElement logout;

    public LoginPage(WebDriver driver){

        super(driver);
    }

public void loginIn() {this.submit.click();}

    public LoginPage setLogin(String login){
        this.login.sendKeys(login);
        return this;
    }

    public LoginPage setPassword(String password){
        this.password.click();
        this.password.sendKeys(password);
        return this;
    }

    public void loginIn(String login, String password){
        Actions loginIn = new Actions(getDriver());
        loginIn.sendKeys(this.login,login).click(this.password).sendKeys(password).click(this.submit).build().perform();
    }


}
