package ApachePOI;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;

public class _10_CarpimTablosu {

    public static void main(String[] args) {

        String path = "src/test/java/ApachePOI/resource/CarpimTablosu.xlsx";

        FileInputStream inputStream = null;
        Workbook workbook = null;
        try {
            inputStream = new FileInputStream(path);
            workbook = WorkbookFactory.create(inputStream);

        } catch (IOException e) {
            workbook = ExcelDosyaOlustur(path, "Sheet1");
        }


        CarpimTablosunuYaz(workbook);

// excel mevcutsa hafızaya yazma işlemini bitir
        try {
            inputStream.close();

// dosyayı yaz ve kapat
            FileOutputStream outputStream = new FileOutputStream(path);
            workbook.write(outputStream);
            workbook.close();  // hafıza boşaltıldı
            outputStream.close();
            System.out.println("işlem tamamlandı");

        } catch (IOException e) {
        }

    }

    public static Workbook ExcelDosyaOlustur(String path, String sheet1) {

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet(sheet1);
        Row row = sheet.createRow(0);
        Cell cell = row.createCell(0);
        cell.setCellValue("");

        FileOutputStream outputStream = null;

        try {
            outputStream = new FileOutputStream(path);
            workbook.write(outputStream);
            workbook.close();  // hafıza boşaltıldı
            outputStream.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

// oluşturulan dosya yeniden açılıyor
        FileInputStream inputStream = null;
        Workbook workbookAc = null;
        try {
            inputStream = new FileInputStream(path);
            workbookAc = WorkbookFactory.create(inputStream);
            return workbookAc;

        } catch (IOException e) {
            return null;
        }
    }

    public static void CarpimTablosunuYaz(Workbook workbook) {

        Sheet sheet = workbook.getSheet("Sheet1");

        for (int j = 1; j <= 9; j++) {
            Row row = sheet.createRow(j);

            for (int i = 1; i <= 9; i++) {

                Cell cell1 = row.createCell(6 * i - 5);
                cell1.setCellValue(j);

                Cell cell2 = row.createCell(6 * i - 4);
                cell2.setCellValue("x");

                Cell cell3 = row.createCell(6 * i - 3);
                cell3.setCellValue(i);

                Cell cell4 = row.createCell(6 * i - 2);
                cell4.setCellValue("=");

                Cell cell5 = row.createCell(6 * i - 1);
                cell5.setCellValue(i * j);

            }

        }


    }
}
