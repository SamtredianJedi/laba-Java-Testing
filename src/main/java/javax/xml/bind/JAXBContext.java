package javax.xml.bind;

import convertJava.Employee;

public interface JAXBContext {

	static JAXBContext newInstance(Class<Employee> class1) {
		// TODO Auto-generated method stub
		return null;
	}

	Marshaller createMarshaller();

}
