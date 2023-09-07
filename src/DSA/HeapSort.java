package DSA;

public class HeapSort {

	
	public void sort(int arr[]) {
		int n = arr.length;
		//Build Heap
		for(int i=n/2-1;i>=0;i--) 
			heapify(arr,n,i);
			
			//one by one extracting element
			for(int i=n-1;i>0;i--) {
				int temp=arr[0];
				arr[0]=arr[i];
				arr[i]=temp;
				heapify(arr,i,0);
			}
		
	}
	void heapify(int arr[],int n,int i) {
		int largest =i;
		int left = 2*i+1;
		int right = 2*i+2;
		if(left<n&&arr[left]>arr[largest]) {
			largest = left;
		}
		if(right<n&&arr[right]>arr[largest]) {
			largest =right;
		}
		if(largest!=i) {
			int swap = arr[i];
			arr[i]=arr[largest];
			arr[largest]=swap;
			//calling heapify recursively
			heapify(arr, n, largest);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {7,3,5,8,2,1};
		HeapSort hs = new HeapSort();
		hs.sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
