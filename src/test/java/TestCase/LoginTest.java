package TestCase;

import PageObjects.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends Base {

    @Test
    public void LoginTest() throws InterruptedException {
        driver.get(baseUrL);
        logger.info("URL is opened");
        LoginPage lp=new LoginPage(driver);
        lp.setUserName(userName);
        logger.info("username entered");
        lp.setPassword(pasword);
        logger.info("password entered");

        lp.clickSubmit();
        if(driver.getTitle().equals("Guru99 Bank Home Page")){
            Assert.assertTrue(true);
            logger.info("login passed");
        }
        else
        {
            Assert.assertFalse(false);
            logger.info("login failed");
        }
        Thread.sleep(5000);


    }

}
