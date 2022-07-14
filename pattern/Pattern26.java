/* draw a pattern
   1
  212
 32123
4321234
*/

class Pattern26
{
	public static void main(String args[])
	{
		int k;
		for(int i=1;i<=4;i++)
		{
			k=i;
			for(int j=1;j<=7;j++)
			{
				if(j>=5-i&&j<=3+i)
				{
					System.out.print(k);
					if(j<4)
					{
						k--;
					}
					else
					{
						k++;
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
