package HackerEarth;

public class SquareSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Sort the square of array 
		int n[]= {-4,-1,0,3,10};
		for(int i=0;i<n.length;i++) {
			n[i]= n[i]*n[i];
		}
		for(int i=0;i<n.length;i++) {
			for(int j=i+1;j<n.length;j++) {
				if(n[i]>n[j]) {
					int temp=n[i];
					n[i]=n[j];
					n[j]=temp;
				}
			}
		}
		for(int i=0;i<n.length;i++) {
			System.out.print(n[i]+" ");
		}
	}

}
