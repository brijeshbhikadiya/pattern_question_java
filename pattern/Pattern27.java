/*
draw a pattern:

1
3*2
4*5*6
8*7*6*5
9*10*11*12*13


*/

class Pattern27
{
	public static void main(String args[])
	{
		int k=0;
		for(int i=1;i<=5;i++)
		{
			if(i%2==0)
			{
				k=k+1;
			}
			else
			{
				k=k+i;
			}
			for(int j=1;j<=9;j++)
			{
				if(j<=2*i-1)
				{
					if(j%2==0)
					System.out.print("*");
					else
					{
						System.out.print(k);
						if(i%2==0)
						{
							k--;
						}
						else
						{
							k++;
						}
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
