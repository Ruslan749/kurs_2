package JSON.json2_3;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.util.Scanner;

public class filterJson {
    public static void filter (){
        try {
            Scanner in = new Scanner(System.in);
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader("JSON/json2_3/exemple.json"));
            JSONObject jsonObject = (JSONObject) obj;
            JSONArray jsonArray = (JSONArray) jsonObject.get("books");

            System.out.println("введите данные для поиска");
            String find = in.nextLine();

            for (Object o : jsonArray){
                JSONObject book = (JSONObject) o;
                if(book.get("year").toString().equals(find) || book.get("title").toString().equals(find)|| book.get("author").toString().equals(find)) {
                    System.out.println("\nCourent Element: book");
                    System.out.println("Book name: " + book.get("title"));
                    System.out.println("Author: " + book.get("author"));
                    System.out.println("Year: " + book.get("year"));
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
