package CollectionBasic;
import java.util.*;
public class ArrayListToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> l = new ArrayList<>();
		l.add("anf");
		l.add("frde");
		l.add("erws");
		l.add("ankit");
		l.add(4, "adit");
		Object[] arr = l.toArray();
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("________________________________");
		//using get method
		String[] s = new String[l.size()];
		for(int i=0;i<s.length;i++) {
			s[i]=l.get(i);
			System.out.println(s[i]);
		}
		//Array to list
		System.out.println("_________________________________");
		Integer[] array = new Integer[4];
		array[0]=8;
		array[1]=2;
		array[2]=1;
		array[3]=3;
		ArrayList<Integer> list =new ArrayList<>(Arrays.asList(array));
		for(Integer i: list) {
			System.out.println(i);
		}
		System.out.println(list.size());
	}

}
