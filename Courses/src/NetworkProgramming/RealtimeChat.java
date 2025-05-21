package NetworkProgramming;

import java.io.*;
import java.net.*;
import java.util.*;

// This class handles communication with one client
public class RealtimeChat extends Thread {
    Socket clientSocket; // Stores the socket connection for one client

    // Shared list to keep all messages sent by all clients
    static List<String> allMessages = Collections.synchronizedList(new ArrayList<>());

    // Shared list to store all client output streams so we can broadcast messages
    static List<PrintStream> clientStreams = Collections.synchronizedList(new ArrayList<>());

    // Stores names of clients, mapped to their socket
    static Map<Socket, String> clientNames = Collections.synchronizedMap(new HashMap<>());

    // Constructor receives the socket (i.e., the client connection)
    public RealtimeChat(Socket socket) {
        this.clientSocket = socket;
    }

    // This method runs when the thread starts
    public void run() {
        try {
            // Create a BufferedReader to read messages from this client's input
            BufferedReader br = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            // Create a PrintStream to send messages back to this client
            PrintStream ps = new PrintStream(clientSocket.getOutputStream());

            // Add this client's output stream to the list so we can broadcast to them
            clientStreams.add(ps);

            // First, read the client's name
            String userName = br.readLine(); // This will be the first line sent from the client
            clientNames.put(clientSocket, userName); // Store the username for this socket

            // Send all previous chat messages to this new client
            ps.println("----- Chat History -----");
            for (String msg : allMessages) {
                ps.println(msg);
            }

            String msg; // Variable to store messages from this client

            // Keep reading messages from this client
            while ((msg = br.readLine()) != null && !msg.equalsIgnoreCase("end")) {
                // Create the full message with the client's name
                String fullMsg = "[" + userName + "]: " + msg;

                // Add this message to the message history
                allMessages.add(fullMsg);

                // Send this message to all connected clients (broadcast)
                for (PrintStream clientOut : clientStreams) {
                    clientOut.println(fullMsg);
                }
            }

            // If the client types "end", we remove them and close the connection
            clientSocket.close(); // Close this client's socket
            clientStreams.remove(ps); // Remove this client's output stream
            clientNames.remove(clientSocket); // Remove this client's name
        } catch (IOException e) {
            System.out.println("Client disconnected unexpectedly.");
        }
    }

    // Main server method
    public static void main(String[] args) throws Exception {
        // Create a server socket that listens on port 2000
        ServerSocket serverSocket = new ServerSocket(2004);
        System.out.println("Server started on port 2000...");

        // Keep accepting new clients forever
        while (true) {
            Socket socket = serverSocket.accept(); // Accept new client
            System.out.println("New client connected.");

            // Create a new thread to handle this client
            RealtimeChat clientHandler = new RealtimeChat(socket);
            clientHandler.start(); // Start the thread
        }
    }
}
