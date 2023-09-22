class Q18_split
{
	public static void main(String args[])
	{
		String s1 = "My Name is Vishal Soner";
		
		String str[] = s1.split("");
		
		for( String s : str)
			System.out.print( s +"  ");
		
	}
}
/*
 
M  y     N  a  m  e     i  s     V  i  s  h  a  l     S  o  n  e  r
-------------------------------------------------------- 
*/


