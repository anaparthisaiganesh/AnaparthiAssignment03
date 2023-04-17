package grabagecollector;

public class Grabagecollector {
protected void finalize() throws Throwable{
System.out.println("Finalize called,hence garbage collector triggered");
}
public static void main(String[] args) {
// TODO Auto-generated method stub
	Grabagecollector test = new Grabagecollector();
System.out.println("Calling garbage collector before making null");
System.gc();
test = null;
System.out.println("Calling garbage collector after making null");
System.gc();
}
}
