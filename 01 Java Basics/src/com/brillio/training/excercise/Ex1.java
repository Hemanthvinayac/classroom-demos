package com.brillio.training.excercise;

public class Ex1 {
	public static void main(String[] args) {
		abc(100, 40, 300);
		month(-2, 0);
		futureTime(11, 2, 2, 62);
		digit(-245423423);
		SOP(-100,50);
		reverse(-132001);
		int result = binaryToDecimal(1000130000);
		System.out.println("ddsa "+result);
	}

	static void abc(int a, int b, int c) {
		if (a <= b && b <= c)
			System.out.println(a + " " + b + " " + c);
		else if (b <= a && a <= c)
			System.out.println(b + " " + a + " " + c);
		else if (c <= a && a <= b)
			System.out.println(c + " " + a + " " + b);
		else if (b <= c && c <= a)
			System.out.println(b + " " + c + " " + a);
		else if (c <= b && b <= a)
			System.out.println(c + " " + b + " " + a);
		else
			System.out.println(a + " " + c + " " + b);
	}

	static int month(int month, int year) {
		boolean flag = false;
		if (month < 1 || month > 12) {
			System.out.println("month is Invalid");
			if (year <= 0) {
				System.out.println("year is Invalid");
				return -2;
			}
			return -1;
		}
		if (year <= 0) {
			System.out.println("year is Invalid");
			return -2;
		}
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 9:
		case 11:
			System.out.print("30");
			break;
		case 4:
		case 6:
		case 8:
		case 10:
		case 12:
			System.out.print("31");
			break;
		case 2: {
			if ((year & 3) == 0 && ((year % 25) != 0 || (year & 15) == 0)) {
				flag = true;
				System.out.print("29");
			} else {
				System.out.print("28");
			}
		}
		}
		if (flag == true) {
			System.out.println(" 366");
		} else {
			System.out.println(" 365");
		}
		return 1;
	}

	static void futureTime(int h, int m, int s, int a) {
		if (h > 12 || h < 0 || m < 0 || m > 60 || s < 0 || s > 60) {
			System.out.println("Invalid time input");
			return;
		}
		h = h + a / 3600;
		m = m + (a % 3600) / 60;
		s = s + a % 60;

		System.out.println(h + " " + m + " " + s);
	}

	static void digit(long n) {

		int digit;
		long temp;

		if (n > 0) {
			for (digit = 0; digit < 9; digit++)
				for (temp = n; temp > 0; temp /= 10)
					if (temp % 10 == digit)
						System.out.print(" " + digit);
		}

		else {
			n = n * -1;
			for (digit = 9; digit > 0; digit--)
				for (temp = n; temp > 0; temp /= 10)
					if (temp % 10 == digit)
						System.out.print(" " + digit);

		}
	}
	
	static void SOP(int start, int end){
		if(start<0){
			start =2;
		}else if(end<0){
			end =2;
		}
		if(end<start){
			int temp =end;
			end = start;
			start = temp;
		}
		int sum=0;
		for (int i = start; i <=end; i++) {
			if(isprime(i)){			
				sum = sum+i;
			}
		}
		System.out.println("sum = "+sum);
	}

	private static boolean isprime(int i) {
		for (int j = 2; j <= i/2; j++) {
			if(i%j == 0)
			{
				return false;
			}
		}
		return true;
	}
	
	static void reverse(int n){
		if(n<0){
			n=n*-1;
			System.out.print("-");
		}
		while(n>=1){
			if(n%10!=0){
				
				break;
			}
			n=n/10;
		}
		int rev =0;
		while(n>=1){
				rev = (rev*10)+(n%10);
			n= n/10;
		}
		System.out.println(rev);
		}
	
		static int binaryToDecimal(int x){
		int i=0, dec=0;
			while(x>=1){
				if((x%10)>1||x<0){
					return -1;
				}
				dec =  (int) ((dec)+(x%10)*Math.pow(2, i));
				x=x/10;
				i++;
			}
			return dec;
		}
	
	}


