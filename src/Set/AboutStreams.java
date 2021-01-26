package Set;

import java.util.ArrayList;
import java.util.List;

public class AboutStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> listnames = new ArrayList<String>();
		listnames.add("aba");
		listnames.add("xyz");
		listnames.add("mnq");
		listnames.add("lop");
		listnames.add("xms");

		listnames.stream().filter(name -> !name.equals("xyz"))
		                  .forEach(item -> System.out.println(item));
	}

}
