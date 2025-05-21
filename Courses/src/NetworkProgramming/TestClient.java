package NetworkProgramming;

import java.io.*;
import java.net.*;

public class TestClient {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost", 6379);
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        // Send PING command
        writer.write("*1\r\n$4\r\nPING\r\n");
        writer.flush();
        System.out.println(reader.readLine());  // Should print +PONG

        // Send PING with argument
        writer.write("*2\r\n$4\r\nPING\r\n$5\r\nhello\r\n");
        writer.flush();
        System.out.println(reader.readLine());  // Should print $5
        System.out.println(reader.readLine());  // Should print hello

        socket.close();
    }
}
