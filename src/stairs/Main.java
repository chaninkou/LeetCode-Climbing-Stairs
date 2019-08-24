package stairs;

public class Main {
	public static void main(String[] args) {
		int n = 5;
		
		System.out.println("How many ways to climb " + n + " stairs ");
		
		FindTotalWaysOfClimbingStairsFunction solution = new FindTotalWaysOfClimbingStairsFunction();
		
		System.out.println("Solution: " + solution.climbStairs(n) + " ways");
	}
}
