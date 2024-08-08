import java.io.*;
public class SerializeDemo{
public static void main(String[] args){
Employee e = new Employee();
e.name = "CSMSS";
e.address = "Chh. sambhajinagar";
e.number = 102;

try{
FileOutputStream fileOut = 
new FileOutputStream("employee2.ser");
ObjectOutputStream out = new ObjectOutputStream(fileOut);
out.writeObject(e);
out.close();
fileOut.close();
System.out.printf("Serialized data is saved in employee.ser");

}catch(IOException i){
i.printStackTrace();
}

}

}