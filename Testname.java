import java.util.regex.*;
class Testname{
public static void main(String[] args){
CharSequence inputStr = " Kunal ";
Pattern pattern = Pattern.compile(new String ("^[a-zA-Z\\s]*$"));
Matcher matcher = pattern.matcher(inputStr);
if(matcher.matches()){
System.out.println("Name is OK");

}
else{
System.out.println("Invalid name");


}
}

}