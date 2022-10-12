package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _06_GetExcelColumn {

    public static void main(String[] args) {

        ArrayList<String> liste = sutunlar();
        Scanner oku=new Scanner(System.in);

        for (int i = 0; i < liste.size(); i++) {
            System.out.println((i + 1) + "\t" + liste.get(i));
        }

        System.out.print("Lütfen seçiminizi giriniz (1-" + (liste.size()) + ") : ");
        int secim =oku.nextInt();

        String donen= araBul(liste.get(secim-1));

        System.out.println("donen = " + donen);

    }
     public static ArrayList<String> sutunlar(){

        ArrayList<String> listeAl = new ArrayList<String>();
        String path="src/test/java/ApachePOI/resource/LoginData.xlsx";

        Workbook workbook;

        try {
            FileInputStream connection=new FileInputStream(path);
            workbook= WorkbookFactory.create(connection);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Sheet sheet = workbook.getSheet("Login");

        for (int i = 0; i < sheet.getPhysicalNumberOfRows() ; i++) {
            Row row= sheet.getRow(i);
            Cell cell=row.getCell(0);
            listeAl.add(cell.toString());
        }
        return listeAl;
    }

    public static String araBul(String arananKelime){

        String donecek="";
        String path="src/test/java/ApachePOI/resource/LoginData.xlsx";

        Workbook workbook;

        try {
            FileInputStream connection=new FileInputStream(path);
            workbook= WorkbookFactory.create(connection);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Sheet sheet = workbook.getSheet("Login");

        for (int i = 0; i < sheet.getPhysicalNumberOfRows() ; i++) {
            Row row= sheet.getRow(i);
            Cell cell=row.getCell(0);

            if (cell.toString().equalsIgnoreCase(arananKelime))
                for (int j = 0; j < row.getPhysicalNumberOfCells(); j++)
                    donecek += row.getCell(j)+" ";

        }

        return donecek;

    }


}

