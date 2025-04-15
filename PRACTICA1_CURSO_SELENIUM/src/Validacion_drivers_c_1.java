//importamos las variables para que el programa lo puedan detectar y busque las librerias usadas
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Validacion_drivers_c_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//validacion de chrome
		System.setProperty("webdriver.Chrome.driver", "D:\\PROGRAMAS\\drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe"); //aqui le especificamos la ruta donde se encuentra el ejecutor de chrome
		WebDriver driver_chrome = new ChromeDriver(); // declaramos una variable para montar el chrome driver
		driver_chrome.get("https://www.google.com"); //mandamos a abrir con la variable donde se encuentra nuestro ejecutor y con get lo abre
		
		
	}

}
