
package sax;
import org.apache.logging.log4j.*;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import animalclass.Animal;

public class PrintAllHandlerSax extends DefaultHandler {
	private static final Logger LOGGER = LogManager.getLogger(PrintAllHandlerSax.class);

  private StringBuilder currentValue = new StringBuilder();

  @Override
  public void startDocument() {
      LOGGER.info("Start Document");
  }

  @Override
  public void endDocument() {
      LOGGER.info("End Document");
  }

  @Override
  public void startElement(
          String uri,
          String localName,
          String qName,
          Attributes attributes) {

      // reset the tag value
      currentValue.setLength(0);

      LOGGER.info("Start Element : %s%n", qName);

      if (qName.equalsIgnoreCase("staff")) {
          // get tag's attribute by name
          String id = attributes.getValue("id");
          LOGGER.info("Staff id : %s%n", id);
      }

      if (qName.equalsIgnoreCase("salary")) {
          // get tag's attribute by index, 0 = first attribute
          String currency = attributes.getValue(0);
          LOGGER.info("Currency :%s%n", currency);
      }

  }

  @Override
  public void endElement(String uri,
                         String localName,
                         String qName) {

      LOGGER.info("End Element : %s%n", qName);

      if (qName.equalsIgnoreCase("name")) {
          LOGGER.info("Name : %s%n", currentValue.toString());
      }

      if (qName.equalsIgnoreCase("role")) {
          LOGGER.info("Role : %s%n", currentValue.toString());
      }

      if (qName.equalsIgnoreCase("salary")) {
          LOGGER.info("Salary : %s%n", currentValue.toString());
      }

      if (qName.equalsIgnoreCase("bio")) {
          LOGGER.info("Bio : %s%n", currentValue.toString());
      }

  }

  
  // SAX parsers may return all contiguous character data in a single chunk,
  // or they may split it into several chunks
  @Override
  public void characters(char ch[], int start, int length) {

      currentValue.append(ch, start, length);

  }
  
  					// Some comentaries
  
//The characters() method can be called multiple times for a single text node.
  // Some values may missing if assign to a new string

  // avoid doing this
  // value = new String(ch, start, length);

  // better append it, works for single or multiple calls

}
