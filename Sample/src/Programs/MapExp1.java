package Programs;

import java.util.HashMap;
import java.util.Map;

public class MapExp1 {

	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(10, "Amit");
		map.put(11, "Amitesh");
		map.put(12, "Amita");
		for(Map.Entry m: map.entrySet()) {
			System.out.println(m.getKey()+" " + m.getValue());
		}
	}

}
