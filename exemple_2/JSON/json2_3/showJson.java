package JSON.json2_3;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;

public class showJson {
public static void show(){
    try {
        JSONParser parser = new JSONParser();
        Object obj = parser.parse(new FileReader("JSON/json2_3/exemple.json"));
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
