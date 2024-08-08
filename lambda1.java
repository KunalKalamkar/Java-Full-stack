class lambda1{
public static void main(String[] args){

Runnable r = ()->System.out.println(Thread.currentThread().getName());
Thread t = new Thread(r);
Thread t1 = new Thread(r);
t.start();
t1.start();
}
}