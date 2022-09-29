package reflection;
import org.apache.logging.log4j.*;
import java.lang.Class;
import java.lang.reflect.*;
class Student {
	private static final Logger LOGGER = LogManager.getLogger(Student.class);
  public String StudentName;
}


class PublicField {
	private static final Logger LOGGER = LogManager.getLogger(PublicField.class);
  public static void main(String[] args) {
     try{
         Student student = new Student();
        // get an object of the class Class
         Class obj = student.getClass(); 
 
       // provide field name and get the field info     
         Field student_field = obj.getField("StudentName");
        LOGGER.info("Details of StudentName class field:");
        // set the value of field
         student_field.set(student, "Lacey");
         
        // get the access modifier of StudentName
         int mod1 = student_field.getModifiers(); 
         String modifier1 = Modifier.toString(mod1);
         LOGGER.info("StudentName Modifier::" + modifier1);
         
        // get the value of field by converting in String
         String typeValue = (String)student_field.get(student);
         LOGGER.info("StudentName Value::" + typeValue);
     }
     catch(Exception e) {
         e.printStackTrace();
     }
     
     
  }
}