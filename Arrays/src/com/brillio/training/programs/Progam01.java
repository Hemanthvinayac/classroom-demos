package com.brillio.training.programs;

import java.util.Arrays;

public class Progam01 {

	public static void incremeent(int[] ar, int by){
		for (int i = 0; i < ar.length; i++) {
			ar[i]+=by;
		}
	}
	
	
	public static void main(String[] args) {
		//n is a reference to an array object
		int n[];
		n = new int[3];
		//n = {12,3,4};
		//n = new int[3]{32,54,556};
		n = new int[]{32,54,556};
		n[2] = 32;
		n[0] = 8;
		n[1] = 12;
		
		int index = 2;
		System.out.println(n[index]);
		
		System.out.println(Arrays.toString(n));
		incremeent(n, 10);
		System.out.println(Arrays.toString(n));
		
		
		//n[-2] = 323;// throws ArrayIndexOutOfBound Exception
		
		
	//	n[3] = 56;// throws ArrayIndexOutOfBound Exception
		
		
	}
}
