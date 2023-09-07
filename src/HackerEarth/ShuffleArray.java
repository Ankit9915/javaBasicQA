package HackerEarth;

public class ShuffleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 3;//half of array
		int arr[]= {2,5,1,3,4,7}; //size of array 2n
		// output [2,3,5,4,1,7]
		int res[] = new int[2*n];
		int j=0;
		for(int i=0;i<n;i++) {
			res[j]=arr[i];
			j=j+2;
		}
		int k=1;
		for(int i=n;i<2*n;i++) {
			res[k]=arr[i];
			k=k+2;
		}
		for(int i =0;i<2*n;i++) {
			System.out.print(res[i]+" ");
		}
	}

}
