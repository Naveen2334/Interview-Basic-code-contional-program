package conditional;
import java.util.Scanner;

public class TriangleCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of first side");
		int a = sc.nextInt();
		
		System.out.println("enter the value of 2nd side");
		int b = sc.nextInt();
		
		System.out.println("enter the value of 3rd side");
		int c = sc.nextInt();
		
		if(a==b && b==c)
		{
			System.out.println("equlateral");
			
		}
		else if(a==b||b==c||c==a)
		{
			System.out.println("isoselous");
		}
		else
		{
		System.out.println("scalene");
		}

	}

}
