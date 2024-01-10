package Assignment_2;
import java.util.*;
public class Chewbacca_and_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner s = new Scanner(System.in);
		        long n = s.nextLong();
		        long ans = 0;
		        long mul = 1;
		        while (n > 9) {
		            int rem = (int) (n % 10);
		            if (rem >= 5) {
		                int t = 9 - rem;
		                ans = ans + t * mul;
		            } else {
		                ans = ans + rem * mul;
		            }
		            mul = mul * 10;
		            n = n / 10;
		        }
		        if (n == 9 || n < 5) {
		            ans = ans + n * mul;
		            System.out.println(ans);
		        }
		        else {
		            int t = (int) (9 - n);
		            ans=ans+mul*t;
		            System.out.println(ans);
		        }
	}
}