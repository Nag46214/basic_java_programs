import java.util.*;
public class maxEle
{
        public static int getLargest(int[] a, int n){
            Arrays.sort(a);
            return a[n-1];
        }
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int [] a = new int[n];
            for(int i=0;i<n;i++)
            {
                a[i] = sc.nextInt();
            }
            int max_element = getLargest(a,n)
            System.out.println(max_element);
    }
}
