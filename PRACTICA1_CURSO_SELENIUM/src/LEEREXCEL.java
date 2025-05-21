import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LEEREXCEL {

	public static void main(String[] args) {
		//RUTA
		String EXCEL = "C:\\Users\\juanl\\OneDrive\\Escritorio\\PRUEBAEXCEL.xlsx"; 
		
		//Es obligatorio try para obtener errores
		try {													
		FileInputStream FIS = new FileInputStream(EXCEL);				//Creo variable de lecura del archivo
		Workbook workbook = WorkbookFactory.create(FIS);				//Le digo que me lea completo el archivo
		Sheet sheet = workbook.getSheetAt(0);							//Le digo que me lea la hoja
		
		int columna = 3;												//Declaro la columna
		
		for(Row row : sheet) {											//Agrego un bucle for para que me este leyendo toda las celdas de la columna 3
			Cell cell = row.getCell(columna);
			if(cell == null || cell.getCellType() == CellType.BLANK) {	//Aqui le agrego la condicion que pare cuando este vacio el campo pero que me escriba en consola todoas los resultados
				break;
			}
			try {														//Aqui le agrego tiempo por cada una de las busquedas y que me lo escriba en un segundo cada resultado encontrado
			System.out.println(cell.toString());
			Thread.sleep(1000);
			}
			catch (InterruptedException e){
				e.printStackTrace();
			}
		}
		System.out.println("Termino Columna");							//Le mando mensaje a la consola de que termino la busqueda
		}
		catch(Exception e) {
		e.printStackTrace();
		}
	
	}
}
