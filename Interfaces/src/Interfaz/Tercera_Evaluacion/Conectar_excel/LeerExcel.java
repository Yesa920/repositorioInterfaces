import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class LeerExcel {

	public static void main(String[] args) {
		// Ruta del archivo Excel
		String archivoExcel = "estilos_izan.xlsx"; // Asegúrate de que este archivo exista en el directorio

		// Crear un FileInputStream para leer el archivo
		try (FileInputStream fileInputStream = new FileInputStream(archivoExcel)) {
			// Crear un workbook a partir del archivo Excel
			Workbook workbook = WorkbookFactory.create(fileInputStream);

			// Obtener la primera hoja del libro
			Sheet sheet = workbook.getSheetAt(0);

			// Recorrer todas las filas de la hoja
			for (Row row : sheet) {
				// Recorrer todas las celdas de la fila
				for (Cell cell : row) {
					switch (cell.getCellType()) {
					case STRING:
						System.out.print(cell.getStringCellValue() + "\t"); // Imprimir cadenas
						break;
					case NUMERIC:
						System.out.print(cell.getNumericCellValue() + "\t"); // Imprimir números
						break;
					case BOOLEAN:
						System.out.print(cell.getBooleanCellValue() + "\t"); // Imprimir booleanos
						break;
					default:
						System.out.print("NULL\t");
					}
				}
				System.out.println(); // Nueva línea después de cada fila
			}

			// Cerrar el workbook
			workbook.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
