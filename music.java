/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class music
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		Scanner sc=new Scanner(System.in);
		//int t=sc.nextInt();
		//while(t-->0)
	//	{
		    int n=sc.nextInt();
		    String str=sc.next();
		    
		    StringBuilder sb=new StringBuilder(str);
		    for(int i=1;i<n+1;i=i+2)
		    {
		        sb.insert(i+1,str.charAt(i));
		    }
		    
		    System.out.println(sb);
			sc.close();
	//	}
	}
}
