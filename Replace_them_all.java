package Assignment_2;
import java.util.*;
public class Replace_them_all {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		       Scanner sc = new Scanner(System.in);
				long n =sc.nextLong();
				long  rem = 0;
				long sum = 0;
				long c = 0;
				if(n==0) {
					System.out.println(5);
				}else {
				while(n>0)
				{
					rem=n%10;
					if(rem==0) 
					sum=sum+5*(long)Math.pow(10, c);
					else
					sum=sum+rem*(long)Math.pow(10, c);
					c++;
					n=n/10;
					
				}
				System.out.println(sum);
				}
	}
}