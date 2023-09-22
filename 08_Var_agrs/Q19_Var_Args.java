class A
{
	void show(int[] ...a)
	{
		int count = 0;
		
		for(int i[] : a)
		{
			for(int j : i)
			{
				count += j;
			}
		}
		System.out.println("Sum : " + count);
	} 	
	
	void show(int[][] ...a)
	{
		int count = 0;
		
		for(int i[][] : a)
		{
			for(int j[] : i)
			{
				for(int k : j)
				{
					count += k;
				}
			}
		}
		System.out.println("Sum : " + count);
	} 
}

class Q19_Var_Args
{
	public static void main(String args[])
	{
		A a = new A();

		int x1[][] = { {10, 20, 30},
					  {40, 50, 60}  };
		a.show(x1);
		
		int x2[][][] = { { {10, 20}, {30, 40} },
						 { {50, 60}, {70, 80} },
						 { {90, 100}, {110, 120} }};
		a.show(x2);
	}
}

/* 
Output :- 

Sum : 210
Sum : 780
-------------------------------------------------------------------
*/




