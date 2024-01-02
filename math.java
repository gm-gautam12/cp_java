/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class math
{
    public static void swap(char []ch,int a,int b)
    {
        char temp=ch[a];
        ch[a]=ch[b];
        ch[b]=temp;
    }
	public static void main(String[] args) {
		//System.out.println("Hello World");
	  Scanner sc=new Scanner(System.in);
	//  int n=sc.nextInt();
	  String str=sc.next();
	  
	 if(str.length()==1)
	 System.out.println(str);
	 
	 char []ch=str.toCharArray();
	 for(int i=0;i<ch.length;i+=2)
	 {
	     for(int j=i+2;j<ch.length;j+=2)
	     {
	         if(ch[i]>ch[j])
	         swap(ch,i,j);
	     }
	 }
	 for(int i=0;i<ch.length;i++)
	 {
	     System.out.print(ch[i]+" ");
	 }
	 sc.close();
	}
}
