/*
Сначала мы создаем экземпляр DocumentBuilderFactory и DocumentBuilder, чтобы получить объект Document,
который является корневым элементом нашего XML-документа. Затем мы создаем элементы и добавляем их в документ,
вызывая методы createElement и appendChild на соответствующих элементах. После того, как мы создали и заполнили
XML-документ, мы используем Transformer для записи DOM-структуры в файл.
Как только мы завершаем запись, мы получаем XML-файл с содержимым, которое мы определили в нашей программе.
 */
package XML;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;

import java.io.File;
public class task_1 {
    public static void main(String[] args) {
        try{
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

            // Создание корневого элимента
            Document doc = docBuilder.newDocument();
            Element rootElement = doc.createElement("library");
            doc.appendChild(rootElement);

            // Добавление первой книги
            Element book1 = doc.createElement("book");
            rootElement.appendChild(book1);

            Element title1 = doc.createElement("title");
            title1.appendChild(doc.createTextNode("Война и мир"));
            book1.appendChild(title1);

            Element author1 = doc.createElement("author");
            author1.appendChild(doc.createTextNode("Лев толсой"));
            book1.appendChild(author1);

            Element year1 = doc.createElement("year");
            year1.appendChild(doc.createTextNode("1869"));
            book1.appendChild(year1);

            // добавление второй книги
            Element book2 = doc.createElement("book");
            rootElement.appendChild(book2);

            Element title2 = doc.createElement("title");
            title2.appendChild(doc.createTextNode("Мастер и маргарита"));
            book2.appendChild(title2);

            Element author2 = doc.createElement("author");
            author2.appendChild(doc.createTextNode("Михаил Булгаков"));
            book2.appendChild(author2);

            Element year2 = doc.createElement("year");
            year2.appendChild(doc.createTextNode("1967"));
            book2.appendChild(year2);

            // Запись XML файла
            doc.setXmlStandalone(true);
            doc.normalizeDocument();
            javax.xml.transform.TransformerFactory tf = javax.xml.transform.TransformerFactory.newInstance();
            javax.xml.transform.Transformer transformer = tf.newTransformer();
            transformer.setOutputProperty(OutputKeys.ENCODING,"UTF-8");
            transformer.setOutputProperty(OutputKeys.STANDALONE,"yes");
            transformer.setOutputProperty(OutputKeys.INDENT,"yes");
            javax.xml.transform.dom.DOMSource source = new javax.xml.transform.dom.DOMSource(doc);
            javax.xml.transform.stream.StreamResult result =
                    new javax.xml.transform.stream.StreamResult(new File("XML/exemple.xml"));
            transformer.transform(source,result);
            System.out.println("XML-файл успешно создан");
        }catch (Exception pce){
            pce.printStackTrace();
        };
    }
}
