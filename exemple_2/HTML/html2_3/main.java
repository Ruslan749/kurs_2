package HTML.html2_3;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.jsoup.HttpStatusException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.List;

import static org.json.simple.JSONObject.escape;

public class main {
    public static void main(String[] args) {
        try{
            // Получаем HTML код страницы
            conect();

            // Извлекаем список новостей
            Elements newsParent = doc.select("body > table > tbody > tr > td > div > table >" +
                    "tbody > tr:nth-child(5) > td:nth-child(3) > table > tbody > tr > td:nth-child(1)");

            //Выводим последние 10 новостей в консоль
            for (int i = 3; i < 20; i++){
                if (!(i % 2 == 0)){
                    List <Node> nodes = newsParent.get(0).childNodes();
                    System.out.println("Тема: " + ((Element) nodes.get(i))
                            .getElementsByClass("blocktitle")
                            .get(0).childNodes().get(0));

                    System.out.println("Дата: " + ((Element) nodes.get(i))
                            .getElementsByClass("blockdate")
                            .get(0).childNodes().get(0) + "\n");
                    setJson(nodes, i);
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
    static Document doc;
    static byte tryConect = 0;
    private static Document conect() {
            try {
                if(tryConect < 5) {
                    tryConect++;
                    doc = Jsoup.connect("http://fat.urfu.ru/index.htm").get();
                    return doc;
                }
            } catch (UnknownHostException e) {
                conect();
                System.out.println("Отсутствует интернет соединение \n" +
                        "Попытка подключения: " + tryConect);
            } catch (HttpStatusException e){
                conect();
                System.out.println("Отрицательный ответ от сервера \n" +
                        "Попытка подключения: " + tryConect);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        return null;
    }

    private static void setJson(List<Node> nodes, int i) throws IOException, ParseException {
        JSONParser parser = new JSONParser();
        Object obj = parser.parse(new FileReader("HTML/html2_3/exemple.json"));
        JSONObject jsonObject = (JSONObject) obj;

        JSONObject library = new JSONObject();

        JSONArray news = (JSONArray) jsonObject.get("news");
        JSONObject newsSet = new JSONObject();
        newsSet.put("title", escape(((Element) nodes.get(i)).getElementsByClass("blocktitle").get(0).childNodes().get(0).toString()));
        newsSet.put("data", escape(((Element) nodes.get(i)).getElementsByClass("blockdate").get(0).childNodes().get(0).toString()));
        news.add(newsSet);

        library.put("news", news);

        FileWriter file = new FileWriter("HTML/html2_3/exemple.json");
        file.write(library.toJSONString());
        file.flush();
        file.close();
        System.out.println("Json успешно записан");
    }
}


