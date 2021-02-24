package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SeleniumInputPage {

    WebDriver driver;

    public SeleniumInputPage(WebDriver driver){
        this.driver=driver;
    }

    //Using FindBy for locating elements of first form
    @FindBy(how=How.XPATH, using="//input[@type='text'][@id='user-message']") WebElement inputMessage;
    @FindBy(how=How.XPATH, using="//button[@onclick='showInput();'][@class='btn btn-default']") WebElement showMessageButton;
    @FindBy(how=How.XPATH, using="//span[@id='display']") WebElement message;

    //Using FindBy for locating elements of second form
    @FindBy(how=How.XPATH, using="//input[@type='text'][@id='sum1']") WebElement inputValueA;
    @FindBy(how=How.XPATH, using="//input[@type='text'][@id='sum2']") WebElement inputValueB;
    @FindBy(how=How.XPATH, using="//button[@onclick='return total()'][@class='btn btn-default']") WebElement getTotalButton;
    @FindBy(how=How.XPATH, using="//span[@id='displayvalue']") WebElement total;

    // Methods for first form
    public void setInputMessage(String message){
        inputMessage.sendKeys(message);
    }

    public void clickShowMessageButton(){
        showMessageButton.click();
    }

    public String getMessage(){
        return message.getText();
    }

    //Methods for second form
    public void setInputValueA(String valueA){
        inputValueA.sendKeys(valueA);
    }

    public void setInputValueB(String valueB){
        inputValueB.sendKeys(valueB);
    }

    public void clickGetTotalButton(){
        getTotalButton.click();
    }

    public String getTotal(){
        return total.getText();
    }

}
