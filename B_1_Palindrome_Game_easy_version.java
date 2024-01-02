import java.util.*;
public class B_1_Palindrome_Game_easy_version{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            String str=sc.next();

           int zero=0,one=0;
           for(int i=0;i<n;i++)
           {
            if(str.charAt(i)=='0')
            zero++;
            else
            one++;
           }

           if(zero%2==0)
           System.out.println("BOB");
           else if(zero%2!=0 && zero!=1)
           System.out.println("ALICE");
           else
           System.out.println("BOB");
        }
        sc.close();
    }
}