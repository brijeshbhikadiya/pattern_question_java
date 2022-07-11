/*   
 
draw a pattern 
*
**
***
****
*****   

*/
import java.util.*;

class Pattern1
{
	public static void main(String args[])
	{		
		for(int i=1;i<=5;i++)        //i is denoted by row.
		{
			for(int j=1;j<=5;j++)   //j is denoted by column.
			{
				if(j<=i)
				System.out.print("*");
				else
				System.out.print(" ");
			}
			System.out.println();   //that is the logic of only 5 lines print.
		}
	}
}




/* class Pattern1
{
	public static void main(String args[])
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of lines");
		n=sc.nextInt();              //that is the logic of n lines
		
		for(int i=1;i<=n;i++)        //i is denoted by row.
		{
			for(int j=1;j<=n;j++)   //j is denoted by column.
			{
				if(j<=i)
				System.out.print("*");
				else
				System.out.print(" ");
			}
			System.out.println();
		}
	}
} */