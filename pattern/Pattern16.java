/*
draw a pattern:

1
10
101
1010
10101
101010

*/



class Pattern16
{
	public static void main(String args[])
	{
		int x;
		for(int i=1;i<=6;i++)
		{
			x=1;
			for(int j=1;j<=6;j++)
			{
				if(j<=i)
				{
					//System.out.print(x);
					if(j%2==0)
					{
						x=0;
					}
					else
					{
						x=1;
					}
					System.out.print(x);
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