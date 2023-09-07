package DSA;

import java.util.Arrays;
import java.util.Comparator;
import java.util.*;
public class IndianCoinGreedy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer coins[] = {1,2,5,10,20,50,100,500,2000};
		int amount = 590;
		Arrays.sort(coins,Comparator.reverseOrder());
		int count =0;
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0;i<coins.length;i++) {
			if(coins[i]<=amount) {
				while(coins[i]<=amount) {
				count++;
				amount=amount-coins[i];
				list.add(coins[i]);
			}
			}
		}
		System.out.println(count);
		System.out.println(list);
	}

}
