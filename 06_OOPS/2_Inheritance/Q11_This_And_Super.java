lass A
{
	int x = 30;
}

class B extends A
{
	int x = 20;
	
	void show()
	{
		int x = 10;
		
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(super.x);
		show2();
	}
	
	void show2()
	{
		System.out.println(super.x);
	}
}

class Q11_This_And_Super
{
	public static void main(String args[])
	{
		B b = new B();
		
		b.show();
	}	
}




/* 
10
20
30
30
*/
// ------------------------------------------------------------------------------------------------








