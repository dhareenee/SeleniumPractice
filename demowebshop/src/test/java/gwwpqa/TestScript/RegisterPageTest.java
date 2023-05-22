package gwwpqa.TestScript;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import gwwpqa.TestComponents.BaseTest;
import gwwpqa.pageobjects.RegisterPage;

public class RegisterPageTest extends BaseTest {

	@Test

	public void registeruser() throws InterruptedException {
		String FirstName="User";
		String LastName="1";
		String email = FirstName + System.currentTimeMillis()+"@gmail.com";
		String password="password";
		String gender="female";
		RegisterPage registerPage=new RegisterPage(driver);
		registerPage.homeToRegisterPage();
		registerPage.fillMadantoryFields(FirstName, LastName, email, password, password);
		registerPage.fillOptionalfields(gender);
		WebElement registerMsg=registerPage.clickRegister();
		Assert.assertEquals(registerMsg.getText(), "Your registration completed");
		registerPage.resgisterCont();
		Assert.assertEquals(registerPage.validateLoginUser(),email);






}
}