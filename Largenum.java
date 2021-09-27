/* packageLargenum; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Largenum
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes //initializing numbers to compare  
int a=40, b=78, c=19;  
//comparing numbers, a with b and a with c   
//if both conditions are true, prints a  
if(a>=b && a>=c)  
System.out.println(a+" is the largest Number");  
//comparing b with a and b with c  
//if both conditions are true, prints b  
else if (b>=a && b>=c)  
System.out.println(b+" is the largest Number");  
else  
//prints c if the above conditions are false  
System.out.println(c+" is the largest number");  
	}
}
