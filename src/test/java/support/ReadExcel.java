package support;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Iterator;

import com.sun.org.apache.xml.internal.serialize.OutputFormat;
import net.bytebuddy.implementation.bind.MethodDelegationBinder;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

        public static void main(String [] args) throws IOException {
            File excelFile =  new File( "/home/lucasmoreira/Workspace/teste-Yaman/src/test/java/support/massa.xlsx");
            FileInputStream fis = new FileInputStream (excelFile);
            XSSFWorkbook workbook = new XSSFWorkbook (fis);
            XSSFSheet sheet = workbook.getSheetAt(0);
            Iterator<Row> rowIt = sheet.iterator();
            while(rowIt.hasNext()) {
                Row row = rowIt.next();
                Iterator<Cell> cellIterator = row.cellIterator();
                while (cellIterator.hasNext()) {
                    Cell cell = cellIterator.next();
                    System.out.print(cell.toString() + "; ");
                }
                System.out.println();
            }
            workbook.close();
            fis.close();
        }
}
