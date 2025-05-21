package NetworkProgramming;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class NewClient {
	public static void main(String[] args) throws Exception{
		Socket clientSocket=new Socket("localhost",2000);
		// for reading the data from the keyboard we use this reader
		BufferedReader keybr=new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br=new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
		// for giving output to client we need a print stream which can easily write string to stream
		PrintStream ps=new PrintStream(clientSocket.getOutputStream());
		String input,serverResponse;
		do {
			input=keybr.readLine();// it will read a string from user
			 if (input == null) break;
			ps.println(input);
			serverResponse=br.readLine();
			System.out.println(serverResponse);
			}while(!input.equals("end"));
		clientSocket.close();
	}
}
