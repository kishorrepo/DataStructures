package com.arrays;

public class RotateDemo {

	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50, 60, 70, 80};
		int k =5;
		rotateArray(arr,k);

	}

	private static void rotateArray(int[] arr, int k) {
		//k = k % arr.length;
		
		System.out.println(k);
		printArray(arr);
		
		//Reverse whole array
		reverse(arr, 0, arr.length-1);
		int end = arr.length-1;
		System.out.println("\n\nAfter Reverse start = 0 end = "+end);
		printArray(arr);
		
		//Reverse by rotation factor,  0 to rotatation fatctor.
		reverse(arr, 0, k-1);
		end=k-1;
		System.out.println("\n\nAfter Reverse start = 0 end = "+end);
		printArray(arr);
		
		//Reverse reamining array from rotation index to end of array.
		reverse(arr, k, arr.length-1);
		int start = k;
		end=arr.length-1;
		System.out.println("\n\nAfter Reverse start = "+start+" end = "+end);
		printArray(arr);
	}

	private static void reverse(int[] arr, int start, int end) {
		while(start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] +" ");
		}
	}

}
