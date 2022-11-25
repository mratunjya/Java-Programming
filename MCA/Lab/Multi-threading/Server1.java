// Create a server that listens on port 8000.

import java.io.*;
import java.net.*;

public class Server1 {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(8000);
            Socket s = ss.accept();
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            dout.writeUTF("Hello Client");
            dout.flush();
            dout.close();
            s.close();
            ss.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}