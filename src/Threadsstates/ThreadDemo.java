package Threadsstates;

public class ThreadDemo {
public static void main(String[] args) throws InterruptedException {
// TODO Auto-generated method stub
MyThread m = new MyThread();
Thread m1 = new Thread(m);
System.out.println("m1 state: " + m1.getState());//new
m1.start();
//runnable
System.out.println("m1 state before main sleep : " +m1.getState());
Thread.sleep(1000);
System.out.println("m1 state after main sleep : " +m1.getState());//TIMED_WAITING
Thread.sleep(2000);
System.out.println("m1 state after 2 main sleep : " +m1.getState());//terminated
}
}
class MyThread implements Runnable{
public void run() {
try {
Thread.sleep(2500);
System.out.println("m1 in run(), state: " + Thread.currentThread().getState());
}catch(InterruptedException e) {
e.printStackTrace();
}
}
}
