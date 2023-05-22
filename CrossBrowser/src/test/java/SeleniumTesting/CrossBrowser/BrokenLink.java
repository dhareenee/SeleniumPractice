package SeleniumTesting.CrossBrowser;

import java.io.IOException;
import java.net.*;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import sun.net.www.protocol.http.HttpURLConnection;

public class BrokenLink {
	
	@Test
	
	public void brokenlink() {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.simplilearn.com/tutorials/selenium-tutorial/selenium-interview-questions-and-answers");
	/*List<WebElement> link=	driver.findElements(By.tagName("a"));
	List<String> urlLink=new ArrayList<String>();
	
	for(WebElement e:link) {
		String url=e.getAttribute("href");
		urlLink.add(url);
	}
	
	urlLink.parallelStream().forEach(e->{
		try {
			checkbrokenLink(e);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	});
	
		
		
	}
	
	public void checkbrokenLink(String LinkURL) throws IOException {
		URL url=new URL(LinkURL);
		HttpURLConnection httpConnection=(HttpURLConnection) url.openConnection();
		if (httpConnection.getResponseCode()>=400)
		{
			System.out.println("Broken Link" + httpConnection.getResponseMessage());
		}
		else {
			System.out.println(httpConnection.getResponseMessage());
		}
		*/
	}

}
