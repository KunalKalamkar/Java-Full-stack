public class Developer{
private String name;
private int salary;
private int age;
Developer(String name,int salary,int age){
this.name=name;
this.salary=salary;
this.age=age;
System.out.println("Developer() called" +this.name+this.age);
}
public String toString(){

return "Developer() called"+" Name is: "+this.name+" Salary is: "+this.salary+" Age is: "+this.age;
}
public String getName(){
return this.name;
}
public int getAge(){
return this.age;
}
public int getSalary(){
return this.salary;
}
}