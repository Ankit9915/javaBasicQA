package sdetInterview;
import java.util.*;
public class InterSection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int arr1[] ={1,6,8,9,10};
		  int arr2[] = {1,2,3,4,8};
		  int arr3[]={1,8,9,10,11};
		  int n1=arr1.length;
		  int n2 = arr2.length;
		  int n3 = arr3.length;
		  int x=0;
		  int y=0;
		  int z=0;
		  ArrayList<Integer> list = new ArrayList<>();
		  while(x!=n1&y!=n2&&z!=n3) {
			  int x1=arr1[x];
			  int y1=arr2[y];
			  int z1=arr3[z];
			  if(x1==y1&&y1==z1) {
				  list.add(x1);
				  x=x+1;
				  y=y+1;
				  z=z+1;
			  }
			  else if(x1<=y1&&x1<=z1) {
				  x=x+1;
			  }
			  else if(y1<=x1&&y1<=z1) {
				  y=y+1;
			  }
			  else
				  z=z+1;
		  }
		  System.out.println(list);
		  
	}

}
