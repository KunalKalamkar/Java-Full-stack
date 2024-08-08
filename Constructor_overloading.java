class Constructor_overloading{
int a=0;
static int counter=0;

Constructor_overloading(int x){

System.out.println("No arg constructor called");
counter++;
System.out.println("Counter = "+counter);
this.a=x;
}



void add(int a){
a++;

System.out.println("a = "+a);
}

public static void main(String args[]){
System.out.println("Name = Kunal kalamkar \nRoll no:- 4269");
Constructor_overloading c1 = new Constructor_overloading(1000);
Constructor_overloading c2 = new Constructor_overloading(2000);
System.out.println("c1.a = "+c1.a);
System.out.println("c2.a = "+c2.a);
c1.add(1);
c2.add(100);
}


}