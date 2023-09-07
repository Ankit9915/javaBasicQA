package DSA;

public class MergeSort {

	public static void conquer(int arr[],int si,int mid,int ei) {
		int [] merged = new int[ei-si+1];
		int index1=si;
		int index2=mid+1;
		int x=0;
		while(index1<=mid && index2<=ei) {
			if(arr[index1]<=arr[index2]) {
				merged[x]=arr[index1];
				x++;
				index1++;
			}
			else
				merged[x++]=arr[index2++];
		}
		while(index1<=mid) {
			merged[x++]=arr[index1++];
		}
		while(index2<=ei) {
			merged[x++]=arr[index2++];
		}
		for(int i=0,j=si;i<merged.length;i++,j++) {
			arr[j]=merged[i];
		}
	}
	public static void divide(int arr[],int si,int ei) {
		if(si>=ei) {
			return;
		}
		int mid = si+(ei-si)/2;
		divide(arr,si,mid);
		divide(arr,mid+1,ei);
		conquer(arr,si,mid,ei);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {6,3,5,8,2,10};
		int n = arr.length;
		divide(arr,0,n-1);
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
