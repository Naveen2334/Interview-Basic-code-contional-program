import java.util.Scanner;
public class SumofN-natural-no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("enter no you want to calculate factorial");
		int n = sc.nextInt();
		int sum =0;
		for(int i=1;i<=n;i++)
		{
			sum = (n*(n+1))/2;
			
		}System.out.println("sum of n natural no"+sum);

	}

}
