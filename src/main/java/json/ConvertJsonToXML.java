package json;

//import required classes and packages  


import java.io.*;  
import java.nio.file.Files;  
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.jar.JarException;

import org.json.JSONException;  
import org.json.XML;
import org.json.simple.JSONObject;  

//create ConvertJsonToXML class to convert JSON data into XML  
public class ConvertJsonToXML {  
   
 // main() method start  
 public static void main(String[] args) throws JarException {  
      
    // create variable loc that store location of the Sample.json file   
     String loc = "src/main/resources/Sample.json";  
           
     String result;  
     try {  
               
         // read byte data from the Sample.json file and convert it into String  
         result = new String(Files.readAllBytes(Paths.get(loc)));  
         //Convert JSON to XML  
         String xml = convertToXML(result, "root"); // This method converts json object to xml string  
           
         // use of try-catch to store XML data into file.  
         FileWriter file = new FileWriter("src/main/resources/XMLdata");  
               
             // use write() method of File to write XML data into XMLData.txt  
             file.write(xml);   
             file.flush();  
             System.out.println("Your XML data is successfully written into XMLdata.txt");  
               
             // close FileWriter  
             file.close();  
               
     } catch (IOException e1) {  
         // TODO Auto-generated catch block  
         e1.printStackTrace();  
     }  
 }  
   
 // create convertToXML() method for converting JSOn data into XML  
 public static String convertToXML(String jsonString, String root) throws JarException {    // handle JSONException  
       
     // create instance of JSONObject by passing jsonString to the constructor  
     JSONObject jsonObject = new JSONObject();  
       
     // use XML.toString() method to convert JSON into XML and store the result into a string  
     String xml = "<?xml version=\"1.0\" encoding=\"ISO-8859-15\"?>\n<"+root+">" + XML.toString() + "</"+root+">";  
       
     // pass the XML data to the main() method  
     return xml;  
 }  
}  