package conditional;
import java.util.Scanner;


public class NumberCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no");
		int n = sc.nextInt();
		int count =0;
		while(n>0)
		{
			count++;
			n=n/10;
		}
		System.out.println("total digit is: "+count);

	}

}
