package hackerRank;

public class SubArrayNegativeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1, -2, 4, -5, 1};
		int count =0;
		for(int i =0;i<arr.length;i++) {
			int sum=0;
			for(int j=i;j<arr.length;j++) {
				sum+=arr[j];
				if(sum<0) {
					System.out.println(i+" "+j);
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
