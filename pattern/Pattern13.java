
/*
     1
    232
   34543
  4567654
*/



class Pattern13
{
	public static void main(String args[])
	{
		int k=0;
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
						k++;
					}
					else
					{
						k--;
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
