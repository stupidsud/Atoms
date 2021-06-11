/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{

    public static int baseAddition(int base, int n1, int n2){
        
        int rv = 0;
        int c = 0;
        int p = 1;
        
        while(n1>0 || n2>0 || c>0){
            int d1 = n1 % 10;
            int d2 = n2 % 10;
            n1 = n1 / 10;
            n2 = n2 / 10;
            
            int d = d1 + d2 + c;
            c = d / base;
            d = d % base;
            
            rv += d * p;
            p *= 10;
        }
        
        return rv;
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int base = sc.nextInt();
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
        System.out.println(baseAddition(base, n1, n2));
	}
}
