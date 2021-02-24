package tests;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.SeleniumInputPage;

public class SeleniumInputTest extends TestBase {
    @Test
    public void init() throws Exception{

        //Testing first form
        SeleniumInputPage inputFirstForm = PageFactory.initElements(driver, SeleniumInputPage.class);
        String expectedMessage = "robert";
        inputFirstForm.setInputMessage(expectedMessage);
        inputFirstForm.clickShowMessageButton();
        Assert.assertEquals(expectedMessage, inputFirstForm.getMessage());

        //Testing second form
        SeleniumInputPage inputSecondForm = PageFactory.initElements(driver, SeleniumInputPage.class);
        String expectedResult = "4";
        inputSecondForm.setInputValueA("2");
        inputSecondForm.setInputValueB("2");
        inputSecondForm.clickGetTotalButton();
        Assert.assertEquals(expectedResult, inputSecondForm.getTotal());




    }
}
