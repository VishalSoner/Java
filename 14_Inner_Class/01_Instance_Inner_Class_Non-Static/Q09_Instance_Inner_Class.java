class Q09_Instance_Inner_Class
{
	int x = 10;
	void show()
	{
		System.out.println("Show Method - 0");
	}
	
	class A
	{
		void show1()
		{
			System.out.println("Show Method - 1");
		}
	}
	
	public static void main( String args[])
	{
		Q09_Instance_Inner_Class q9 = new Q09_Instance_Inner_Class();
		
		System.out.println("X : " + q9.x);
		q9.show();
		
		Q09_Instance_Inner_Class.A a1 = q9.new A();
		a1.show1();
		
	}
}

/* 
 
X : 10
Show Method - 0
Show Method - 1
 
 
--------------------------------------------------------------------------------------
*/







