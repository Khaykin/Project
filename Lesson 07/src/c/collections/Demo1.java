package c.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Demo1 {

	public static void main(String[] args) {
		
		// create a list
		List list = new ArrayList();
		
		list.add("aaa");
		list.add("bbb");
		list.add("aaa");
		
		System.out.println(list);

		// create a set
		Set set = new HashSet();
		set.add("bbb");
		set.add("aaa");
		set.add("aaa");
		System.out.println(set);
	}
}
