package conditional;
import java.util.Scanner;

public class Powermethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value you want to calculate power");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int i =1;
		if(b==1)
		{
			
			System.out.println(a);
		}
		else
		{
			int result = (int) Math.pow(a, b);
			System.out.println(result);
		}

	}

}
