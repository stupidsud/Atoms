/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static int getValueInBase(int n, int base){
        
        int rv = 0;
        int p = 1;
        
        while(n>0){
            int digit = n%base;
            n /= base;
            
            rv += digit*p;
            p *= 10;
        }
        return rv;
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int base = sc.nextInt();
		System.out.println(getValueInBase(n,base));
	}
}
