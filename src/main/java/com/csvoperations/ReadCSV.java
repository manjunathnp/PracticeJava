package com.csvoperations;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadCSV {
    public static void main(String[] args) throws IOException {
        String csvFilePath = "src/main/java/com/csvoperations/data/Credentials.xlsx";

        // Open the Excel file
        FileInputStream fis = new FileInputStream(csvFilePath);
        XSSFWorkbook workbook = new XSSFWorkbook(fis);

        // Get the first sheet of the Excel file
        XSSFSheet sheet = workbook.getSheet("sheet1");

        int totalRows = sheet.getLastRowNum();
        int totalCells=sheet.getRow(1).getLastCellNum();

        System.out.println("Total Rows: "+totalRows);
        System.out.println("Total Cells: "+totalCells);

        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
            XSSFRow row = sheet.getRow(i);
            // Assuming the first cell contains username and the second cell contains password
            String username = row.getCell(0).getStringCellValue();
            String password = row.getCell(1).getStringCellValue();


            // Your login script using Selenium WebDriver
            System.out.println("Logging in with username: " + username + " and password: " + password);

        }
        // Close resources
        workbook.close();
        fis.close();
    }
}
