class Q07_Exception_Handling_Try_Finally_Catch
{
	public static void main(String args[])
	{
		System.out.println("Open");
		try
		{
			int x = Integer.parseInt(args[0]);
			int y = Integer.parseInt(args[1]);
			System.out.println("Ans : " + x/y );
		}
		finally
		{
			System.out.println("Finally Block");
		
		}
		catch(Exception e)
		{
			System.out.println("Catch Block");
		}
		System.out.println("Close");
	}
}

/* 

error: 'catch' without 'try'
    catch(Exception e)
    ^

--------------------------------------------------------------------------------------------- 
*/




