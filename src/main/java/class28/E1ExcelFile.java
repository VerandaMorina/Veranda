package class28;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import utils.Constants;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class E1ExcelFile {
    public static void main(String[] args) throws IOException {

        String path=System.getProperty("user.dir")+"\\Files\\TextExcelFile.xlsx";
        FileInputStream fileInputStream=new FileInputStream(path);

        //to create new files
        //1.we create object
        //2.we create the sheet
        //3.next we create row and column
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook();
        Sheet sheet =xssfWorkbook.getSheet("sheet1");
        Row row=sheet.createRow(0);
        Cell cell= row.createCell(0);
        Cell cell1= row.createCell(1);
        cell1.setCellValue("Morina");
        cell.setCellValue("Veranda");
        //used when we want to create new file
        FileOutputStream fileOutputStream=new
                FileOutputStream(path);
        xssfWorkbook.write(fileOutputStream);

    }

}
