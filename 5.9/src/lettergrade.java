import java.util.Scanner;
public class lettergrade {
	public static void main(String[] args)
	{
		int total =0;
		int gradecounter = 0;
		int acount = 0;
		int bcount = 0;
		int ccount = 0;
		int dcount = 0;
		int fcount = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.printf("enter grade, type <Ctrl> Z to enter");
		
		while (input.hasNext());
		{
			int grade = input.nextInt();
			total += grade;
			++gradecounter;
			
			switch (grade / 10)
			{
			case 9:
			case 10:
				++acount;
				break;
			case 8:
				++bcount;
				break;
			case 7:
				++ccount;
				break;
			case 6:
				++dcount;
				break;
			default:
				++fcount;
				break;				
			}
		}
		System.out.printf("grade report");
		
		if (gradecounter != 0)
		{
			double average =(double)total / gradecounter;
			System.out.printf("total of the %d grades are netered %d%n",  gradecounter, total);
			System.out.printf("class average is %.2f%n average");
			System.out.printf("%n%s%n%s%d%n%s%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n", average, "number of grades:", "a", acount,"b",bcount,"c",ccount,"d",dcount,"f",fcount );
		}
		else 
			System.out.printf("no grade entered");
	}
}
