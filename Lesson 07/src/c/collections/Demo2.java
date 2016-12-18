package c.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Demo2 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			int r = (int) (Math.random() * 11);
			list.add(r);
		}

		// list.add("aaa");
		// list.add(new Date());

		System.out.println(list);

		Set<Integer> set = new HashSet<>();
		while (set.size() < 10) {
			int r = (int) (Math.random() * 11);
			set.add(r);
		}

		System.out.println(set);

	}

}
