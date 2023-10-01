class Q10_Static_Class
{
	int x = 100;
	public static void main(String args[])
	{
		System.out.println("X : " + x );
	}
}

/* 

Output :
error: non-static variable x cannot be referenced from a static context
                System.out.println("X : " + x );
                                            ^

------------------------------------------------------------------------------------
*/


