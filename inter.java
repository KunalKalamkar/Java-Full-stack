/* by default all methods in an interface is public abstract
 -->methods cant have body till jdk 8
 -->one interface can extend another interface
 -->the class implements the interface must override the           	methods in the interface
-->a class can implement multiple interfaces

*/


interface inter{

void add(int a);

}

interface inter2 extends inter{

void sub(int a,int b);

}

class useinter implements inter2{
public void add(int a){
	a++;
	System.out.println("Add ="+ a); 
}

public void sub(int a,int b){

System.out.println("Sub = "+(a-b));
}

public static void main(String []args){
inter  i = new useinter();
i.add(2);
inter2 i2 = new useinter();
i2.sub(12,3);
inter2 i3 = new useinter();
i3.add(133);
i3.sub(133,34);
}
}