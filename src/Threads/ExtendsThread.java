package Threads;

	public class ExtendsThread extends Thread {
		public void run(){
		System.out.println("thread started.");
		}
		
		public class ThreadExDriver {
		public static void main(String[] args) {
	
		ExtendsThread k = new ExtendsThread();
		k.start();
		}
		}
}