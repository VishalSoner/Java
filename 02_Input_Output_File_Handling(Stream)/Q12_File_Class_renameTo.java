import java.io.*;

class Q12_File_Class_renameTo
{
	public static void main( String args[])
	{
		File f1 = new File("D:/2_All_Code/02_Input_Output_File_Handling(Stream)/A.Vishal Soner");
		File f2 = new File("D:/2_All_Code/02_Input_Output_File_Handling(Stream)/Vishal Soner");
		
		boolean b1 = f1.renameTo(f2);
		if( b1 )
		{
			System.out.println("Folder Name Changed");
		}
		else 
		{
			System.out.println("Folder Name Already Changed");
		}
	}
}

/*
// 01  run		true
Folder Name Changed


// 02 run		false.
Folder Name Already Changed



"D:/2_All_Code/02_Input_Output_File_Handling(Stream)/(A.Vishal Soner");
"E:/2_All_Code/02_Input_Output_File_Handling(Stream)/Vishal Soner");

Ye Folder ka Name change kar ke Directry v cahange kar degi.( D se E me dal Dega).

----------------------------------------
*/







