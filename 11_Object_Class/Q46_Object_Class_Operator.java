class Q46_Object_Class_Operator
{
	public static void main(String args[])
	{
		String s1 = new String("Ram");
		StringBuffer s2 = new StringBuffer("Ram");
		
		System.out.println(s1 == s2);
	}
}


/*

error: incomparable types: String and StringBuffer
                System.out.println(s1 == s2);
                                      ^


(==) Operator Parent child relation me hi work karte he.
--------------------------------------------------------------
*/






