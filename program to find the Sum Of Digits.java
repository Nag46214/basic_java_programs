import java.util.*;
public class sumofdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int result,sum=0;
        while(num>0){
            result=num%10;   
            sum+=result;
            num/=10;
        }
        System.out.println(sum);
    }
}
/* for example num=123; it will get divided by 10 ,since the operator is modulo operator it will takes the remainder value 123%10=3;3 gets stored in result  
     after that sum will be stored with the above result and again we will perform division operation here we will get the quotient output 123/10=12;
     again 12 will undergoes modulo division inside the loop.
     */
