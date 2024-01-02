import java.util.*;
public class coffee {
    
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);

          int n=sc.nextInt();
            int k=sc.nextInt();
            int q=sc.nextInt();

            int []frequency=new int[200005];
            while(n-->0)
            {
                int l=sc.nextInt();
                int r=sc.nextInt();

                frequency[l]++;
                frequency[r+1]--;
            }

            int count=0;
            for(int i=0;i<frequency.length;i++)
            {
                count+=frequency[i];

                frequency[i]=(count>=k)?1:0;
            }

            int []question=new int[200005];
            for(int i=1;i<question.length;i++)
            {
                question[i]=frequency[i-1]+question[i-1];
            }

            while(q-->0)
            {
                int a=sc.nextInt();
                int b=sc.nextInt();

                System.out.println(question[b+1]-question[a]);
            }
        
        sc.close();

    }
}
