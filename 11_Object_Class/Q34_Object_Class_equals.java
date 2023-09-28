class Q34_Object_Class_equals
{
	public static void main(String args[])
	{
		Double a = 10.8, b = 10.8;
		
		Double x = 100.8;
		Double y = 100.8;
		
		System.out.println( a == b);
		System.out.println( x == y);
		
		System.out.println( a.equals(b) );
		System.out.println( x.equals(y) );
		
	}
}


/*

false
false
true
true

String class ki .equals() method content compare ka kam karti he.
( == ) operator referance ko compare karta he.

--------------------------------------------------------------
*/






