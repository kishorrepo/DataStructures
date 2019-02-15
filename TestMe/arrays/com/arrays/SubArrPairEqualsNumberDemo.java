package com.arrays;

import java.util.HashMap;

public class SubArrPairEqualsNumberDemo {

	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50, 60, 70, 80};
		int k = 60;
		int [] subArr = findSumPairsIndexes(arr, k);
		System.out.print("Indexes of target sum 60 are :");
		for (int i = 0; i < subArr.length; i++) {
			System.out.print("\nIndex= "+subArr[i] +"\nelement = "+arr[subArr[i]]);
		}
	}

	private static int[] findSumPairsIndexes(int[] nums, int target) {
	    if(nums==null || nums.length<2)
	        return new int[]{0,0};
	 
	    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	    for(int i=0; i<nums.length; i++){
	        if(map.containsKey(nums[i])){
	            return new int[]{map.get(nums[i]), i};
	        }else{
	            map.put(target-nums[i], i);
	        }
	    }
	 
	    return new int[]{0,0};
	}

}
