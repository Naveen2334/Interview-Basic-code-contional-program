package conditional;
import java.util.Scanner;

public class sumNatural {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		System.out.println("enter the value upto which you want to calculate sum");
		int n = sc.nextInt();
		int i = 0;
		while(i<=100)
		{
			double sum = ((n*(n+1))*0.5);
			System.out.println(sum);
			
			i++;
		}

	}

}
