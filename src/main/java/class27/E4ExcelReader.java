package class27;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import utils.Constants;

import java.io.FileInputStream;
import java.io.IOException;

public class E4ExcelReader {
    public static void main(String[] args) throws IOException {

        FileInputStream fileInputStream=new FileInputStream(Constants.EXCEL_FILE_PATH);
        // that special call which knows how to read the data from excel files
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        Sheet sheet=xssfWorkbook.getSheet("Sheet1");
        //this loop gives us the rows
        int rowSize=sheet.getPhysicalNumberOfRows();
        for (int rows = 0; rows <rowSize; rows++) {
            Row row= sheet.getRow(rows);
            //this loop will give us the column
            int colSize=row.getPhysicalNumberOfCells();
            for (int col = 0; col < colSize; col++) {
                System.out.print(row.getCell(col)+" ");
            }
            System.out.println();
        }




    }
}
