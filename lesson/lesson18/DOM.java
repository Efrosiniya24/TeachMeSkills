package lesson18;

import java.io.FileOutputStream;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class DOM {
    public static void main(String[] args) {

        try {
            DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document document = documentBuilder.parse("lesson/lesson18/file.xml");
            Node root = document.getDocumentElement();
            NodeList inf1 = root.getChildNodes();
            for(int i = 0;i<inf1.getLength(); i++){
                Node inf = inf1.item(i);
                if(inf.getNodeType() != Node.TEXT_NODE) {
                    NodeList inf0 = inf.getChildNodes();
                    if(inf0.getLength() ==1){
                        Node in = inf0.item(0);
                        System.out.println(inf.getChildNodes().item(0).getTextContent());
                    }
                    for(int j = 0; j< inf0.getLength();j++){
                        Node inf2 = inf0.item(j);
                        if(inf2.getNodeType() != Node.TEXT_NODE)
                            System.out.println(inf2.getChildNodes().item(0).getTextContent());
                    }
                    System.out.println("_________________");
                }

            }
        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        }catch (SAXException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
