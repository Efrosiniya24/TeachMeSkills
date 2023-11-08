package lesson18;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class Hendler extends DefaultHandler {
    boolean name = false;
    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException{
        if(qName.equalsIgnoreCase("line")){
            name = true;
        }
    }
    @Override
    public void characters (char ch[], int start, int length) throws SAXException
    {
        if(name){
            System.out.println("Name: " + new String(ch, start, length));
            name = false;
        }
    }
    @Override
    public void endElement (String uri, String localName, String qName) throws SAXException
    {
        if(qName.equalsIgnoreCase("line")){
            name = false;
        }
    }
}
