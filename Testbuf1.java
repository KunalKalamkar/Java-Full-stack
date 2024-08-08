import java.io.*;
class Testbuf1{
public static void main(String[] args){
String s1 = null;
String s2 = null;
try{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter value 1 :-");
s1 = br.readLine();
System.out.println("Enter value 1 :-");
s2 = br.readLine();

System.out.println(" Value 1 + Value 2 :-" + (s1+s2));
}
catch(IOException e){
System.out.println("Exception :- " +e);
}


}

}