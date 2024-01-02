/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class bit
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	
	String []str=new String[n];
	for(int i=0;i<n;i++)
	str[i]=sc.next();
	
	int count=0;
    String key1="X++";
    String key2="++X";
    String key3="--X";
    String key4="X--";

	for(int i=0;i<n;i++)
	{
	    if(str[i].equals(key1) || str[i].equals(key2))
        count++;
        else if(str[i].equals(key3) || str[i].equals(key4))
        count--;
	}
	System.out.println(count);
    sc.close();
	}
}
