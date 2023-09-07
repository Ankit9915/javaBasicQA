package hackerRank;
import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;
public class NthHighestSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> map = new HashMap<>();

		map.put("ankit", 500);
		map.put("aman", 800);
		map.put("mohan", 900);
		map.put("sohan", 1000);
		map.put("ram", 1100);
		map.put("jhon", 1200);
		map.put("mike", 1300);
		map.put("musk", 1400);
		
		Entry<String, Integer> nthHighestSalary = getNthHighestSalary(4,map);
		System.out.println(nthHighestSalary);
		}
		
		
		public static Map.Entry<String, Integer> getNthHighestSalary(int n,Map<String,Integer> map){
			return  map.entrySet().stream()
					.sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).collect(Collectors.toList())
					.get(n-1);
					
		}
	}


