package com.engage.autoqa.core.utils;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcellGetdata {
	
	public static List<Map<String, String>> getData(String dataKey, String sheetName, String filePath) {

		List<Map<String, String>> listOfMaps = new ArrayList<>();
		try {
			FileInputStream excelFile = new FileInputStream(filePath);
			XSSFWorkbook excelWorkbook = new XSSFWorkbook(excelFile);
			XSSFSheet excelSheet = excelWorkbook.getSheet(sheetName);

			int rowCount = excelSheet.getLastRowNum();
			for (int row = 0; row <= rowCount; row++) { 
				// Start from row 0 since the first column is where dataKey is
				// located
				XSSFRow rowObj = excelSheet.getRow(row);
				if (rowObj != null) {
					Map<String, String> innerMap = new HashMap<>();
					XSSFCell cellObj = rowObj.getCell(0); // Accessing the first column
					if (cellObj != null) {
						String key = getCellValueAsString(cellObj).trim(); // Assuming dataKey is string type
						if (dataKey.equalsIgnoreCase(key)) {
							// If dataKey matches, retrieve all values in the row
							int columnCount = rowObj.getLastCellNum();
							for (int column = 1; column < columnCount; column++) { // Start from column 1 to skip the
								// dataKey column
								String header = excelSheet.getRow(0).getCell(column).getStringCellValue().trim();
								XSSFCell valueCell = rowObj.getCell(column);
								String cellData = getCellValueAsString(valueCell);
								innerMap.put(header, cellData);
							}
							listOfMaps.add(innerMap);
						}
					}
				}
			}
			excelWorkbook.close();
			excelFile.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listOfMaps;
	}

	public static String getCellValueAsString(Cell cell) {
		if (cell == null) {
			return null;
		}
		switch (cell.getCellType()) {
		case STRING:
			return cell.getStringCellValue();
		case NUMERIC:
			double numericValue = cell.getNumericCellValue();
			long longValue = (long) numericValue;
			if (numericValue == longValue) {
				return String.valueOf(longValue); 
			}
		default:
			return "NA";
		}
	}

}
