package Stream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;


public class StudentProblem1 {
	public static void main(String[] args) throws Exception {
		FileOutputStream f1=new FileOutputStream("file.txt");
		DataOutputStream d1=new DataOutputStream(f1);
		float []list= {8.5f,5.7f,10f,113.389f};
		d1.writeInt(list.length);
		for(float f:list) {
			d1.writeFloat(f);
		}
		d1.close();
		// reading part
		FileInputStream f2=new FileInputStream("file.txt");
		DataInputStream d2=new DataInputStream(f2);
		int size=d2.readInt();
		while(size-->0) {
			System.out.println(d2.readFloat());
		}
		d2.close();
	}

}
