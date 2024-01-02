/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

/*intution for the problem: we are 1st checking ki m ticket buy krne me a se profit h ya b se agar a win the our 
 * answer will be n*a. but agar b jeeta toh hme dhyaan rkhna hoga
 * hm sirf m ticket hi b me buy kr skte h so we will check ki n/m i.e n multiple of m h ki nhi agar hai toh
 * we can buy it with b roubles like (n/m)b but if it is not  then we will buy (n/m) times with b rubbles 
 * that will give us (n/m)m tickets. then we will check for the rest of ticket(n%m) which is minimum (n/m)a or b
 */
import java.util.*;
public class fare
{
	public static void main(String[] args) {
	//	System.out.println("Hello World");
	  Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
	  int m=sc.nextInt();
	  int a=sc.nextInt();
	  int b=sc.nextInt();
	  int fare=0;
	  if(m*a<=b)
      System.out.println(n*a);
      else{
        fare=(n/m)*b + Math.min((n%m)*a,b);
        System.out.println(fare);
      }
      sc.close();
	}
}
