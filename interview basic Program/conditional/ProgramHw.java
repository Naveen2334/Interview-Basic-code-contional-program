package conditional;
import java.util.Scanner;
//WAJP TO PRINT FACTOR OF ALL NUMBER

public class ProgramHw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc =new Scanner(System.in);
	System.out.println("enter the value of you want to calculate factor");
	int a = sc.nextInt();
	int i =1;
	while(i < a/2)
	{
		if(a%i==0)
		{
			System.out.println("factors are  ::::::"+i);
		}
		i++;
	}

	}

}
