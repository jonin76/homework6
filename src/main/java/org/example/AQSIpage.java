package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AQSIpage extends AbstractPage{

    @FindBy(xpath = "//div[@id=\"app-root\"]/div/div/div/div/div[1]/ul[1]/div[1]/a/div[2]/p")
    private WebElement monitoring;

    @FindBy(xpath = "//div[@id=\"app-root\"]/div/div/div/div/div[1]/ul[2]/div[2]/a/div[2]/p")
    private WebElement reference;

    @FindBy(xpath = "//div[3]/div[3]/div/div[1]/a/div/p")
    private WebElement database;

    @FindBy(xpath = "//main[@class=\"jss266\"]/header/div[1]/div/div/div[1]/button/span[1]/h5")
    private WebElement categore;

    @FindBy(xpath = "//main[@class=\"jss266\"]/div[2]/div[2]/button/span[1]")
    private WebElement buttonCreate;

    @FindBy(name = "name")
    private WebElement categoreName;

    @FindBy(id = "mui-component-select-defaultPaymentMethodType")
    private WebElement defaultPaymentMethodType;

    @FindBy(css = ".font-loaded")
    private WebElement createType;

    @FindBy(xpath = "//*[@id=\"mui-component-select-defaultTax\"]")
    private WebElement createTax;

    @FindBy(xpath = "//div[@id=\"menu-defaultTax\"]/div[3]/ul/li[1]")
    private WebElement setTypeTax;

    @FindBy(xpath = "//div[3]/div[3]/div/div[2]/form/div/div[12]/div/div/button")
    private WebElement buttonCreateCat;

    public AQSIpage(WebDriver driver){
        super(driver);
    }

    public void goToDatabase(){
        reference.click();
        database.click();
    }
    public void goToCreate(){
        categore.click();
        buttonCreate.click();
    }
    public void setCatName(String categoreName){
        this.categoreName.click();
        this.categoreName.sendKeys(categoreName);
    }
    public void setPaymentType(){
        defaultPaymentMethodType.click();
        createType.click();
    }
    public void setTax(){
        createTax.click();
        setTypeTax.click();
    }
    public void saveAs(){
        buttonCreateCat.click();
    }
}
