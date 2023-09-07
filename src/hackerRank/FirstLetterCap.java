package hackerRank;

public class FirstLetterCap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = {"aman","mohit","ankit","love"};
		for(int i =0;i<arr.length;i++) {
			String first = arr[i].substring(0, 1).toUpperCase();
			String rem = arr[i].substring(1);
			arr[i]= first+rem;
		}
		for(String str:arr) {
			System.out.println(str);
		}
	

	}

}
