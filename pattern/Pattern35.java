/*
draw a pattern:

1
62
1073
131184
15141295

*/


class Pattern35
{
	public static void main(String args[])
	{
		int k=1,p;
		for(int i=1;i<=5;i++)
		{
			p=k;
			for(int j=1;j<=5;j++)
			{
				if(j<=i)
				{
					System.out.print(p);
					p=p-(5+j-i);   //jem j vadhe tem tem print karavu.
				}
				
				else
				{
					System.out.print(" ");
				}
			}
			k=k+6-i;   //jayre navi line bane tayare print value karvanu logic....
			System.out.println();
		}
		
		
	}
}
//------------------------------------------------------------------------
/*
user je input kare tetali row print thaay tenu logic...


import java.util.*;
class Pattern35
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a value of n:");
		int n=sc.nextInt();
		int k=1,p;
		for(int i=1;i<=n;i++)
		{
			p=k;
			for(int j=1;j<=n;j++)
			{
				if(j<=i)
				{
					System.out.print(p);
					p=p-(n+j-i);   //jem j vadhe tem tem print karavanu logic....
				}
				
				else
				{
					System.out.print(" ");
				}
			}
			k=k+n+1-i;   //jayre navi line bane tayare print value karvanu logic....
			System.out.println();
		}
		
		
	}
}*/
