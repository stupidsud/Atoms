/* package codechef; // don't place package name! */

import java.util.*;
import java.util.Scanner;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    
    public static int fact(int n){
        int rv = 1;
        
        for(int i = 1; i<= n; i++){
            rv *= i;
        }
        
        return rv;
    }
    
    public static int npr(int n, int r){
        int factn = fact(n);
        int factnmr = fact(n-r);
        
        int npr = factn/factnmr;
        
        return npr;
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc  = new Scanner(System.in);
		int n = sc.nextInt();
		int r = sc.nextInt();
		
		System.out.println(npr(n, r));
	}
}
