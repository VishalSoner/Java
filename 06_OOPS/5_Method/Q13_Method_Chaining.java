class A
{
	int x, y;
	A get(int x, int y)
	{
		this.x = x;
		this.y = y;
		return this;
	}
	
	void show()
	{
		System.out.println("X : " + x);
		System.out.println("Y : " + y);
	}
	
}

class Q13_Method_Chaining
{
	public static void main(String args[])
	{
		new A().get(10, 20).show();
	}
}
/* 
X : 10
Y : 20
--------------------------------------------------------------------------------------------- 
*/




