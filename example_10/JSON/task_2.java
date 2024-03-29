/*
В этом примере мы создаем JSONObject, который представляет нашу библиотеку, и JSONArray, который содержит объекты JSONObject,
представляющие каждую книгу. Мы добавляем две книги в наш массив, а затем добавляем этот массив в объект JSONObject, который представляет всю библиотеку.
После этого мы записываем наш JSON-объект в файл "example-json.json" с помощью FileWriter.
Если все идет успешно, мы получаем сообщение об успешном создании Json файла в консоли.
 */
package JSON;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;

public class task_2 {
    public static void main(String[] args) {
        JSONObject library = new JSONObject();
        JSONArray books = new JSONArray();

        JSONObject book1 = new JSONObject();
        book1.put("title", "Война и мир");
        book1.put("author", "Лев Толстой");
        book1.put("year", "1869");

        JSONObject book2 = new JSONObject();
        book2.put("title", "Мастер и Маргарита");
        book2.put("author", "Михаил Булшаков");
        book2.put("year", "1967");

        books.add(book1);
        books.add(book2);

        library.put("books", books);

        try (FileWriter file = new FileWriter("JSON/exemple.json")){
            file.write(library.toJSONString());
            System.out.println("Json успешно записан");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
