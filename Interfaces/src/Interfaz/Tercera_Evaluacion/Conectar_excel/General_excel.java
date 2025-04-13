import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GenerarExcel {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		// Crear el libro de trabajo (workbook)
		XSSFWorkbook workbook = new XSSFWorkbook(); // Para formato .xlsx
		// Si quisieras formato .xls (antiguo), usarías HSSFWorkbook

		// Crear una hoja (sheet)
		XSSFSheet sheet = workbook.createSheet("Sheet1");

		// Crear una fila en la hoja
		XSSFRow row0 = sheet.createRow(0); // Fila 0

    // Crear celdas en la fila
		XSSFCell cell1 = row0.createCell(0);
		XSSFCell cell2 = row0.createCell(1);
		XSSFCell cell3 = row0.createCell(2);
		XSSFCell cell4 = row0.createCell(3);
		XSSFCell cell5 = row0.createCell(4);
		XSSFCell cell6 = row0.createCell(5);

    // Crear estilos
    estiloCelda.setFillForegroundColor(IndexedColors.AQUA.getIndex()); 
    estiloCelda.setFillPattern(FillPatternType.SOLID_FOREGROUND);

    //Establecemos valores a las celdas
    cell1.setCellValue("Horas");
		cell1.setCellStyle(estiloCelda);
		cell2.setCellValue("Lunes");
		cell2.setCellStyle(estiloCelda);
		cell3.setCellValue("Martes");
		cell3.setCellStyle(estiloCelda);
		cell4.setCellValue("Miercoles");
		cell4.setCellStyle(estiloCelda);
		cell5.setCellValue("Jueves");
		cell5.setCellStyle(estiloCelda);
		cell6.setCellValue("Viernes");
		cell6.setCellStyle(estiloCelda);


    // Poner tamagno a las celdas
		sheet.autoSizeColumn(0);

try (FileOutputStream fileOut = new FileOutputStream("estilos_izan.xlsx")) {
			workbook.write(fileOut);
		}

		// Guardar el archivo Excel en el disco
		try (FileOutputStream fileOut = new FileOutputStream("archivo_generado2.xlsx")) {
			workbook.write(fileOut);
			workbook.close();
			System.out.println("Archivo Excel generado exitosamente.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
