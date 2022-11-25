// Create a Client that connects to the server 8000

import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost", 8000);
            DataInputStream dis = new DataInputStream(s.getInputStream());
            String str = (String) dis.readUTF();
            System.out.println("Message= " + str);
            dis.close();
            s.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}