import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;


public class Interacciones {

	public static void main(String[] args) {
		System.setProperty("webdriver.Chrome.driver", "D:\\PROGRAMAS\\drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe"); //aqui le especificamos la ruta donde se encuentra el ejecutor de chrome
		WebDriver driver_chrome = new ChromeDriver(); // declaramos una variable para montar el chrome driver
		
		driver_chrome.get("https://www.facebook.com/"); //mandamos a abrir con la variable donde se encuentra nuestro ejecutor y con get lo abre
		
		//find element and click to open the new form
		driver_chrome.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a")).click();
		System.out.println("Button Found");
		System.out.println("Click Button");
		System.out.println("Open Register");
		System.out.println("-------------------");
		
		//find element and sendkeys in the field
		driver_chrome.findElement(By.name("firstname")).sendKeys("Pablo Fernando");
		System.out.println("Nombre Agregado");
		//clear field
		driver_chrome.findElement(By.name("firstname")).clear();
		System.out.println("Campo Limpio");
		System.out.println("-------------------");
		
		//find element and click the dropdown list to select one numer day
		driver_chrome.findElement(By.id("day")).click();
		System.out.println("Lista desplegable clikeada");
		

		
		

		
		
	}

}
