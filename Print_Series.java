package Assignment_2;
import java.util.*;
public class Print_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner s= new Scanner(System.in);
				int n1=s.nextInt();
				int n2=s.nextInt();
				int i =1;
		        int count=0;
				while(i<=n1+count) {
					int r=3*i+2;
					if(r%n2!=0) {
						System.out.println(r);
					}else{
		                count++;
		            }
					i++;
				}
	}
}