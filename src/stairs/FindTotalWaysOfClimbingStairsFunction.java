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
		// Base case;
		if(n <= 0){
			return 0;
		}
		
		if(n == 1 || n ==2){
			return n;
		}
		
		int[] dp = new int[n + 1];
		
		// dp[0] is not really needed since we will never touch it
		dp[0] = 0;
		
		// Since you could only climb one step if there is only 1 staircase
		dp[1] = 1;
		// Since you could only climb two steps if there is only 2 staircase
		dp[2] = 2;
		
		// Starting from three since we got base case of before three
		for(int i = 3; i <= n; i++){
			dp[i] = dp[i - 1] + dp[i - 2];
		}
		
		// Return the number of steps you could take
		return dp[n];
	}
}
