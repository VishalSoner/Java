class A
{
	int x, y;
	void set(int x, int y)
	{
		x = x;
		y = y;
	}
	
	void show()
	{
		System.out.println("X : " + x);
		System.out.println("Y : " + y);
	}	
}

class Q03_OOPS
{
	public static void main(String args[])
	{
		A a = new A();
		a.show();
		a.set(10, 20);
		a.show();
		
	}
}

/* 
Output :- 

X : 0
Y : 0
X : 0
Y : 0

--------------------------------------------------------------------------------------------- 
*/




