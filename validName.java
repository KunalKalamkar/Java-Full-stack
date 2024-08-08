class validName{
public static void main(String[]ar){
String name = "Kunal123";
name = name.trim();
for(char ch : name.toCharArray()){
if (!Character.isLetter(ch) && !Character.isSpaceChar(ch)) {
        System.out.println(name +" is a NOT VALID name");
		break;
}
else{
System.out.println(name +" is a VALID name");
break;
}
}

}

}