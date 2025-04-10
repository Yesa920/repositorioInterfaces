package com.example.generarExcel.Colores_izan;

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
		XSSFRow row1 = sheet.createRow(1); // Fila 1
		XSSFRow row2 = sheet.createRow(2); // Fila 2
		XSSFRow row3 = sheet.createRow(3); // Fila 3
		XSSFRow row4 = sheet.createRow(4); // Fila 4
		XSSFRow row5 = sheet.createRow(5); // Fila 5
		XSSFRow row6 = sheet.createRow(6); // Fila 6
		XSSFRow row7 = sheet.createRow(7); // Fila 7

		// Crear celdas en la fila
		XSSFCell cell1 = row0.createCell(0);
		XSSFCell cell2 = row0.createCell(1);
		XSSFCell cell3 = row0.createCell(2);
		XSSFCell cell4 = row0.createCell(3);
		XSSFCell cell5 = row0.createCell(4);
		XSSFCell cell6 = row0.createCell(5);
		// Celda Primera hora
		XSSFCell cell7 = row1.createCell(0);
		XSSFCell cell8 = row1.createCell(1);
		XSSFCell cell9 = row1.createCell(2);
		XSSFCell cell10 = row1.createCell(3);
		XSSFCell cell11 = row1.createCell(4);
		XSSFCell cell12 = row1.createCell(5);

		// Celda Segunda hora
		XSSFCell cell13 = row2.createCell(0);
		XSSFCell cell14 = row2.createCell(1);
		XSSFCell cell15 = row2.createCell(2);
		XSSFCell cell16 = row2.createCell(3);
		XSSFCell cell17 = row2.createCell(4);
		XSSFCell cell18 = row2.createCell(5);

		// Celda tercera hora
		XSSFCell cell19 = row3.createCell(0);
		XSSFCell cell20 = row3.createCell(1);
		XSSFCell cell21 = row3.createCell(2);
		XSSFCell cell22 = row3.createCell(3);
		XSSFCell cell23 = row3.createCell(4);
		XSSFCell cell24 = row3.createCell(5);

		// Celda cuarta hora
		XSSFCell cell25 = row4.createCell(0);
		XSSFCell cell26 = row4.createCell(1);
		XSSFCell cell27 = row4.createCell(2);
		XSSFCell cell28 = row4.createCell(3);
		XSSFCell cell29 = row4.createCell(4);
		XSSFCell cell30 = row4.createCell(5);

		// Celda quinta hora
		XSSFCell cell31 = row5.createCell(0);
		XSSFCell cell32 = row5.createCell(1);
		XSSFCell cell33 = row5.createCell(2);
		XSSFCell cell34 = row5.createCell(3);
		XSSFCell cell35 = row5.createCell(4);
		XSSFCell cell36 = row5.createCell(5);

		// Celda sexta hora
		XSSFCell cell37 = row6.createCell(0);
		XSSFCell cell38 = row6.createCell(1);
		XSSFCell cell39 = row6.createCell(2);
		XSSFCell cell40 = row6.createCell(3);
		XSSFCell cell41 = row6.createCell(4);
		XSSFCell cell42 = row6.createCell(5);

		// Celda septima hora

		XSSFCell cell43 = row7.createCell(0);
		XSSFCell cell44 = row7.createCell(1);
		XSSFCell cell45 = row7.createCell(2);
		XSSFCell cell46 = row7.createCell(3);
		XSSFCell cell47 = row7.createCell(4);
		XSSFCell cell48 = row7.createCell(5);

		// Crear los estilos(colores del fondo) como lo he puesto arriba esto ya no es
		// necesario
		/*
		 * estiloCeldaProgramacion.setFillForegroundColor(IndexedColors.AQUA.getIndex())
		 * ; estiloCeldaProgramacion.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		 * estiloCeldaSistemas.setFillForegroundColor(IndexedColors.RED.getIndex());
		 * estiloCeldaSistemas.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		 * estiloCeldaEntornos.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		 * estiloCeldaEntornos.setFillForegroundColor(IndexedColors.TAN.getIndex());
		 * estiloCeldaBaseDeDatos.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		 * estiloCeldaBaseDeDatos.setFillForegroundColor(IndexedColors.BLUE.getIndex());
		 * estiloCeldaBaseDeDatos.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		 * estiloCeldaComputacionNube.setFillForegroundColor(IndexedColors.GOLD.getIndex
		 * ());
		 * estiloCeldaComputacionNube.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		 * estiloCeldaFOL.setFillForegroundColor(IndexedColors.MAROON.getIndex());
		 * estiloCeldaFOL.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		 * estiloCeldaMarcas.setFillForegroundColor(IndexedColors.LIGHT_BLUE.getIndex())
		 * ; estiloCeldaMarcas.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		 */
		// Poner texto en negrita

		cell1.setCellValue("Texto en negrita");
		// Crear fuente en negrita

		org.apache.poi.ss.usermodel.Font font = workbook.createFont();
		font.setBold(true);

		// Crear estilo de celda y asignarle la fuente
		CellStyle textoNegritaCentradoProgramacion = workbook.createCellStyle();

		textoNegritaCentradoProgramacion.setAlignment(HorizontalAlignment.CENTER); // centrar texto
		textoNegritaCentradoProgramacion.setFont(font);
		textoNegritaCentradoProgramacion.setFillForegroundColor(IndexedColors.AQUA.getIndex());
		textoNegritaCentradoProgramacion.setFillPattern(FillPatternType.SOLID_FOREGROUND);

		CellStyle textoNegritaSistemas = workbook.createCellStyle();

		textoNegritaSistemas.setAlignment(HorizontalAlignment.CENTER); // centrar texto
		textoNegritaSistemas.setFont(font);
		textoNegritaSistemas.setFillForegroundColor(IndexedColors.RED.getIndex());
		textoNegritaSistemas.setFillPattern(FillPatternType.SOLID_FOREGROUND);

		CellStyle textoNegritaEntornos = workbook.createCellStyle();

		textoNegritaEntornos.setAlignment(HorizontalAlignment.CENTER); // centrar texto
		textoNegritaEntornos.setFont(font);
		textoNegritaEntornos.setFillForegroundColor(IndexedColors.TAN.getIndex());
		textoNegritaEntornos.setFillPattern(FillPatternType.SOLID_FOREGROUND);

		CellStyle textoNegritaBaseDeDatos = workbook.createCellStyle();

		textoNegritaBaseDeDatos.setAlignment(HorizontalAlignment.CENTER); // centrar texto
		textoNegritaBaseDeDatos.setFont(font);
		textoNegritaBaseDeDatos.setFillForegroundColor(IndexedColors.BLUE.getIndex());
		textoNegritaBaseDeDatos.setFillPattern(FillPatternType.SOLID_FOREGROUND);

		CellStyle textoNegritaComputacionNube = workbook.createCellStyle();

		textoNegritaComputacionNube.setAlignment(HorizontalAlignment.CENTER); // centrar texto
		textoNegritaComputacionNube.setFont(font);
		textoNegritaComputacionNube.setFillForegroundColor(IndexedColors.GOLD.getIndex());
		textoNegritaComputacionNube.setFillPattern(FillPatternType.SOLID_FOREGROUND);

		CellStyle textoNegritaFOL = workbook.createCellStyle();

		textoNegritaFOL.setAlignment(HorizontalAlignment.CENTER); // centrar texto
		textoNegritaFOL.setFont(font);
		textoNegritaFOL.setFillForegroundColor(IndexedColors.LIGHT_BLUE.getIndex());
		textoNegritaFOL.setFillPattern(FillPatternType.SOLID_FOREGROUND);

		CellStyle textoNegritaMarcas = workbook.createCellStyle();

		textoNegritaMarcas.setAlignment(HorizontalAlignment.CENTER); // centrar texto
		textoNegritaMarcas.setFont(font);
		textoNegritaMarcas.setFillForegroundColor(IndexedColors.MAROON.getIndex());
		textoNegritaMarcas.setFillPattern(FillPatternType.SOLID_FOREGROUND);

		CellStyle textoNegritaRecreoYHorasYSemana = workbook.createCellStyle();
		textoNegritaRecreoYHorasYSemana.setFont(font);
		textoNegritaRecreoYHorasYSemana.setAlignment(HorizontalAlignment.CENTER); // centrar texto

		// Escribir en las celdas
		cell1.setCellValue("Horas");
		cell1.setCellStyle(textoNegritaRecreoYHorasYSemana);
		cell2.setCellValue("Lunes");
		cell2.setCellStyle(textoNegritaRecreoYHorasYSemana);
		cell3.setCellValue("Martes");
		cell3.setCellStyle(textoNegritaRecreoYHorasYSemana);
		cell4.setCellValue("Miercoles");
		cell4.setCellStyle(textoNegritaRecreoYHorasYSemana);
		cell5.setCellValue("Jueves");
		cell5.setCellStyle(textoNegritaRecreoYHorasYSemana);
		cell6.setCellValue("Viernes");
		cell6.setCellStyle(textoNegritaRecreoYHorasYSemana);

		// Primera hora
		cell7.setCellValue("8:00-8:55");
		cell7.setCellStyle(textoNegritaRecreoYHorasYSemana);
		cell8.setCellValue("Programacion");
		cell8.setCellStyle(textoNegritaCentradoProgramacion);
		cell9.setCellValue("FOL");
		cell9.setCellStyle(textoNegritaFOL);
		cell10.setCellValue("Entornos");
		cell10.setCellStyle(textoNegritaEntornos);
		cell11.setCellValue("FOL");
		cell11.setCellStyle(textoNegritaFOL);
		cell12.setCellValue("SO");
		cell12.setCellStyle(textoNegritaSistemas);

		// Segunda hora
		cell13.setCellValue("8:55-9:50");
		cell13.setCellStyle(textoNegritaRecreoYHorasYSemana);
		cell14.setCellValue("Programacion");
		cell14.setCellStyle(textoNegritaCentradoProgramacion);
		cell15.setCellValue("Lenguaje de marcas");
		cell15.setCellStyle(textoNegritaMarcas);
		cell16.setCellValue("Entornos");
		cell16.setCellStyle(textoNegritaEntornos);
		cell17.setCellValue("Programacion");
		cell17.setCellStyle(textoNegritaCentradoProgramacion);
		cell18.setCellValue("SO");
		cell18.setCellStyle(textoNegritaSistemas);

		// Tercera hora

		cell19.setCellValue("9:50-10:45");
		cell19.setCellStyle(textoNegritaRecreoYHorasYSemana);
		cell20.setCellValue("SO");
		cell20.setCellStyle(textoNegritaSistemas);
		cell21.setCellValue("Programacion");
		cell21.setCellStyle(textoNegritaCentradoProgramacion);
		cell22.setCellValue("BBDD");
		cell22.setCellStyle(textoNegritaBaseDeDatos);
		cell23.setCellValue("Programacion");
		cell23.setCellStyle(textoNegritaCentradoProgramacion);
		cell24.setCellValue("Lenguaje de marcas");
		cell24.setCellStyle(textoNegritaMarcas);

		// Cuarta hora
		cell25.setCellValue("10:45-11:15");
		cell25.setCellStyle(textoNegritaRecreoYHorasYSemana);
		cell26.setCellValue("Recreo");
		cell26.setCellStyle(textoNegritaRecreoYHorasYSemana);
		cell27.setCellValue("Recreo");
		cell27.setCellStyle(textoNegritaRecreoYHorasYSemana);
		cell28.setCellValue("Recreo");
		cell28.setCellStyle(textoNegritaRecreoYHorasYSemana);
		cell29.setCellValue("Recreo");
		cell29.setCellStyle(textoNegritaRecreoYHorasYSemana);
		cell30.setCellValue("Recreo");
		cell30.setCellStyle(textoNegritaRecreoYHorasYSemana);

		// Quinta hora
		cell31.setCellValue("11:15-12:10");
		cell31.setCellStyle(textoNegritaRecreoYHorasYSemana);
		cell32.setCellValue("SO");
		cell32.setCellStyle(textoNegritaSistemas);
		cell33.setCellValue("Programacion");
		cell33.setCellStyle(textoNegritaCentradoProgramacion);
		cell34.setCellValue("BBDD");
		cell34.setCellStyle(textoNegritaBaseDeDatos);
		cell35.setCellValue("SO");
		cell35.setCellStyle(textoNegritaSistemas);
		cell36.setCellValue("Lenguaje de marcas");
		cell36.setCellStyle(textoNegritaMarcas);

		// Sexta hora
		cell37.setCellValue("12:10-13:05");
		cell37.setCellStyle(textoNegritaRecreoYHorasYSemana);
		cell38.setCellValue("Computacion en la nube");
		cell38.setCellStyle(textoNegritaComputacionNube);
		cell39.setCellValue("BBDD");
		cell39.setCellStyle(textoNegritaBaseDeDatos);
		cell40.setCellValue("BBDD");
		cell40.setCellStyle(textoNegritaBaseDeDatos);
		cell41.setCellValue("SO");
		cell41.setCellStyle(textoNegritaSistemas);
		cell42.setCellValue("Programacion");
		cell42.setCellStyle(textoNegritaCentradoProgramacion);

		// Septima hora

		cell43.setCellValue("13:05-14:00");
		cell43.setCellStyle(textoNegritaRecreoYHorasYSemana);
		cell44.setCellValue("FOL");
		cell44.setCellStyle(textoNegritaFOL);
		cell45.setCellValue("BBDD");
		cell45.setCellStyle(textoNegritaBaseDeDatos);
		cell46.setCellValue("Programacion");
		cell46.setCellStyle(textoNegritaCentradoProgramacion);
		cell47.setCellValue("Computacion en la nube");
		cell47.setCellStyle(textoNegritaComputacionNube);
		cell48.setCellValue("BBDD");
		cell48.setCellStyle(textoNegritaBaseDeDatos);

		// Poner tamagno a las celdas
		sheet.autoSizeColumn(0);
		sheet.autoSizeColumn(1);
		sheet.autoSizeColumn(2);
		sheet.autoSizeColumn(3);
		sheet.autoSizeColumn(4);
		sheet.autoSizeColumn(5);
		sheet.autoSizeColumn(6);
		sheet.autoSizeColumn(7);

		// Centrar las celdas

		// Guardar el archivo
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

/*
 * Row row1 = sheet.createRow(1); // Fila 1
 * row1.createCell(0).setCellValue("8:00-8:55");
 * row1.createCell(1).setCellValue("Programacion");
 * row1.createCell(2).setCellValue("FOL");
 * row1.createCell(3).setCellValue("Entornos");
 * row1.createCell(4).setCellValue("FOL");
 * row1.createCell(5).setCellValue("SO");
 * 
 * Row row2 = sheet.createRow(2); // Fila 2
 * row2.createCell(0).setCellValue("8:55-9:50");
 * row2.createCell(1).setCellValue("Programacion");
 * row2.createCell(2).setCellValue("Lenguaje de marcas");
 * row2.createCell(3).setCellValue("Entornos");
 * row2.createCell(4).setCellValue("Programacion");
 * row2.createCell(5).setCellValue("SO");
 * 
 * Row row3 = sheet.createRow(3); // Fila 3
 * row3.createCell(0).setCellValue("9:50-10:45");
 * row3.createCell(1).setCellValue("SO");
 * row3.createCell(2).setCellValue("Programacion");
 * row3.createCell(3).setCellValue("BBDD");
 * row3.createCell(4).setCellValue("Programacion");
 * row3.createCell(5).setCellValue("Lenguaje de marcas");
 * 
 * Row row4 = sheet.createRow(4); // Fila 4
 * row4.createCell(0).setCellValue("10:45-11:15");
 * row4.createCell(1).setCellValue("Recreo");
 * row4.createCell(2).setCellValue("Recreo");
 * row4.createCell(3).setCellValue("Recreo");
 * row4.createCell(4).setCellValue("Recreo");
 * row4.createCell(5).setCellValue("Recreo");
 * 
 * Row row5 = sheet.createRow(5); // Fila 5
 * row5.createCell(0).setCellValue("11:15-12:10");
 * row5.createCell(1).setCellValue("SO");
 * row5.createCell(2).setCellValue("Programacion");
 * row5.createCell(3).setCellValue("BBDD");
 * row5.createCell(4).setCellValue("SO");
 * row5.createCell(5).setCellValue("Lenguaje de marcas");
 * 
 * Row row6 = sheet.createRow(6); // Fila 6
 * row6.createCell(0).setCellValue("12:10-13:05");
 * row6.createCell(1).setCellValue("Computacion en la nube");
 * row6.createCell(2).setCellValue("BBDD");
 * row6.createCell(3).setCellValue("BBDD");
 * row6.createCell(4).setCellValue("SO");
 * row6.createCell(5).setCellValue("Programacion");
 * 
 * Row row7 = sheet.createRow(7); // Fila 7
 * row7.createCell(0).setCellValue("13:05-14:00");
 * row7.createCell(1).setCellValue("FOL");
 * row7.createCell(2).setCellValue("BBDD");
 * row7.createCell(3).setCellValue("Programacion");
 * row7.createCell(4).setCellValue("Computacion en la nube");
 * row7.createCell(5).setCellValue("BBDD");
 * 
 * // Ajustar el tamaño de las columnas sheet.autoSizeColumn(0); // Columna
 * "Nombre" sheet.autoSizeColumn(1); // Columna "Edad" sheet.autoSizeColumn(2);
 * sheet.autoSizeColumn(3); sheet.autoSizeColumn(4); sheet.autoSizeColumn(5);
 * sheet.autoSizeColumn(6); sheet.autoSizeColumn(7);
 */
// Cell cell = row.createCell(0);
// cell.setCellValue("Texto en negrita");
// Crear fuente en negrita
// org.apache.poi.ss.usermodel.Font font = workbook.createFont();
// font.setBold(true);

// Crear estilo de celda y asignarle la fuente
// CellStyle style = workbook.createCellStyle();
// style.setFont(font);

// Aplicar el estilo a la celda
// cell.setCellStyle(style);
