/*
draw a pattern:

0
01
024
0369
0481216


*/

class Pattern29
{
	public static void main(String args[])
	{
		int k;
		for(int i=1;i<=5;i++)
		{
			k=0;
			for(int j=1;j<=5;j++)
			{
				if(j<=i)
				{
					System.out.print(k);
					k=k+i-1;
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
