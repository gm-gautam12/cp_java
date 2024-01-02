import java.util.*;
public class C_Little_Girl_and_Maximum_Sum{

    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int q=sc.nextInt();

        long []a=new long[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextLong();

        Arrays.sort(a);
        reverseArray(a);

        long []freq=new long[n];
        while(q-->0)
        {
            int l=sc.nextInt()-1;
            int r=sc.nextInt()-1;
            freq[l]++;
            if(r+1<n)
            freq[r+1]--;
        }

        long sum=0;
        List<Pair> v=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            sum+=freq[i];
            freq[i]=sum;
            v.add(new Pair(sum,i));
        }

        Collections.sort(v, Collections.reverseOrder());

        long []t=new long[n];
        long mainsum=0;
        for(int i=0;i<n;i++)
        {
            long s=v.get(i).first;
            int index=v.get(i).second;
            t[index]=a[i];
            mainsum+=(a[i]*s);
        }

        System.out.println(mainsum);
        sc.close();

    }
    static void reverseArray(long[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            long temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    static class Pair implements Comparable<Pair> {
        long first;
        int second;

        public Pair(long first, int second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public int compareTo(Pair other) {
            return Long.compare(this.first, other.first);
        }
    }
}