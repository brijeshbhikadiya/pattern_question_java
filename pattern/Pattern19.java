/*
draw a pattern:

\*****/
*\***/*
**\*/**
***\***
**/*\**
*/***\*
/*****\

*/

class Pattern19
{
	public static void main(String args[])
	{
		for(int i=1;i<=7;i++)
		{
			for(int j=1;j<=7;j++)
			{
				if(j==i||j==8-i)
				{
					//System.out.print(" ");
					if(j==i)
					{
						System.out.print("\\");
					}
					else
					{
						System.out.print("/");
					}
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}