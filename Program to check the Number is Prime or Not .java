import java.util.*;

/**
 *
 * <<< Nag >>>
 *
 */
public class checkPrime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<2){
            System.out.println("Not a prime!! ");
            sc.close();
                return;
        }
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                System.out.println("Not a prime!! ");
                sc.close();
                return;
            }
        } 
       System.out.println("Number is Prime!! ");
       sc.close();
    }
}
