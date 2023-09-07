package Basic20CodingQuestion;




public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {4,3,2,5};
		int length = arr.length;
		int numsSum =0;
		int rangeSum =0;
		for(int i=0;i<=length+1;i++) {
			rangeSum+=i;
		}
		for(int num:arr) {
			numsSum+=num;
		}
		int missNo=Math.abs(rangeSum-numsSum);
		System.out.println(missNo);
	}

}
