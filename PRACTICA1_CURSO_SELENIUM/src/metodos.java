import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class metodos {

	public static void main(String[] args) {
		System.setProperty("webdriver.Chrome.driver", "D:\\PROGRAMAS\\drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe"); //aqui le especificamos la ruta donde se encuentra el ejecutor de chrome
		WebDriver driver_chrome = new ChromeDriver(); // declaramos una variable para montar el chrome driver
		
		//Metodo basico 1, get = nos abre pagina reuqerida
		driver_chrome.get("https://www.google.com"); //mandamos a abrir con la variable donde se encuentra nuestro ejecutor y con get lo abre
		
		//Metodo basico 2, getTitle() = nos trae el titulo de la pagina actual
		System.out.println(driver_chrome.getTitle());
		
		//Metodo basico 3, getCurrentURL() = nos trae el URL actual 
		System.out.println(driver_chrome.getCurrentUrl());
		
		//Metodo basico 4, close() me cierra la ventana 
		//driver_chrome.close();
		
		//Metodo baico 5, quit() me cierra la secion
		driver_chrome.quit();
		
		

	}

}
