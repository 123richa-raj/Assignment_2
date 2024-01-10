package Assignment_2;
import java.util.*;

public class Sum_of_odd_place_and_even_place_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int p = 1;
		int sum1=0;
		int sum2=0;
		while(n>0) {
			int rem = n%10;
			if(p%2==0) {
				sum2=sum2+rem;
			}
			else {
				sum1=sum1+rem;
				
			}
			p++;
			n/=10;
		}
		System.out.println(sum1);
		System.out.println(sum2);
		

	}

}
