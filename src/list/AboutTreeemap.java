package list;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class AboutTreeemap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,Employee> treemap = new TreeMap<Integer, Employee>();
		treemap.put(32, new Employee(1, "aaa", "aaa123@gmail.com", 234));
		treemap.put(24, new Employee(2, "bbb", "bbb123@gmail.com", 7247));
		treemap.put(98, new Employee(3, "ccc", "ccc123@gmail.com", 667));
		for (Map.Entry m : treemap.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		
		Set set = treemap.keySet();
		for (Object obj : set) {
			System.out.println("keys : " + obj);
		}

	}

}
