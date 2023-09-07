package DSA;
import java.util.*;
public class JobSequencingProblem {

	static class job{
		int deadline;
		int profit;
		int id;
		public job(int i,int d,int p) {
			id=i;
			deadline=d;
			profit=p;
			
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int jobsInfo[][] = {{4,20},{1,10},{1,30},{1,40}};
		ArrayList<job> list = new ArrayList<>();
		for(int i=0;i<jobsInfo.length;i++) {
			 list.add(new job(i,jobsInfo[i][0],jobsInfo[i][1]));
		}
		Collections.sort(list,(obj1,obj2)->obj2.profit-obj1.profit);
		ArrayList<Integer> seq = new ArrayList<>();
		int time =0;
		for(int i=0;i<list.size();i++) {
			job curr= list.get(i);
			if(curr.deadline>time) {
				seq.add(curr.id);
				time++;
			}
		}
		System.out.println("max jobs "+seq.size());
		for(int i=0;i<seq.size();i++) {
			System.out.print(seq.get(i)+" ");
		}
		System.out.println();
	}

}
