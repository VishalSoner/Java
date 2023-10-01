/*

To read / write the Primitive Data We use ,
	DataInputStream   :  is given for reading Primitive data.
	DataOutputStream  :  is given for Writing Primitive data.

------------------------------------------------------
	
	
To read / write  the Non - Primitive Object We use , 
	ObjectInputStream   :    is given for reading non-Primitive Object from file.
	ObjectOutputStream  :    is given for writing non-Primitive Object from file.

*/

import java.io.*;

class Q30_DataOutputStream
{
	public static void main( String args[]) throws IOException
	{
		int x = 100;
		float y = 10.50f;
		boolean tr = true;
		
		FileOutputStream fs = new FileOutputStream("D:/2_All_Code/02_Input_Output_File_Handling(Stream)/Demo2.txt");
		//Store Primitive Type Data Using FileOutputStream (Error)
		
		fs.write(x);
		fs.write(y);
		fs.write(tr);
		fs.close();
		
	}
}

/*


error: no suitable method found for write(float)
    fs.write(y);
      ^
error: no suitable method found for write(boolean)
    fs.write(tr);
      ^

----------------------------------------
*/







