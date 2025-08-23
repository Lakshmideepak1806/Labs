package com.orangehrm.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtiles {
    
    public static Object[][] getdata(String excelPath, String sheetName) throws IOException {
        FileInputStream fs = new FileInputStream(new File(excelPath));
        XSSFWorkbook workbook = new XSSFWorkbook(fs);
        XSSFSheet sheet = workbook.getSheet(sheetName);

        int rowCount = sheet.getPhysicalNumberOfRows();
        int colCount = sheet.getRow(0).getPhysicalNumberOfCells();

        System.out.println("Rows: " + rowCount);
        System.out.println("Cols: " + colCount);

        Object[][] data = new Object[rowCount][colCount];

        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                data[i][j] = sheet.getRow(i).getCell(j).getStringCellValue();
            }
        }

        workbook.close();
        fs.close();

        return data;
    }
}
