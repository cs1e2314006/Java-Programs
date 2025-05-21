package Stream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
//import java.io.FileOutputStream;

public class ByteStream {
	static void ByteInput() throws Exception{
		// we can use byte stream to read or write data from an array which may available 
		//outside our program and its syntax and use is almost 
					// same as other streams like file stream
					
					byte b[]= {'f','a','i','z','a','n'};
					ByteArrayInputStream bys=new ByteArrayInputStream(b);
			// bytestream support mark this means that we can just see what is inside stream without
			// consuming the content of stream as file we have to consume the content of file while
			// moving forward means we cannot comeback and see what was the content of file 
					String str=new String(bys.readAllBytes());
					System.out.println(str);
					System.out.println(bys.markSupported());
					bys.close();
	}
	
	static void ByteOutput() throws Exception{
		ByteArrayOutputStream bos=new ByteArrayOutputStream();
		bos.write('a');
		bos.write('b');
		bos.write('c');
		bos.write('c');
		byte b[]=bos.toByteArray();// convert stream to array
		for(byte x:b) {
			System.out.println((char)x);
		}
		// we can also write this in file
//		FileOutputStream f1=new FileOutputStream("Java programs\\\\\\\\src\\\\\\\\test.txt");
//		f1.write(b);
	}
		public static void main(String[] args) throws Exception {
			ByteInput();
		}
}
