package Finalize;

public class Finalize {
public static void main(String[] args) {

Finalize string = new Finalize();
string = null;
System.gc();
System.out.println("result for actual method");
} 
@Override
protected void finalize() {
System.out.println("result in finalize method");
}
}

