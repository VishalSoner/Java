/*

To read the Data From File.
DataInputStream : 
	1. readByte( byte );
	2. readShort( short  );
	3. readInt ( int );
	4. readLong( long );
	5. readFloat( float );
	6. readDouble( double );
	7. readBoolean( boolean );


*/

import java.io.*;

class Q32_DataInputStream
{
	public static void main( String args[]) throws IOException
	{
		int x = 100;
		float y = 10.50f;
		boolean tr = true;
		
		FileInputStream fs = new FileInputStream("D:/2_All_Code/02_Input_Output_File_Handling(Stream)/Demo2.txt");
		
		//Read Primitive Type Data Using FileInputStream.
		DataInputStream ds = new DataInputStream(fs);
		
		System.out.println(	ds.readInt() );
		System.out.println(	ds.readFloat() );
		System.out.println(	ds.readBoolean() );
		
		ds.close();
		fs.close();
	}
}

/*

100
10.5
true

------------------------------------------------------

// DataOutputStream Se data insert to ho jayega but ham eshe file se directly access nai kar sakte he 

----------------------------------------
*/







