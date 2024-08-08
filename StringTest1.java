class StringTest1{
public static void main(String[]ar){
String s1 = "Hello";
String s2 = "Hello";  // s1 and s2 refers Hello 
System.out.println(s1);
System.out.println(s2);

System.out.println(s1.length());
System.out.println(s2.length());

System.out.println(s1.hashCode());
System.out.println(s2.hashCode());

s1=s1+" Bhai";  
s2=s2+" World"; 
System.out.println("S1 = "+s1 + " \nS2 = " +s2);

System.out.println(s1.hashCode());
System.out.println(s2.hashCode());
System.out.println(s1.length());
System.out.println(s2.length());



char[] c1 = s1.toCharArray();
System.out.println(c1.length);
}

}