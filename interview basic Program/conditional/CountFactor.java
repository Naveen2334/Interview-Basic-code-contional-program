package conditional;
import java.util.Scanner;

public class CountFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i =1;
		int count =0;
		while(i<n/2)
		{
			if(n%i==0)
			{
				count++;
			}
			i++;
		}System.out.println("total factor ::::::"+count);

	}

}
