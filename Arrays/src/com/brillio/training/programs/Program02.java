package com.brillio.training.programs;

import java.util.Arrays;

public class Program02 {

	public static void main(String[] args) {
		int[][] nums = {
				{1,2,5},
				{234, 546, 76,89, 7567},
				{545,66,7},
				{1,55}
		};
		for (int i = 0; i < nums.length; i++) {
			System.out.println(Arrays.toString(nums[i]));
		}
		
	}
}
