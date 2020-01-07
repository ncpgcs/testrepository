package zilkiproj;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {
public static void main(String[] args) {
	HashMap<String,String> hm=new HashMap<String, String>();
	hm.put("a1", "hello world");
	hm.put("a2", "hai");
	hm.put("a3", "india");
	
	System.out.println(hm);
	System.out.println(hm.get("a1"));
	
	Set s=hm.entrySet();
	Iterator iter=s.iterator();
	
	while(iter.hasNext()) {
		Map.Entry me=(Map.Entry)iter.next();
		System.out.println(me.getKey()+":"+me.getValue());
	}
}
}
