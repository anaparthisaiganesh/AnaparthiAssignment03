package ArrayListSynchronizedMethod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListSynchronizedMethod {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> array1 = new ArrayList<String>();
		array1.add("Ganesh");
		array1.add("Vikas");
		array1.add("Sai");
		
		array1 = Collections.synchronizedList(array1);
		synchronized(array1) {
			Iterator<String> itrer = array1.listIterator();
			while(itrer.hasNext()) {
				System.out.println(itrer.next());
			}
		}
	}
}



