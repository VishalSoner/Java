class Q10_Instance_Inner_Class
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
		Q10_Instance q10 = new Q10_Instance();
		
		System.out.println("X : " + q10.x);
		q10.show();
		
		A a1 = q10.new A();
		a1.show1();
		
	}
}

/* 
 
X : 10
Show Method - 0
Show Method - 1
 
 
--------------------------------------------------------------------------------------
*/







