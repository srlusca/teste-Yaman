package support;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.sun.org.apache.xml.internal.serialize.OutputFormat;
import net.bytebuddy.implementation.bind.MethodDelegationBinder;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

    public File excelFile =  new File("E:\\Workspace\\Visao\\teste-Yaman\\src\\test\\java\\support\\massa.xlsx");
    public FileInputStream fis = new FileInputStream (excelFile);
    public XSSFWorkbook workbook = new XSSFWorkbook (fis);
    public XSSFSheet sheet = workbook.getSheetAt(0);
    public Iterator<Row> rowIt = sheet.iterator();

    public ReadExcel() throws IOException {
    }

    public List getData() throws IOException {
        List<String> informacao = new ArrayList();
            while(rowIt.hasNext()) {
                Row row = rowIt.next();
                Iterator<Cell> cellIterator = row.cellIterator();
                while (cellIterator.hasNext()) {
                    Cell cell = cellIterator.next();
                    informacao.add(cell.toString());
                }
            }
            workbook.close();
            fis.close();
            return informacao;
    }
}

