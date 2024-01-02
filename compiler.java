import java.util.*;
public class compiler {
    
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            String str=sc.next();
            int sum=0,ans=0;
            for(int i=0;i<str.length();i++)
            {
                if(str.charAt(i)=='<')
                sum++;
                else
                sum--;
                if(sum<0)break;
                if(sum==0)ans=i+1;
            }
            System.out.println(ans);
        }
        sc.close();

    }
}
