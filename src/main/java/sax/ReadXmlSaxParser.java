package sax;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;

public class ReadXmlSaxParser {

    private static final String FILENAME = "src/main/resources/xml/staff.xml";

    public static void main(String[] args) {

        SAXParserFactory factory = SAXParserFactory.newInstance();

        try {

            SAXParser saxParser = factory.newSAXParser();

            PrintAllHandlerSax handler = new PrintAllHandlerSax();

            saxParser.parse(FILENAME, handler);

        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }

    }

}
