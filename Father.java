class Father{
void job(){
System.out.println("Retd professor");
}

void property(){
System.out.println("a house in native place");
}

void hobby(){
System.out.println("news paper and TV");
}

}

class Son extends Father{

void job(){
System.out.println("Son job");
}

void property(){
System.out.println("Son property");
}

void hobby(){
System.out.println("Son hobby");
}

void tour(){
System.out.println("Son TOUR");
}

public static void main(String args[]){
System.out.println("NAME:- KUNAL KALAMKAR \nROLL NO:- 4269");
Father f1 = new Father();
f1.job();
f1.property();
f1.hobby();


Son s1 = new Son();
s1.job();
s1.property();
s1.hobby();


Father f2 = new Son();
f2.hobby();
//f2.tour();

}
}