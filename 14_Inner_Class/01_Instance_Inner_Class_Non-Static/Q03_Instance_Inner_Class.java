/* 
1. We can't Declare main method in inner class.
2. We can't Create Static method in inner class. 

*/

class Q03_Instance_Inner_Class
{
	class A
	{
		public static void main( String args[])
		{
			System.out.println("Vishal Soner");
		}
	}
}

/* 

error: Illegal static declaration in inner class Q03_Instance_Inner_Class.A
                public static void main( String args[])
--------------------------------------------------------------------------------------
*/







