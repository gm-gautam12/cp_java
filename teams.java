import java.util.*;
public class teams{
    
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [][]arr=new int[n][3];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<3;j++)
            arr[i][j]=sc.nextInt();
        }
        
       int count=0,one=0;
       for(int i=0;i<n;i++)
       {
        for(int j=0;j<3;j++)
        {
            if(arr[i][j]==1)
            one++;
            if(one>=2){
            count++;
            one=0;
            }
        }
        one=0;
       }
       System.out.println(count);
       sc.close();
    }
}