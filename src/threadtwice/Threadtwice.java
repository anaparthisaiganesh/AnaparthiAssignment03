package threadtwice;

public class Threadtwice extends Thread {
		public void run() {
		System.out.println("Thread running");
		}
		}
		public class Thread2 {
		public static void main(String[] args) {
			Threadtwice k = new Threadtwice();
		k.start();
		}
		}



