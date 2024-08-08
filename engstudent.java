class student{
student(){
System.out.println("student constructor");
}
}

class engstudent extends student{
engstudent(){

System.out.println("engstudent constructor");
}
public static void main(String[] args){
engstudent e1 = new engstudent();
}
}