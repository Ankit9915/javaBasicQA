package HackerEarth;

public class Test {

	 public static int maxProfit(int[] cost, int[] sell, int K) {
	        int N = cost.length;
	        int[] dp = new int[N + 1];
	        dp[0] = 0;

	        for (int i = 1; i <= N; i++) {
	            int maxProfit = 0;
	            for (int j = 1; j <= i; j++) {
	                int profit = dp[j - 1] + sell[j - 1] - cost[j - 1];
	                maxProfit = Math.max(maxProfit, profit);
	            }
	            dp[i] = maxProfit;
	        }

	        return dp[N];
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int K=50;
		int cost[]= {25,30};
		int sell[] = {25,37};
		int maxProfit = maxProfit(cost, sell, K);
        System.out.println("Maximum profit: " + maxProfit);
		
	}

}
