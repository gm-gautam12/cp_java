import java.util.*;
public class bitmagic{

public static int bitMagic(int n, int[] arr) {
    // code here
    int count=0;
    
    int i=0,j=n-i-1;
    while(i<j)
    {
        if(arr[i]==arr[j])
        {
            i++;
            j--;
        }
        else
        {
            if(arr[i]==0 && arr[j]==1)
            {
               arr[i]=arr[i]^arr[j];
               count++;
            }
            else if(arr[j]==0 && arr[i]==1){
                arr[j]=arr[i]^arr[j];
                count++;
            }
            
            i++;
           j--;
        }
        
    }
    return count;
}   
    

    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
         
        System.out.println(bitMagic(n,arr));
        sc.close();
    }


}