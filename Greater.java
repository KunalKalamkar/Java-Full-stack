class Greater{
public static void main(String[] args){

int a = Integer.parseInt(args[2]);
int b = Integer.parseInt(args[1]);


if(a>b){
System.out.println(a+" is Greater");
}
else if(a==b){
System.out.println("Both are same ");
}
else{
System.out.println(b+" is Greater");
}

}


}