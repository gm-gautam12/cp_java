/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class lucky_division
{
    public static boolean check(String str){
        
        int []arr=new int[10];
        for(int i=0;i<str.length();i++){
            arr[str.charAt(i)-'0']++;
        }
        
        for(int i=0;i<10;i++){
            if(i!=4 && i!=7){
                if(arr[i]>0)
                return false;
            }
        }
        
        return true;
    }
    
	public static void main(String[] args) {
	//	System.out.println("Hello World");
	  Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
	  boolean flag=false;
	  for(int i=1;i<=n;i++){
	      if(check(Integer.toString(i)))
	      {
	          if(n%i==0)
	          {
	              flag=true;
	              break;
	          }
	      }
	  }
	  
	  if(flag)
	  System.out.println("YES");
	  else
	  System.out.println("NO");

      sc.close();
	}
}
