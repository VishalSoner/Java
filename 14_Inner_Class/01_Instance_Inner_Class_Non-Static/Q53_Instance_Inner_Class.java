
class Q53_Instance_Inner_Class
{
	class A
	{
		void show()
		{
			
		}
	}
	public static void main( String args[])
	{
		A a = new A();
		
		A.C c = a.new C();
		
	}
}

/*


 A.C is not abstract and does not override abstract method show() in A.B
        class C extends B
        ^
--------------------------------------------------------------------------------------
*/







