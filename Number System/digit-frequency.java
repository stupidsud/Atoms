/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static int digitFrequency(int n, int d){
        
        int rv = 0;
        
        while(n>0){
            int digit = n%10;
            n /= 10;
            
            if(digit == d){
                rv++;
            }
        }
        return rv;
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		System.out.println(digitFrequency(n,d));
	}
}
