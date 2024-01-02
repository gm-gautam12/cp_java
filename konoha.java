/* package codechef; // don't place package name! */

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class konoha
{
    public static int max(int []arr)
    {
        int max=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            max=arr[i];
        }
        return max;
    }
    public static int index(int []arr)
    {
        int index=-1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==max(arr))
            index=i;
        }
        return index;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int z=sc.nextInt();
		    
		    int []arr=new int[n];
		    for(int i=0;i<n;i++)
		    arr[i]=sc.nextInt();
		   
		   int count=0,index=0;
		   int max=arr[0];
           for(int i=0;i<n;i++)
           {
             if(arr[i]>max){
             max=arr[i];
             index=i;
             } 
           }
           while(z>=0)
           {
            z=z-max(arr);
            arr[index]=max(arr)/2;
            count++;
           }
           System.out.println(count);   
		}
        sc.close();
	}
}
