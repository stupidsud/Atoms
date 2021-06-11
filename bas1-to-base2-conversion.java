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
    
    public static int getValueInDecimal(int n, int base){
        
        int rv = 0;
        int p = 1;
        
        while(n>0){
            int digit = n%10;
            n /= 10;
            
            rv += digit*p;
            p *= base;
        }
        return rv;
    }
    
    public static int convertBas1ToBase2(int n, int base1, int base2){
        
        int decimalValue = getValueInDecimal(n, base1);
        int destinationValue = getValueInBase(decimalValue, base2);
        
        return destinationValue;
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int base1 = sc.nextInt();
		int base2 = sc.nextInt();
		System.out.println(convertBas1ToBase2(n, base1, base2));
	}
}
