package javax.xml.bind;

import java.io.FileOutputStream;

import convertJava.Employee;

public @interface Marshaller {

	String JAXB_FORMATTED_OUTPUT = null;

	 void setProperty(String jaxbFormattedOutput, boolean b);

	void marshal(Employee emp1, FileOutputStream fileOutputStream);

	
}
