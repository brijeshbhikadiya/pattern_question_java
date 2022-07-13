/*
draw a pattern:

A
BA
CBA
DCBA


*/

class Pattern25
{
	public static void main(String args[])
	{
		int k='A';
		for(int i=1;i<=4;i++)
		{
			k=64+i;
			for(int j=1;j<=4;j++)
			{
				if(j<=i)
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