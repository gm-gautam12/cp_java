import java.util.Scanner;
public class A_Polycarp_and_Coins{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int coin1=0,coin2=0;
            
            if(n%3==0)
            {
                coin1=n/3;
                coin2=n/3;
                System.out.println(coin2+" "+coin1);
            }
            else{
                coin1=n/3;
                coin2=(n/3) + 1;
                if(coin1+2*coin2==n)
                System.out.println(coin1+" "+coin2);
                else
                System.out.println(coin2+" "+coin1);
            }
            
            
        }
        sc.close();
    }
}