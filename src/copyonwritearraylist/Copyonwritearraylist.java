package copyonwritearraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Copyonwritearraylist {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> strings = new ArrayList<String>();
		strings.add("ganesh");
		strings.add("sai");
		strings.add("vikas");
		System.out.println("Elements of synchronized ArrayList :");
		Iterator<String> itr = strings.iterator();
		while (itr.hasNext())
		System.out.println(itr.next());
		}


}
