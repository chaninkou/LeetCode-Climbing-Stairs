package stairs;

public class FindTotalWaysOfClimbingStairsFunction {
//	public int climbStairs(int n) {
//		// Base case: 0 stairs means 0 way
//		if (n <= 0) {
//			return 0;
//		}
//		
//		// Base case: 1 stairs means only 1 way
//		if (n == 1) {
//			return 1;
//		}
//		
//		// Base case: 2 stairs means only 2 ways
//		if (n == 2) {
//			return 2;
//		}
//
//		// n - 1 ex: 1 2 3
//		int oneIndexBefore = 2;
//
//		// n - 2 ex: 1 2 3
//		int twoIndexBefore = 1;
//
//		// Keeping track total
//		int totalWays = 0;
//
//		// Starts from 3 since we know it passes the base case 
//		for (int i = 3; i <= n; i++) {
//			// Adding to the total
//			totalWays = oneIndexBefore + twoIndexBefore;
//
//			// Update the index, twoindex before always the smaller one
//			twoIndexBefore = oneIndexBefore;
//
//			// Update the index, oneindex before always the bigger one
//			oneIndexBefore = totalWays;
//		}
//
//		return totalWays;
//	}
	
	// dp array method
	public int climbStairs(int n){
		int[] dp = new int[n + 1];
		
		dp[0] = 1;
		
		dp[1] = 1;
		
		for(int i = 2; i <= n; i++){
			dp[i] = dp[i - 1] + dp[i - 2];
		}
		
		return dp[n];
	}
}
