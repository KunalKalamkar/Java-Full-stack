/* 1. abstract class is incomplete as we cant create object using  new keyword.
   2. abstract class may or may not contain abstract method.
   3. It may have more than one abstract methods.
   4. If a class has an abstract method it must be declared as abstract class.
   5. The exteding class must override the abstract method and follow the accessor modifier      	 rules.
   6. That is equal access or more access must be given to the overriden method.
   7. An abstract class may contain complete method or methods also. It means method with 	   	 body.
   8. Abstract class can grow in the sense that we can add concrete methods and the extending 	 classes are not affected. but if we add one more abstract method then the extending 	  	 classes will not compile. 
9. abstract method cant have body.
 */




abstract class abs{

void sub(int a){
a--;
System.out.println("Sub(base class) = " +a);
}

abstract void add(int a);
 //abs a1 = new abs(); //error: abs is abstract; 
}

class useabs extends abs{

void add(int a){
a++;
System.out.println("add(sub class) = " +a);
}

public static void main(String []args){
abs a1 = new useabs();
a1.add(12);
a1.sub(10);
}

}

