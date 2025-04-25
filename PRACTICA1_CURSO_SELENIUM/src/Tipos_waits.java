import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebElement;


public class Tipos_waits {

	public static void main(String[] args) {
		System.setProperty("webdriver.Chrome.driver", "D:\\PROGRAMAS\\drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe"); //aqui le especificamos la ruta donde se encuentra el ejecutor de chrome
		WebDriver driver_chrome = new ChromeDriver(); // declaramos una variable para montar el chrome driver
		
		/*//Implicit wait
		driver_chrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver_chrome.get("https://www.google.com"); //mandamos a abrir con la variable donde se encuentra nuestro ejecutor y con get lo abre
		driver_chrome.findElement(By.className("gLFyf"));
		System.out.println("Se Encontro: className");
		*/
		
		/*//Explicit Wait
		driver_chrome.get("https://www.google.com"); //mandamos a abrir con la variable donde se encuentra nuestro ejecutor y con get lo abre
		WebElement image = driver_chrome.findElement(By.className("gLFyf"));
		System.out.println("Se Encontro: gLFyf");
		Wait<WebDriver> wait = new WebDriverWait(driver_chrome,Duration.ofSeconds(30));
		wait.until(imageshow -> image.isDisplayed());
		driver_chrome.findElement(By.className("gLFyf")).sendKeys("Selenium");
		System.out.println("Se Encontro: gLFyf y se agrergo en el buscador Selenium");
		*/
		
		//Fluent Wait
		driver_chrome.get("https://www.google.com"); //mandamos a abrir con la variable donde se encuentra nuestro ejecutor y con get lo abre
		WebElement image = driver_chrome.findElement(By.className("gLFyf"));
		Wait <WebDriver> wait = new FluentWait<>(driver_chrome)
			.withTimeout(Duration.ofSeconds(3))
			.pollingEvery(Duration.ofMillis(300))
			.ignoring(ElementNotInteractableException.class);
		wait.until(d->{
			image.sendKeys("Selenium");
			return true; 
		});
			
			
		
					
			
			
		
		
		
		

	}

}
