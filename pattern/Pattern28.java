/*
draw a pattern:

    A
   CB
  FED
 JIHG
ONMLK


*/

class Pattern28
{
	public static void main(String args[])
	{
		int k=64;
		for(int i=1;i<=5;i++)
		{
			k=k+2*(i-1)+1;
			for(int j=1;j<=5;j++)
			{
				if(j>=6-i)
				{
					System.out.print((char)k);
					k--;
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
