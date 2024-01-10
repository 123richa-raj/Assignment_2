package Assignment_2;
import java.util.*;
public class Print_Armstrongno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		Armstrong(n1,n2);
	}
	public static void Armstrong(int n1,int n2) {
		for(int i = n1;i<=n2;i++) {
			int x = i;
			int count = 0;
			while(x>0) {
				x/=10;
				count++;
				
			}
			int sum=0;
			x=i;
			while(x>0) {
				int rem=x%10;
				sum=(int)(sum+Math.pow(count, rem));
				x=x/10;
			}
			if(sum==i) {
				System.out.println(i+" ");
			}
		}
	}

}
