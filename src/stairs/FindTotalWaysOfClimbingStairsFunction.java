package stairs;

public class FindTotalWaysOfClimbingStairsFunction {
	public int climbStairs(int n) {
		// base cases
		if (n <= 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		if (n == 2) {
			return 2;
		}

		// n - 1 ex: 1 2 3
		int oneIndexBefore = 2;

		// n - 2 ex: 1 2 3
		int twoIndexBefore = 1;

		int totalWays = 0;

		for (int i = 2; i < n; i++) {

			totalWays = oneIndexBefore + twoIndexBefore;

			twoIndexBefore = oneIndexBefore;

			oneIndexBefore = totalWays;
		}

		return totalWays;
	}
}
