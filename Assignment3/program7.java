import java.util.Scanner;
public class program7 
{

	public static void main(String[] args) 
	{
		System.out.println("No. of units consumed: ");
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		double y=0;
		double D=0;
		if (x<=50)
		{
			y = 3*x;
			//System.out.println("Monthly bill = "+y);
		}
		else if ((x>50)&&(x<=200))
		{
			y= (50*3)+((x-50)*4.80);
			//System.out.println("Monthly bill = " +y);
		}
		else if ((x>200)&&(x<=400))
		{
			y=(50*3)+(4.80*150)+((x-200)*5.80);
			//System.out.println("Monthly bill = "+y);
		}
		else
		{
			y= (50*3)+(4.80*150)+(5.80*(200)+(6.20*(x-400)));
			//System.out.println("Monthly bill = "+y);
		}
		System.out.println("Do you want to pay online(y/n): ");
		Scanner po=new Scanner(System.in);
		String s=po.nextLine();
		System.out.println("Total amount: "+y);
		if (s.equals("y"))
		{
			D=y*0.03;
			System.out.println("Discount: "+D);
			
		}
		
		else if(s.equals("n"))
		{
			D=0;
		}
		else
		{
			System.out.println("Invalid");
		}
		
		System.out.println("Amount payable: "+(y-D));
		// TODO Auto-generated method stub

	}

}
