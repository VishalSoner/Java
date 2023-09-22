import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class Q10_Input_Stream_Reader
{
	public static void main(String args[]) throws Exception
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.print("Enter Name : ");
		String name = br.readLine();
		
		System.out.print("Enter Gender : ");
		char gender = (char)br.read();
		int temp1 = br.read();
		int temp2 = br.read();
		
		System.out.print("Enter Address : ");
		String address = br.readLine();
		
		System.out.println("Name : " + name);
		System.out.println("Gender : " + gender);
		System.out.println("Address : " + address);
		
		System.out.println("temp1 : " + temp1);
		System.out.println("temp2 : " + temp2);
		
	}
}

/*	

Input :- 
Enter Name : Vishal
Enter Gender : M

Output :- 
Enter Address : Name : Vishal
Gender : M
Address :


--------------------------------------------------------------------------------------------------------------------------	*/

