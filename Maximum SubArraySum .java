import java.io.*;
import java.util.*;

class maxSubArray{

	static int maxSubArraySum(int a[], int size)
	{
	int max_so_far = a[0];
	int curr_max = a[0];

	for (int i = 1; i < size; i++)
	{
		curr_max = Math.max(a[i], curr_max+a[i]);
		max_so_far = Math.max(max_so_far, curr_max);
	}
	return max_so_far;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int []a = new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int max_sum = maxSubArraySum(a, n);
		System.out.println(max_sum);
	}
}
Input and Output Format
// if the input n is 3
// {-3,-1,-2}
//output will be -1 .
