/*
draw a pattern:

   1
  A B
 1 2 3
A B C D

*/

class Pattern33
{
	public static void main(String args[])
	{
		int k=1,x,h;
		for(int i=1;i<=4;i++)
		{
			h=1;
			x='A';
			for(int j=1;j<=7;j++)
			{
				if(j>=5-i&&j<=3+i&&k==1)
				{
					if(i%2==0)
					{
					System.out.print((char)x);
					x++;
					}
					else
					{
						System.out.print(h);
						h++;
					}
					k=0;
				}
				else
				{
					System.out.print(" ");
					k=1;
				}
			}
			System.out.println();
		}
		
		
	}
}
