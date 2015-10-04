package com.brillio.training.excercise;

import java.util.Arrays;





public class Excercise {
	
	public static int[] arrayMerging(int[] x, int[] y){
		
		int[] n =new  int[1];
		
		if(x == null){
			x = n;
		}
		
		if(y == null){
			y=n;
		}
		
		
		int[] temp = new int[x.length+y.length] ;
		int k=0, count=0;
		for (int i = 0; i < x.length; i++) {
			if(x[i]%2 != 0){
				temp[k++] = x[i]; 
				count++;
			}
		}
		for (int i = 0; i < y.length; i++) {
			if(y[i]%2 !=0){
				temp[k++] = y[i];
				count++;
			}
		}
		int[] t = new int[count];
		for (int i = 0; i < t.length; i++) {
			t[i] = temp[i];
		}
		return t;
	}
	
	public static int[] smallest(int[] x, int[] y){
		
		
		if(x == null){
			return y;
		}
		
		if(y == null){
			return x;
		}
		
		
		int[] temp;
		int n;
		if(x.length >y.length){
			 temp = new int[x.length];
			 temp =x;
			 n =y.length;
		}else{
			 temp = new int[y.length];
			 temp =y;
			 n =x.length;
		}
		
		for (int i = 0; i < n; i++) {
			if(x[i]<y[i]){
				temp[i] = x[i];
			}else{
				temp[i] = y[i];
			}
		}
		
		return temp;
	}
	
	static int[] sum(int[] a){
		
		int[] n =new  int[1];
		
		if(a == null){
			a = n;
		}
		
		int[] tmp = new int[2];
		
		for (int i = 0; i < a.length; i++) {
			if(a[i]%2 == 0){
				tmp[0]= tmp[0]+a[i];
			}else{
				tmp[1] = tmp[1]+a[i];
			}
		}
		
		return tmp;
	}
	
	
	static String toWord(int a){
		String str ="";
		int pos =0;
		while(a>=1){
			str = print(a%10, pos, str);
			a=a/10;
			pos++;
		}
		
		
		return str;
	}
	
	private static String print(int i, int pos, String str) {
		switch(pos){
		case 0:{
			switch(i){
			case 0: {
				str = str+"zero";
			}break;
			case 1:{
				str = str+"one";
			}break;
			case 2:{
				str = str+"two";
			}break;
			case 3:{
				str = str+"three";
			}break;
			case 4:{
				str = str+"four";
			}break;
			case 5:{
				str = str+"five";
			}break;
			case 6:{
				str = str+"six";
			}break;
			case 7:{
				str = str+"seven";
			}break;
			case 8:{
				str = str+"eight";
			}break;
			case 9:{
				str = str+"nine";
			}
			}
			
		}break;
		case 1:{
			switch(i){
			case 0: {
				str = str+"";
			}break;
			case 1:{
				str = str+"one";
			}break;
			case 2:{
				str = str+"twenty";
			}break;
			case 3:{
				str = str+"thirty";
			}break;
			case 4:{
				str = str+"fourty";
			}break;
			case 5:{
				str = str+"fifty";
			}break;
			case 6:{
				str = str+"sixty";
			}break;
			case 7:{
				str = str+"seventy";
			}break;
			case 8:{
				str = str+"eighty";
			}break;
			case 9:{
				str = str+"ninty";
			}
			}
			
		}
		}
		return str;
	}

	static boolean palin(int[] a){
		
		for (int i = 0, j=a.length-1; i <=a.length/2; i++,j--) {
			if(a[i] != a[j]){
				return false;
			}
		}	
		return true;
	}
	
	public static void main(String[] args) {
		int[] a ={9, 69, 40, 31, 18, 69};
		int[] b ={5, 75, 18, 18, 14, 82};
		int[] v = {12, 23, 12, 10};
		int[] result = smallest(a,b);
		result = sum(v);
		System.out.println("word "+toWord(12));
		System.out.println(palin(v));
		System.out.println(Arrays.toString(result));
	}
}
