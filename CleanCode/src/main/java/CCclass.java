import java.util.*;
public class CCclass
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Principal Amount: ");
		float p= sc.nextFloat();
		System.out.println("Enter rate of interest:");
		double r=sc.nextDouble();
		System.out.println("Enter time in years");
		double t = sc.nextDouble();
		SimpleInt si= new SimpleInt();
		System.out.println("The  Simple Interest amount is:"+si.simpleinterest(p,r,t));
		CompoundInt ci = new CompoundInt();
		System.out.println("The Compound Interest amount is:"+ci.compoundinterest(p,r,t));
		System.out.println("Choose the type of materials used for construction");
		System.out.println("1.Standard");
		System.out.println("2.Above Standard");
		System.out.println("3.High Standard Materials");
		System.out.println("4.High Standard Materials and Fully Automated");
		int standard= sc.nextInt();
		System.out.println("Enter total area of house:");
		float totarea=sc.nextFloat();
		CostOfHouse hc = new CostOfHouse();
		System.out.println("Estimated Cost for Construction of House is Rs."+hc.costis(standard,totarea));
		sc.close();
	}
}
