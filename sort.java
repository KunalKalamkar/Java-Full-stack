import java.util.*;
class sort{
public static void main(String[] args){
String str= "Ravi shiral";
String lower="";
String upper="";
int p1 = str.length()/2;
for(int i=0;i<p1;i++){

lower+=str.charAt(i);

}

for(int i=p1;i<str.length();i++){
upper+=str.charAt(i);
}
System.out.println(lower.toLowerCase()+""+upper.toUpperCase());

}
}

  