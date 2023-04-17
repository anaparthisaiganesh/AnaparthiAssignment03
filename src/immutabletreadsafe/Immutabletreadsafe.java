package immutabletreadsafe;

public class Immutabletreadsafe {
public static void main(String[] args) {
// TODO Auto-generated method stub
String str = "Ganesh";
str.concat("Sai");
System.out.println("name : " +str);
Thread test = new Thread(new Runnable() {
public void run() {
str.concat("tem");
System.out.println("Thread: " +str);
}
});
Thread t1 = new Thread(new Runnable() {
public void run() {
str.concat("t1");
System.out.println("Thread1 : " +str);
}
});
test.start();
t1.start();
}
}
