 package Stream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreams {
	
 public static void main(String[] args) {
 	try {
 	FileOutputStream file=new FileOutputStream("test.txt");
		String string="My name is faizan\n";
		byte []b=string.getBytes();// array of byte value of string to write
 		// first method to write
		for(byte a:b) {
		file.write(a);
 		}
 		// second method to write
 		String string2="This is file 2\n";
 		file.write(string2.getBytes()); 		// third method to write
		String string3="This is written by method 3";
 		byte []b2=string3.getBytes();
 		file.write(b2,19,string3.length()-19);
 		file.close();
 	}
 	catch (FileNotFoundException e) {
		
		System.out.println("File is not present");
 	}
 	catch (IOException e) {
	
 		System.out.println("Unable to give input or take output from file");
 	}

 	// The following code is for reading the file
 	try{
 		FileInputStream fis=new FileInputStream("test.txt");
 		// for reading we must have a byte array
 		byte []read=new byte[fis.available()];// available fn gives the size of content of file
 		fis.read(read);
 		//converting to string for the displaying purpose
 		String filecontent=new String(read);
 		System.out.println(filecontent);
 		// another way of reading file
 		int x;
 		while ((x=fis.read())!=-1) {
 			System.out.println((char)x);
 			// here we have to typecast as the file content is in byte form not in string
 		}

 		fis.close();
 	}
 	catch(FileNotFoundException e){
 		System.out.println("File is not present");
 	}
 	catch(IOException e){
 		System.out.println("Error in reading file");
 	}
	
 	}
 }
