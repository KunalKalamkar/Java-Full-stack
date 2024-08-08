/* Nested class :- 

*/

class nestedClass{

int x = 100;
void createInner(){
Inner i1 = new Inner();
i1.add(100);

}
	private class Inner{
	int y = 10;
	void add(int a){
	a++;
	System.out.println("Inner variable value = "+a);
	System.out.println("Outer variable value = "+x);
	}
	}
public static void main(String[] args){
nestedClass n1 = new nestedClass();
n1.createInner();
nestedClass.Inner i2 = n1.new Inner();
//Inner i2 = new Inner();					// Error
i2.add(1200);
}
}