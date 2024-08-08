class FirstThread implements Runnable{
public void run(){
System.out.println("Thread calls run()");
for(int i=0;i<=10;i++){
System.out.println(i);
}
}

}


class SecondThread implements Runnable{
public void run(){
System.out.println("Thread calls run()");
for(int i=11;i<=20;i++){
System.out.println(i);
}
}

}

class UseThread{
public static void main(String[]args){
FirstThread f1 = new FirstThread();
Thread tt1 = new Thread(f1);
tt1.setName("First thread");
tt1.start();

SecondThread f2 = new FirstThread();
Thread tt2 = new Thread(f2);
tt1.setName("Second thread");
tt1.start();
}
}