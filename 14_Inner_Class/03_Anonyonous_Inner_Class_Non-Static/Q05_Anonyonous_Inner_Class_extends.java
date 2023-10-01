abstract class A 
{
	abstract void show();
}

class Q05_Anonyonous_Inner_Class_extends
{
	public static void main(String args[])
	{
		A a = new A(){};
		
		System.out.println("Main Method");
	}
}

/* 

error: <anonymous Q05_Anonyonous_Inner_Class$1> is not abstract and does not override abstract method show() in A	
	A a = new A(){};
				  ^

-----------------------------------------------------------------------------------------------
*/




