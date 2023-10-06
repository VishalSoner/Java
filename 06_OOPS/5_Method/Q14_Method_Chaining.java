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

class Q14_Method_Chaining
{
	public static void main(String args[])
	{
		new A().get(10, 20).show().show();
	}
}
/* 
error: void cannot be dereferenced
      new A().get(10, 20).show().show();
	                             ^
--------------------------------------------------------------------------------------------- 
*/




