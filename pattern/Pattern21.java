/*
draw a pattern:

   A
  ABA
 ABCBA
ABCDCBA


*/

class Pattern21
{
	public static void main(String args[])
	{
		int x='A';
		for(int i=1;i<=4;i++)
		{
			x='A';
			for(int j=1;j<=7;j++)
			{
				if(j>=5-i&&j<=3+i)
				{
					System.out.print((char)x);
					if(j<4)
					{
					x++;
					}
					else
					{
						x--;
					}
					
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