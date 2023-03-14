package EXCEL;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;

public class task_4_4 {
    public static void main(String[] args) throws IOException {

        // открываем файл Excel для чтения
        String filePath = "EXCEL/exemple.xlsx";
        FileInputStream inputStream = new FileInputStream(filePath);

        // Создаем экземпляр книги из файла
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);

        // Получаем лист из книги по  его имени
        XSSFSheet sheet = workbook.getSheet("товары");

        // Перебираем строки и ячейки листа
        for (Row row : sheet){
            for (Cell cel : row){
                //Выводим значение ячейки на экран
                System.out.println(cel.toString() + "\t");
            }
            System.out.println();
        }

        // Закрываем файл и освобождаем ресурсы
        workbook.close();
        inputStream.close();
    }
}
