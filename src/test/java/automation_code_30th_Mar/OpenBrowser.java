package automation_code_30th_Mar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


	
public class OpenBrowser {

	public static WebDriver driver;

	public static void main(String[] args) {
		

		driver = new Chromedriver(); //Ctrl+Shift+O , Command+Shift+O
		driver.manage().window().maximize();
		driver.get("https://amazon.com") 
		driver.quit();
		
		driver = new Edgedriver();
		driver.manage().window().maximize();
		driver.get("https://costco.com") 
		driver.quit();
		

		

	}

}
