class A
{
	int x = 10;

	class B
	{
		int x = 200;
		void show1()
		{
			int x = 3000;
			System.out.println("X : " + x);
			System.out.println("X : " + this.x);
			
			System.out.println("X : " + A.this.x);
			System.out.println("X : " + B.this.x);
		}
	}
}


class Q19_Instance_Inner_Class
{
	public static void main( String args[])
	{
		A a = new A();
		
		A.B b = a.new B();
		b.show1();
	}
}

/* 
 
X : 3000
X : 200
X : 10
X : 200

--------------------------------------------------------------------------------------
*/







