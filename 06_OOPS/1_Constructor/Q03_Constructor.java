class A
{
	int x, y;
	A(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	void show()
	{
		System.out.println(x);
		System.out.println(y);
	}	
}

class Q03_Constructor
{
	public static void main(String args[])
	{
		A a = new A(10, 20);
		a.show();
		
	}
}

/* 
Output :- 
10
20

--------------------------------------------------------------------------------------------- 
*/




