package conditional;
import java.util.Scanner;


public class ProfitAndLoss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the value of sp");
		double sp = sc.nextDouble();
		System.out.println("enter the value of cp");
		double cp = sc.nextDouble();
		if (sp>cp)
		{
		System.out.println("profit"+(sp-cp));
		System.out.println("profit%"+((sp-cp)/cp)*100);
		}
		else if(cp>sp)
		{
			System.out.println("loss"+(cp-sp));
		System.out.println("loss%"+((cp-sp)/cp)*100);
		}
		else
		{
			System.out.println("no profit no loss");
		}
		
		

	}

}
