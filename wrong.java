/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class wrong
{
	public static void main(String[] args) {
	//	System.out.println("Hello World");
	  Scanner sc=new Scanner(System.in);
	   int n=sc.nextInt();
	   int k=sc.nextInt();
	   
	   while(k!=0)
	   {
	       if(n%10!=0)
	       {
	           n=n-1;
	       }
	       else
	       n=n/10;
	       k--;
	   }
	   System.out.println(n);
	   sc.close();
	}
}
