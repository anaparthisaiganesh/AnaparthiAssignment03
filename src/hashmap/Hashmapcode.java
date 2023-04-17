package hashmap;

import java.util.HashMap;
import java.util.Map;

public class Hashmapcode {

		public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> k = new HashMap<String,String>();
		k.put("sai", "anaparthi");
		k.put("vikas", "varthi");
		k.put("gain", null);
		System.out.print("Elements in Hashtable are:\n " + k.entrySet());
		System.out.println(k.get("sai"));
		}
		}

		
