import java.util.*;
public class matchedbracket {
    
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();

        long curr_depth=0, max_depth=0, index=-1;

        for(int i=0;i<n;i++)
        {
            if(arr[i]==1){
            curr_depth++;
            if(curr_depth>max_depth){
            max_depth=curr_depth;
            index=i+1;
            }
        }
            else
            curr_depth--;
            
        }
        System.out.print(max_depth+" "+index);

        long max_length=0;
        index=-1;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==1)
            {
                curr_depth=0;
                int length=0,j=0;
                for( j=i;j<n;j++)
                {
                    if(arr[j]==1)
                    curr_depth++;
                    else
                    {
                        length+=2;
                        curr_depth--;
                    }
                    if(curr_depth==0)
                    break;
                }
                if(length>max_length){
                max_length=length;
                index=i+1;
                }
                i=j;
            }
           
        }
        System.out.print(" "+max_length+" "+index);

        sc.close();
    }
}
