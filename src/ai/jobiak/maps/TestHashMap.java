package ai.jobiak.maps;

import java.util.*;
import java.util.Map.Entry;
import java.lang.*;

public class TestHashMap {

	public static void main(String[] args) {
		//Hash map stores objects with key value pair-to get value we use key 
		HashMap<String,String> map = new HashMap<String,String>();
		map.put("apple","iPhone");
		map.put("samsung","Note1");
		map.put("nokia","windows");
		map.put("blackberry","first smart phone");
		System.out.println(map.size());
		System.out.println(map);
		System.out.println(map.get("Samsung"));
		//3 views on HashMap
		Set keys=map.keySet();
		Iterator iter=keys.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		Collection values=map.values();
		for(Object obj:values) {
			System.out.println(obj);
		}
       Set<Entry<String,String>>entries=map.entrySet();
       Iterator iter2=entries.iterator();
       while(iter2.hasNext()) {
    	   Entry entry=(Entry)iter2.next();
    	   System.out.println(entry.getKey()+"::"+entry.getValue());
       }
  }
}