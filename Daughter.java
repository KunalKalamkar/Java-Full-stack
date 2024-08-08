// Methods can be overriden but not attributes

class Mother{

int age = 45;
void job(){
System.out.println("Working in IT sector");
}

void property(){
System.out.println("Row house in Chh. sambhajinagar");
}

void hobby(){
System.out.println("Playing PUBG");
}
}

class Daughter extends Mother{
int age=21;
void job(){
System.out.println("Working in software sector");
}

public void property(){
System.out.println("a bike thru bank loan");
}

public static void main(String[] args){
System.out.println("Name:- KUNAL KALAMKAR \nRoll no:- 4269");
Mother m1 = new Mother();
m1.job();
m1.property();
m1.hobby();

Daughter d1 = new Daughter();
d1.job();
d1.property();
d1.hobby();

Mother m2 = new Daughter();
System.out.println(m2.age);
m2.job();
}


}