package hashtable;

import java.util.Hashtable;
import java.util.Map;

public class HashTablecode {
	
		public static void main(String[] args) {
		
		Map<String,String> k = new Hashtable<String,String>();
		k.put("sai", "anaparthi");
		k.put("vikas", "varthi");
		k.put("gain", null);
		System.out.print("Elements in Hashtable are:\n " + k.entrySet());
		System.out.println(k.get("sai"));
		}
		}
