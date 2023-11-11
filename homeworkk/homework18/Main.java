package homework18;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.*;
import java.util.ArrayList;

public class Main {
    //    Написать программу для парсинга xml документа. Необходимо распарсить xml документ и
//    содержимое тегов line записать в другой документ. Название файла для записи должно
//    состоять из значений тегов и имеет вид: <firstName>_<lastName>_<title>.txt
    public static void main(String[] args) throws ParserConfigurationException, FileNotFoundException {
        String lastName = "";
        String firstName = "";
        String title = "";
        ArrayList<String> text = new ArrayList<>();
        try {
            DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document document = documentBuilder.parse("homeworkk/homework18/Shakespearean.xml");
            Node root = document.getDocumentElement();
            NodeList inf1 = root.getChildNodes();
            for (int i = 0; i < inf1.getLength(); i++) {
                Node inf = inf1.item(i);
                if (inf.getNodeType() != Node.TEXT_NODE) {
                    NodeList inf0 = inf.getChildNodes();
                    if (inf.getNodeName().equals("title"))
                        title = inf.getChildNodes().item(0).getTextContent();
                    else if (inf.getNodeName().equals("author"))
                        for (int j = 0; j < inf.getChildNodes().getLength(); j++) {
                            Node inf2 = inf0.item(j);
                            if (inf0.item(j).getNodeName().equals("lastName"))
                                lastName = inf2.getChildNodes().item(0).getTextContent();
                            else if (inf0.item(j).getNodeName().equals("firstName"))
                                firstName = inf2.getChildNodes().item(0).getTextContent();
                            if (!(lastName.equals("")) && !(firstName.equals("")))
                                break;
                        }
                    else if (inf.getNodeName().equals("lines"))
                        for (int j = 0; j < inf.getChildNodes().getLength(); j++) {
                            text.add(inf.getChildNodes().item(j).getTextContent());
                        }
                }
            }
        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        } catch (SAXException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        String nameFile = firstName + "_" + lastName + "_" + title + ".txt";

        try (FileWriter fileWriter = new FileWriter(nameFile)) {
            for (int i = 0; i < text.size(); i++) {
                fileWriter.write(text.get(i));
                fileWriter.flush();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
