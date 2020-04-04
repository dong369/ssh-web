package sy.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestList {
	public static void main(String args[]) {
		List<String> list = new ArrayList<String>();
		list.add("luojiahui");
		list.add("luojiafeng");
		list.add("java");
		// 方法1
		Iterator<String> it1 = list.iterator();
		while (it1.hasNext()) {
			System.out.println(it1.next());
		}
		System.out.println("----------------------------");
		// 方法2
		for (Iterator<String> it2 = list.iterator(); it2.hasNext();) {
			System.out.println(it2.next());
		}
		System.out.println("----------------------------");
		// 方法3
		for (String tmp : list) {
			System.out.println(tmp);
		}
		System.out.println("----------------------------");
		// 方法4
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

	}
}