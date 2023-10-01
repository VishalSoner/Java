static class Q12_Static_Class
{
	int x = 100;
	public static void main(String args[])
	{
		Q11_Static_Class q11 = new Q11_Static_Class();
		
		System.out.println("X : " + q11.x );
	}
}

/* 

Output : 
error: modifier static not allowed here
static class Q12_Static_Class
       ^

------------------------------------------------------------------------------------
*/


