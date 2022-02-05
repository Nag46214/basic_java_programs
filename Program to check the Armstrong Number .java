import java.util.*;
/*
 *
 * <<< Nag >>>
 *
 */
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n=sc.nextInt();
        long sum=0,res,temp=n;
        while(n>0){
            res=n%10;
            sum+=(res*res*res);
            n/=10;           
        }
       if(temp==sum){
            System.out.println("Armstrong");
        }else{
            System.out.println("Not Armstrong");
        }
       sc.close();
    }   
}
