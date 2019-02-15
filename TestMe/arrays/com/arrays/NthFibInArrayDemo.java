package com.arrays;

public class NthFibInArrayDemo {

	public static void main(String[] args) {
		// 0, 1, 2, 3, 5, 8, 13, 21, 34
		
		//Staricase problem can  be solved using Nth fib Number
		int ans = findNthFib(5);
		System.out.println("The number in Fibonacici series at index 5 = " + ans);
		
		//Staricase problem 
		int climbStairs = climbStairs(7);
		System.out.println("\n\nThe number of ways to reach top stair is = " + climbStairs);
	}

	private static int findNthFib(int n) {

		if (n == 1) {
			return 1;
		}
		int first = 1;
		int second = 2;
		for (int i = 3; i <= n; i++) {
			int third = first + second;
			first = second;
			second = third;
		}
		return second;
	}

	/****
	 * You are climbing a stair case. It takes n steps to reach to the top.
	 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
	 */
	public static int climbStairs(int n) {
		if (n == 1) {
			return 1;
		}
		int[] dp = new int[n + 1];
		dp[1] = 1;
		dp[2] = 2;
		for (int i = 3; i <= n; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
		}
		return dp[n];
	}

}
