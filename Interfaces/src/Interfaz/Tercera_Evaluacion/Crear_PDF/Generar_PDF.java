package com.example.crearPDF;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.properties.UnitValue;

public class Generar_PDF {
	public static void main(String[] args) {
		String destino = "documento_prueba.pdf";

		try {
			PdfWriter escritor = new PdfWriter(destino);
			PdfDocument pdf = new PdfDocument(escritor);
			Document documento = new Document(pdf);

			documento.add(new Paragraph("Comprueba y funciona"));
			// tabla
			// Crear tabla con 3 columnas
			Table table = new Table(UnitValue.createPercentArray(3)).useAllAvailableWidth();

			// Encabezados
			table.addHeaderCell("Nombre");
			table.addHeaderCell("Edad");
			table.addHeaderCell("Ciudad");

			// Filas
			table.addCell("Ana");
			table.addCell("28");
			table.addCell("Madrid");

			table.addCell("Luis");
			table.addCell("35");
			table.addCell("Bogotá");

			table.addCell("Sofía");
			table.addCell("22");
			table.addCell("Buenos Aires");

			documento.add(table);

			documento.close();

			System.out.println("PDF creado en: " + destino);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
