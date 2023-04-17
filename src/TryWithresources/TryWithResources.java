package TryWithresources;

import java.io.FileOutputStream;    
public class TryWithResources {    
public static void main(String args[]){      
        // Using try-with-resources  
try(FileOutputStream fileOutputStream =newFileOutputStream("/javafile/src/abc.txt")){      
String message = "Welcome to back";      
byte byteArray[] = message.getBytes();      
fileOutputStream.write(byteArray);  
System.out.println("Message written to file successfuly!");      
}catch(Exception exception){  
       System.out.println(exception);  
}      
}      
} 