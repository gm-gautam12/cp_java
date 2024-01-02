/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class B_Interesting_drink
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []arr=new int[n];
		for(int i=0;i<n;i++)
		arr[i]=sc.nextInt();
		int q=sc.nextInt();
		
		for(int i=0;i<q;i++)
		{
		    int x=sc.nextInt();
		    int count=0;
		    for(int j=0;j<n;j++)
		    {
		        if(arr[j]<=x)
		        count++;
		    }
		    
		    System.out.println(count);
		}
        sc.close();
	}
}
