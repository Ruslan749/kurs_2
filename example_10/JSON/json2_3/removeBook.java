package JSON.json2_3;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Iterator;
import java.util.Scanner;

public class removeBook {
    public static void remuve (){
        try {
            Scanner in = new Scanner(System.in);
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader("JSON/json2_3/exemple.json"));
            JSONObject jsonObject = (JSONObject) obj;
            JSONArray jsonArray = (JSONArray) jsonObject.get("books");

            String title = "hobbit";
            Iterator iterator = jsonArray.iterator();
            while (iterator.hasNext()) {
                JSONObject book = (JSONObject) iterator.next();
                if (title.equals(book.get("title").toString())) {
                    iterator.remove();
                }}
            FileWriter file = new FileWriter("JSON/json2_3/exemple.json");
            file.write(jsonObject.toJSONString());
            file.flush();
            file.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
