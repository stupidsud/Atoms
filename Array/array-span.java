/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0;i<arr.length;i++){
		    arr[i] = sc.nextInt();
		}
		
		int max = arr[0];
		int min = arr[0];
		for(int i = 0; i<arr.length;i++){
		    if(arr[i]>max){
		        max = arr[i];
		    }
		    if(arr[i]<min){
		        min = arr[i];
		    }
		}
		
		int span = max - min;
		System.out.println(span);
	}
}
