 /*   
 
draw a pattern 
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *  

*/
 
 
 
 
 class Pattern11
{
	public static void main(String args[])
	{
		int k=0;
		for(int i=1;i<=7;i++)
		{
			if(i>4)
			{
				k--;
			}
			else
			{
				k++;
			}
			for(int j=1;j<=7;j++)
			{
				if(j>=5-k&&j<=3+k)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}




/* import java.util.*;
class Pattern11
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("how many rows are you print:");
		int rows=sc.nextInt();
		int n=(rows+1)/2;
		int k=0;
		for(int i=1;i<=rows;i++)
		{
			if(i>n)
			{
				k--;
			}
			else
			{
				k++;
			}
			for(int j=1;j<=rows;j++)
			{
				if(j>=(n+1)-k&&j<=(n-1)+k)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
} */