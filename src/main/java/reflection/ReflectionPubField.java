package reflection;
import org.apache.logging.log4j.*;
import java.lang.Class;
import java.lang.reflect.*;
class Student {
	 Logger demologger = LogManager.getLogger();
  public String StudentName;
}
class PublicField {
  public static void main(String[] args) {
     try{
         Student student = new Student();
        // get an object of the class Class
         Class obj = student.getClass(); 
 
       // provide field name and get the field info     
         Field student_field = obj.getField("StudentName");
        System.out.println("Details of StudentName class field:");
        // set the value of field
         student_field.set(student, "Lacey");
         
        // get the access modifier of StudentName
         int mod1 = student_field.getModifiers();
         String modifier1 = Modifier.toString(mod1);
         System.out.println("StudentName Modifier::" + modifier1);
        // get the value of field by converting in String
         String typeValue = (String)student_field.get(student);
         System.out.println("StudentName Value::" + typeValue);
     }
     catch(Exception e) {
         e.printStackTrace();
     }
     
     
  }
}