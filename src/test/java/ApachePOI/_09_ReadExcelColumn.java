package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

public class _09_ReadExcelColumn {

    public static void main(String[] args) throws IOException {

        ArrayList<ArrayList<String>> sutunlarlistesi =
                ExcelSutunlariniGetir("src/test/java/ApachePOI/resource/LoginData.xlsx", "Login", 2);

        for (int i = 0; i < sutunlarlistesi.size(); i++) {

            System.out.print("Satir " + i + "): " );
            for (int j = 0; j < sutunlarlistesi.get(i).size(); j++) {
                System.out.print(sutunlarlistesi.get(i).get(j) + "\t");
            }
            System.out.println();
        }
    }

    public static ArrayList<ArrayList<String>> ExcelSutunlariniGetir(String path, String sayfaAdi, int sutunSayisi) throws IOException {

        ArrayList<ArrayList<String>> sutunlarlistesi2 = new ArrayList<>();

        FileInputStream inputStream = new FileInputStream(path);
        Workbook workbook = WorkbookFactory.create(inputStream);
        Sheet sheet = workbook.getSheet(sayfaAdi);

        for (int i = 0; i < sheet.getPhysicalNumberOfRows() ; i++) {

            ArrayList<String> satirBilgileri = new ArrayList<>();

            for (int j = 0; j < sutunSayisi; j++) {
                satirBilgileri.add(sheet.getRow(i).getCell(j).toString());
            }
            sutunlarlistesi2.add(satirBilgileri);
        }

        return sutunlarlistesi2;
    }
}
