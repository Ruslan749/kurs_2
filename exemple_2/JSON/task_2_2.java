/*
Здесь мы используем библиотеку JSON.simple для работы с файлом JSON. Мы создаем экземпляр класса JSONParser, который используется для чтения файла JSON.
Затем мы преобразуем объект в JSONObject и получаем ключ корневого элемента. Мы получаем массив книг, проходим по каждой книге и получаем значения полей.
 */
package JSON;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
public class task_2_2 {
    public static void main(String[] args) {
        try {
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader("JSON/exemple.json"));
            JSONObject jsonObject = (JSONObject) obj;
            System.out.println("Корневой элимент: " +jsonObject.keySet().iterator().next());
            JSONArray jsonArray = (JSONArray) jsonObject.get("books");

            for (Object o : jsonArray){
                JSONObject book = (JSONObject) o;
                System.out.println("\nТекущий элимент: book");
                System.out.println("Название книги: " + book.get("title"));
                System.out.println("Автор: " +book.get("author"));
                System.out.println("Год издания: " + book.get("year"));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
