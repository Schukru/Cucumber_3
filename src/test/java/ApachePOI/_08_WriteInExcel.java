package ApachePOI;

import org.apache.poi.ss.usermodel.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class _08_WriteInExcel {

    public static void main(String[] args) throws IOException {

        String path = "src/test/java/ApachePOI/resource/WriteInTheExcelFile.xlsx";
        FileInputStream inputStream = new FileInputStream(path);
        Workbook workbook = WorkbookFactory.create(inputStream);
        Sheet sheet = workbook.getSheet("Sheet1");

        Row yeniSatir = sheet.createRow(0);
        Cell yeniHucre = yeniSatir.createCell(0);
        yeniHucre.setCellValue("Merhaba Dünya");

        for (int i = 1; i < 10; i++) {
            yeniSatir.createCell(i).setCellValue(i);
        }

        inputStream.close();

        FileOutputStream outputStream = new FileOutputStream(path);
        workbook.write(outputStream);
        workbook.close();                // hafıza boşaltıldı
        outputStream.close();

        System.out.println("işlem tamamlandı");

    }
}

