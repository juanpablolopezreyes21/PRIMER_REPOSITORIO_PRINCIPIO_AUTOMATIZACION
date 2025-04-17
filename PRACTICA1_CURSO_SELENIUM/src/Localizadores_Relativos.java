import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Localizadores_Relativos {

	public static void main(String[] args) {
		System.setProperty("webdriver.Chrome.Driver","D:\\PROGRAMAS\\drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver_chrome = new ChromeDriver();
		
		driver_chrome.get("https://www.google.com");
		
		//Uso del localizador relativo
		driver_chrome.findElement(RelativeLocator.with(By.tagName("a")).toRightOf(By.className("gb_B"))).click();
		

	}

}
