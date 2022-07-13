/*
draw a pattern:

   A1
  AB12
 ABC123
ABCD1234


*/

class Pattern22
{
	public static void main(String args[])
	{
		int k,x;
		for(int i=1;i<=4;i++)
		{
			k='A';
			x=1;
			for(int j=1;j<=8;j++)
			{
				if(j>=5-i&&j<=4+i)
				{
					if(j<=4)
					{
					System.out.print((char)k);
					k++;
					}
					else
					{
						System.out.print(x);
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