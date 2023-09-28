class Employee
{
	
}

class Q06_Object_Class_hashCode
{
	public static void main(String args[])
	{
		Employee e1 = new Employee();
		
		System.out.println(e1);
		System.out.println(e1.hashCode() );
		System.out.println( Integer.toHexString( e1.hashCode() ) );
		
	}
}


/*

Employee@15db9742
366712642
15db9742


hashCode return  :  Decimal Number and 
toString return  :  Class_Name@Hexa_Decimal_Number

toHexString return :  Decimal to Hexa_Decimal_Number

--------------------------------------------------------------
*/






