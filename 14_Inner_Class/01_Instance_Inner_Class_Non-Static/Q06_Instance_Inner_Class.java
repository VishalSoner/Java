class Q06_Instance_Inner_Class
{
	int x = 10;
	
	void show()
	{
		System.out.println("Show Method");
	}
	
	
	public static void main( String args[])
	{
		System.out.println("Vishal Soner");
		show();
	}
}

/* 

 error: non-static method show() cannot be referenced from a static context
                show();
                ^
--------------------------------------------------------------------------------------
*/







