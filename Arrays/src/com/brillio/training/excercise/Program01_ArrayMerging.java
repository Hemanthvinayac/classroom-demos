package com.brillio.training.excercise;

import java.util.Arrays;

public class Program01_ArrayMerging {
static int[] a={10,30,49,55,56};
static int[] b=new int[] {12,44,27};
static int count;



private static int[] merge(int[] a, int[] b) {
int[] d=new int[count];
d=a;

int index=a.length;
for (int i = 0; i < b.length; i++) {
	System.out.println(index);
d[index]=b[i];
}
return d;
}
public static void main(String[] args) {
	count=a.length+b.length;
	System.out.println(count+"sdfsdf");
	int[] c=new int[count];
c=merge(a,b);
System.out.println(Arrays.toString(c));

}


}
