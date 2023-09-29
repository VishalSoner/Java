class Q08_Instance_Inner_Class
{
	int x = 10;
	void show()
	{
		System.out.println("Show Method");
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
		System.out.println("Vishal Soner");
		Q08_Instance_Inner_Class q8 = new Q08_Instance_Inner_Class();
		
		System.out.println("X : " + q8.x );
		q8.show();
		
		q8.show1();
		
		
	}
}

/* 
 
error: cannot find symbol
               q8.show1();
                 ^
				  
--------------------------------------------------------------------------------------
*/







