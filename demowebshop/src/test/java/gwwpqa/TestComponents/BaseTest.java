package gwwpqa.TestComponents;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import gwwpqa.AbstartComponents.AbstarctComponent;

public class BaseTest {

	public WebDriver driver;

	@BeforeMethod(alwaysRun=true)
	public void websiteLaunch() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		AbstarctComponent abstracts=new AbstarctComponent(driver);
		abstracts.goTo();
		String pageTitle=driver.getTitle();
		Assert.assertEquals(pageTitle, "Demo Web Shop");
		
	}
	public List<HashMap<String, String>> getJsonDataToMap(String filePath) throws IOException
	{
		//read json to string
	String jsonContent = 	FileUtils.readFileToString(new File(filePath), 
			StandardCharsets.UTF_8);
	
	//String to HashMap- Jackson Databind
	
	ObjectMapper mapper = new ObjectMapper();
	  List<HashMap<String, String>> data = mapper.readValue(jsonContent, new TypeReference<List<HashMap<String, String>>>() {
      });
	  return data;
	
	//{map, map}

	}
	@AfterMethod(alwaysRun=true)
	public void tearDown() {
		driver.quit();
	}


}
