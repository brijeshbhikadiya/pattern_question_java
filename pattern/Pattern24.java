/*
draw a pattern:

   1
  12A
 123AB
1234ABC


*/

class Pattern24
{
	public static void main(String args[])
	{
		int k,x;
		for(int i=1;i<=4;i++)
		{
			k=1;
			x='A';
			for(int j=1;j<=7;j++)
			{
				if(j>=5-i&&j<=3+i)
				{
					if(j<=4)
					{
						System.out.print(k);
						k++;
					}
					else
					{
						System.out.print((char)x);
						x++;
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