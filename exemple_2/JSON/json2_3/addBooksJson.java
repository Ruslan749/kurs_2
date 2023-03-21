package JSON.json2_3;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class addBooksJson {
    static Scanner in = new Scanner(System.in);
    public static void main (String[] args) {
        try {
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader("JSON/json2_3/exemple.json"));
            JSONObject jsonObject = (JSONObject) obj;

            System.out.println("Введите название книги");
            String book = in.nextLine();
            System.out.println("Введите автора");
            String author = in.nextLine();
            System.out.println("Введите год");
            String year = in.nextLine();

            JSONArray jsonArray = (JSONArray) jsonObject.get("books");
            JSONObject newBook = new JSONObject();
            newBook.put("title", book);
            newBook.put("author", author);
            newBook.put("year", year);
            jsonArray.add(newBook);

            FileWriter file = new FileWriter("JSON/json2_3/exemple.json");
            file.write(jsonObject.toJSONString());
            file.flush();
            file.close();
            System.out.println("Json успешно записан");
        } catch (IOException | ParseException e) {
            throw new RuntimeException(e);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}