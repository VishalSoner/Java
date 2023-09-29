class A
{
	int x, y;
	void show()
	{
		System.out.println(x);
		System.out.println(y);
	}	
}

class Q01_Constructor
{
	public static void main(String args[])
	{
		A a = new A();
		a.x = 10;
		a.y = 20;
		a.show();
		
	}
}

/* 
Output :- 
10
20

--------------------------------------------------------------------------------------------- 
*/




