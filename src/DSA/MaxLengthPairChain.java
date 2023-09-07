package DSA;

import java.util.Arrays;
import java.util.Comparator;

public class MaxLengthPairChain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int pairs[][]= {{5,24},{39,60},{5,28},{27,40},{50,90}};
		
		Arrays.sort(pairs,Comparator.comparingDouble(o->o[1]));
		int chainLength=1;
		int pairEnd = pairs[0][1];//Last selected pair // chain end
		for(int i=1;i<pairs.length;i++) {
			if(pairs[i][0]>pairEnd) {
				chainLength++;
				pairEnd = pairs[i][1];
			}
		}
		System.out.println("maximum length of chain "+chainLength);
	}

}
