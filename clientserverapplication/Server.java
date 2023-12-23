package odev4clientserverchat;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(5678);
        Socket socket = serverSocket.accept();
        
        Scanner fromClient = new Scanner(socket.getInputStream());
        PrintWriter fromServer = new PrintWriter(socket.getOutputStream());
        
        String input,output;
        while(true){
            input = fromClient.nextLine();
            System.out.println("Client" + input);
            output = input.toUpperCase();
            fromServer.println();
            fromServer.flush();
        }
        
        
    }
    
}
