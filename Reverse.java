package Assignment_2;
import java.util.*;
public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int reverse = 0;
		for(;n!=0 ; n/=10) {
			int remainder = n%10;
			reverse = reverse*10+remainder;
		}
		System.out.println(reverse);
	}
}
