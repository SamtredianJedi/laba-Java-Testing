package convertjava;

import java.io.FileOutputStream;  

import javax.xml.bind.JAXBContext;  
import javax.xml.bind.Marshaller;  
  
  
public class ObjectToXMLJava {  
public static void main(String[] args) throws Exception{  
    JAXBContext contextObj = JAXBContext.newInstance(Employee.class);  
  
    Marshaller marshallerObj = contextObj.createMarshaller();  
    marshallerObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);  
  
    Employee emp1=new Employee(1,"Vimal Jaiswal",50000);  
      
    marshallerObj.marshal(emp1, new FileOutputStream("employee.xml"));  
       
}  
}  
