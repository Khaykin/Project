package c.collections;

import java.util.HashMap;
import java.util.Map;

public class Demo3 {
	
public static void main(String[] args) {
	
	Map<String, Integer> map = new HashMap<>();
	
	map.put("sunday", 1);
	map.put("monday", 2);
	map.put("tuesday", 3);
	map.put("wednesday", 4);
	map.put("thursday", 5);
	
	System.out.println(map);
}
}
