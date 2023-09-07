package HackerEarth;
import java.util.Arrays;
import java.util.Scanner;
public class Divisiblity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] data = new int[n];
		for(int i=0;i<n;i++) {
			data[i]=sc.nextInt();
		}
		int[] arr =new int[n];
        for(int i=0;i<n;i++){
            
            for(int j=i;j<n;j++){
                arr[j]=data[i]%10;
            }
        }
        StringBuilder sb = new StringBuilder();
      for(int i=0;i<n;i++) {
    	  sb.append(arr[i]);
      }
      String concat = sb.toString();
      int number = Integer.parseInt(concat);
      if(number%10==0) {
    	  System.out.println("yes");
      }
      else
    	  System.out.println("no");
	}

}
