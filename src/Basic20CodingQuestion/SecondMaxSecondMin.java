package Basic20CodingQuestion;

public class SecondMaxSecondMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {45,12,76,23,1,3};
		int n=3; // second largest
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(arr[n-1]);

	}

}
