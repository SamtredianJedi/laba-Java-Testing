package convertJava;

import java.io.File;

import animalClass.Employee;

public class ReadXML {

	ReadXML XML with JAXB
	String fileName = "employee.xml";
	 
	//Call method which read the XML file above
	void jaxbXmlFileToObject(fileName);
	 
	private static void jaxbXmlFileToObject(String fileName) {
	     
	    File xmlFile = new File(fileName);
	     
	    JAXBContext jaxbContext;
	    try
	    {
	      jaxbContext = JAXBContext.newInstance(Employee.class);
	      Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
	      Employee employee = (Employee) jaxbUnmarshaller.unmarshal(xmlFile);
	       
	      System.out.println(employee);
	    }
	    catch (JAXBException e) 
	    {
	      e.printStackTrace();
	    }
	  }
}
