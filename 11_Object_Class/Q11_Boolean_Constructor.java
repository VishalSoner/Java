
class Q11_Boolean_Constructor
{
	public static void main(String args[])
	{
		Boolean b1 = new Boolean("ram"); 
		Boolean b2 = new Boolean("Sita"); 
		
		System.out.println(b1);
		System.out.println(b2);
	}
}


/*

false
false



Jab ham Boolean class ka Object create  karet tiem constructor me jo v pass karenege
true ke alawa baha ushe false hi lega

And Boolean class ne toString class ko esha tarah overRide kar ke rakha he ki jo pass karenege bahi return karenga
--------------------------------------------------------------
*/
