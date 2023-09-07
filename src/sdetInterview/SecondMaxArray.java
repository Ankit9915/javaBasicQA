package sdetInterview;

public class SecondMaxArray {

	public static void main(String[] args) {
		int temp=0;
		int arr[] = {24,76,98,45,12,96};
		for(int i =0;i<arr.length;i++) {
			for(int j = i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(arr[1]);

	}

}
