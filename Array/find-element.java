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
		
		int x = sc.nextInt();

		int result = find(arr, x);
		System.out.println(result);
	}
	
	static int find(int[] arr, int x){
	    for(int i = 0; i<arr.length;i++){
		    if(arr[i] == x){
		        return i;
		    }
	    }
	    return -1;
    }
}
