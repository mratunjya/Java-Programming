import java.net.*;
import java.io.*;

public class Server {
    public static void main(String[] args)throws IOException {
        ServerSocket ss = new ServerSocket(6666);
        Socket s = ss.accept();

        PrintStream ps = new PrintStream(s.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));

        String str, str1;

        while((str = br.readLine()) != null) {
            System.out.println(str);
            str1 = br.readLine();
            ps.println(str1);
        }

        ps.close();
        br.close();
        kb.close();
        ss.close();
        s.close();
        System.exit(0);
    }
}