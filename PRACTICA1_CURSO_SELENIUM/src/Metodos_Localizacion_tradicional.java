import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Metodos_Localizacion_tradicional {

	public static void main(String[] args) {
		System.setProperty("webdriver.Chrome.driver", "D:\\PROGRAMAS\\drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe"); //aqui le especificamos la ruta donde se encuentra el ejecutor de chrome
		WebDriver driver_chrome = new ChromeDriver(); // declaramos una variable para montar el chrome driver
		
		//Mandar a buscar la pagina requerida
		driver_chrome.get("https://www.google.com");
		
		//Busqueda del id
		driver_chrome.findElement(By.id("APjFqb"));
		System.out.println(driver_chrome.findElement(By.id("APjFqb")));
		
		//Busqueda del del boton de busqueda class
		driver_chrome.findElement(By.className("gNO89b"));
		System.out.println(driver_chrome.findElement(By.className("gNO89b")));
		
		//Buscar el name del boton de voy a tener suerte y se agrego para que muestre en la consola lo que encontro
		driver_chrome.findElement(By.name("btnI"));
		System.out.println(driver_chrome.findElement(By.name("btnI")));
		
		//Buscar el name del boton de voy a tener suerte y se agrego para que muestre en la consola lo que encontro
		driver_chrome.findElement(By.linkText("Sobre Google"));
		
		//Bucar por xpath
		driver_chrome.findElement(By.xpath("/html/body/div[1]/div[2]/div/img"));



		
		
		//Cerrar el google
		driver_chrome.close();
		
		

	}

}
