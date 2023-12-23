package odev4clientserverchat;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 5678);
            Scanner fromConsole = new Scanner(System.in);
            Scanner fromServer = new Scanner(socket.getInputStream());
            PrintWriter fromClient = new PrintWriter(socket.getOutputStream(), true);
            String input,output;
            while(true){
                System.out.println("Client:");
                input = fromConsole.nextLine();
                
                fromClient.println(input);
                System.out.println("Server: ");
                output =  fromServer.nextLine();
                System.out.println(output);
                
            }
        } catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
