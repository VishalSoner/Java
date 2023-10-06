class A
{
	int x, y;
	A get(int x, int y)
	{
		this.x = x;
		this.y = y;
		return new A();
	}
	
	void show()
	{
		System.out.println("X : " + x);
		System.out.println("Y : " + y);
	}
	
}

class Q12_Method_Chaining
{
	public static void main(String args[])
	{
		new A().get(10, 20).show();
	}
}
/* 
X : 0
Y : 0
--------------------------------------------------------------------------------------------- 
*/




