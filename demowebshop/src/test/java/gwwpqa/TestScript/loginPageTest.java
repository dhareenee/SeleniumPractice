package gwwpqa.TestScript;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import gwwpqa.TestComponents.BaseTest;
import gwwpqa.pageobjects.CartPage;
import gwwpqa.pageobjects.LoginPage;
import gwwpqa.pageobjects.ProductPage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;

public class loginPageTest extends BaseTest{

	@Test(dataProvider="getData")
	public void login(HashMap<String,String> input) throws InterruptedException  {

		String email=input.get("userId");
		String password=input.get("password");
		String product1=input.get("product1");
		String product2=input.get("product1");
		LoginPage loginPage=new LoginPage(driver);
		loginPage.loginUser(email, password);
		loginPage.validateLoginUser();
		ProductPage productPage=new ProductPage(driver);
		productPage.searchBar(product1);
		productPage.getProductList();
		productPage.searchProduct(product1);
		productPage.addProductToCart();
		Assert.assertEquals(productPage.getAddtoCartNotification(),"  The product has been added to your shopping cart");
		productPage.searchBar(product2);
        productPage.searchProduct(product2);
		productPage.addProductToCart();
		Assert.assertEquals(productPage.getAddtoCartNotification(),"  The product has been added to your shopping cart");
		CartPage cartPage=new CartPage(driver);
		cartPage.clickCartBtn();
		cartPage.getCartItem();
		cartPage.getCartProduct(product1);
		cartPage.getCartProduct(product2);
		Assert.assertEquals(cartPage.getCartProduct(product1).getText().contains(product1), true);
		Assert.assertEquals(cartPage.getCartProduct(product2).getText().contains(product2), true);

	}
	

	@DataProvider
	public Object[][] getData() throws IOException
	{

		
		List<HashMap<String,String>> data = getJsonDataToMap(System.getProperty("user.dir")+"\\src\\test\\java\\gwwpqa\\Data\\Dataprovider.json");
		return new Object[][]  {{data.get(0)}};
		
	}
}

	
