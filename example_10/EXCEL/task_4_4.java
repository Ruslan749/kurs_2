/*
Эта программа является примером чтения данных из файла Excel в формате XLSX с использованием библиотеки Apache POI.
В начале программы мы импортируем необходимые классы из библиотеки Apache POI, которые позволяют работать с Excel-файлами.
Затем мы определяем основной метод программы main, который выбрасывает исключение IOException, связанное с чтением файла.
 Далее мы открываем файл Excel для чтения, используя объект FileInputStream. Затем мы создаем экземпляр книги Excel из файла, используя класс XSSFWorkbook.
 Далее мы получаем лист из книги по его имени, используя метод getSheet: После этого мы перебираем все строки и ячейки на листе, используя цикл for.
 Внутри цикла мы выводим на экран значение каждой ячейки с помощью метода toString(), который преобразует значение ячейки в строку.
 В конце программы мы закрываем файл и освобождаем ресурсы, используя методы close():
Таким образом, эта программа читает содержимое Excel-файла в формате XLSX и выводит его на экран.
 */
package EXCEL;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.NoSuchFileException;
public class task_4_4 {
    public static void main(String[] args) {
        try{
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
        }catch (FileNotFoundException e){
            System.out.println("Такого файла не существует");
        }catch (NullPointerException e){
            System.out.println("Такого листа не существует");
        } catch (NoSuchFileException e){
            System.out.println("не правильный формат файла");
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
