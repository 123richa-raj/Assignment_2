package Assignment_2;
import java.util.*;
public class Simple_Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner scn = new Scanner(System.in);
		        int n;
		        int sum = 0;

		        while(scn.hasNextInt())
		        {
		            n = scn.nextInt();
		            sum = sum + n;
		            if(n > -1000 && n < 1000)
		            {
		                if(sum >= 0)
		                {
		                    System.out.println(n);
		                }
		                else
		                {
		                    break;
		                }
		            }
		        }
	}
}
