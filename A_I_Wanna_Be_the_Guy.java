import java.util.*;
public class A_I_Wanna_Be_the_Guy{

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int p=sc.nextInt();
        int []arr=new int[250];

        for(int i=0;i<p;i++)
        arr[i]=sc.nextInt();

        int q=sc.nextInt();
        for(int i=p;i<p+q;i++)
        arr[i]=sc.nextInt();

        Arrays.sort(arr);

        int count=0;
        for(int i=0;i<p+q-1;i++)
        {
            if(arr[i]!=arr[i+1])
            count++;
        }

        if(n==count)
        System.out.println("I become the guy.");
        else
        System.out.println("Oh, my keyboard!");
        

       

        sc.close();
    }

}