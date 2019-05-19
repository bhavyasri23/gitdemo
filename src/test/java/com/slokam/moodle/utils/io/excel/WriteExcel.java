package com.slokam.moodle.utils.io.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {
	File inputfile = null;
	File outputfile = null;
	FileOutputStream fos = null;
	FileInputStream fis = null;
	Workbook workbook = null;
	Sheet sheet = null;

	public WriteExcel() {
		init();
	}

	public void init() {

		inputfile = new File("./src/test/resources/moodle_login.xlsx");
		outputfile = new File("./src/test/resources/output_" + System.currentTimeMillis() + ".xlsx");
		try {
			fis = new FileInputStream(inputfile);
			workbook = new XSSFWorkbook(fis);
			sheet = workbook.getSheet("Sheet1");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void insertValue(int rowNumber, int coulumnNumber, CellType type, String value) {

		Row row = sheet.getRow(rowNumber);

		if (row == null) {
			row = sheet.createRow(rowNumber);
		}
		Cell cell = row.getCell(coulumnNumber);
		if (cell == null) {
			cell = row.createCell(coulumnNumber);
		}
		cell.setCellType(type);

		/* Cell cell = row.createCell(coulumnNumber, CellType.STRING); */
		switch (type) {
		case STRING:
			cell.setCellValue(value);
			CellStyle style = workbook.createCellStyle();
			if (value.equals("PASS")) {
				style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
				style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
			} else if (value.equals("FAIL")) {
				style.setFillForegroundColor(IndexedColors.RED.getIndex());
				style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
			}
			cell.setCellStyle(style);
			break;
		case NUMERIC:
			int modified = Integer.parseInt(value);
			cell.setCellValue(modified);
			break;
		case BOOLEAN:
			boolean bool = Boolean.parseBoolean(value);
			cell.setCellValue(bool);
			break;
		default:
			break;
		}

	}

	public void writeFinal() {

		try {
			fos = new FileOutputStream(outputfile);
			workbook.write(fos);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		WriteExcel wr = new WriteExcel();
		wr.init();
		wr.insertValue(1, 4, CellType.STRING, "RESULT");
		wr.insertValue(2, 4, CellType.STRING, "PASS");
		wr.writeFinal();
	}

}
