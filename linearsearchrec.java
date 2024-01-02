public class linearsearchrec {
    
    public static boolean find(int i,int n,int []arr,int x)
    {
        if(i==n)
        return false; //reached end 
        if(arr[i]==x)
        return true;

        return find(i+1,n,arr,x);

    }
    public static void main(String []args)
    {
        int i=0;
        int n=5;
        int []arr={2,67,7,3,1};
        int x=3;
        System.out.println(find(i,n,arr,x));
    


    }
}
