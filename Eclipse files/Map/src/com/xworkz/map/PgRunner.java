package com.xworkz.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class PgRunner {

	public static void main(String[] args) {
		Map<String, Double> ref1=new HashMap<String, Double>();
		ref1.put("Kushi PG 1", 6200D);
		ref1.put("kushi PG 2", 7000D);
		ref1.put("Annapoorneshwari", 5000D);
		ref1.put("Shubam", 0D);
		ref1.put("Rolex", 10000D);
		ref1.put("Durgamba", 5000D);
		ref1.put("Sai", 7000D);
		ref1.put("Sri", 7393D);
		ref1.put("Devi", 3000D);
		ref1.put("Ganesha", 5700D);
		
		System.out.println(ref1.size());
		
		 boolean empty=ref1.isEmpty(); 
		System.out.println(empty);
		
		Set<String> keys=ref1.keySet();
		keys.forEach(ele->System.out.println(ele));
		
		Collection<Double> values=ref1.values();
		values.forEach(ele->System.out.println(ele));
		
		 Set<Entry<String, Double>> pair=ref1.entrySet();
		 pair.forEach(ele->System.out.println(ele.getKey()));
		 
		 
		
		
	}

}
