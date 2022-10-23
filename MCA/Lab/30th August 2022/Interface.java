import java.lang.*;
import java.io.*;

interface Inter {
    public void connect();

    public void disconnect();
}

class OracleDB implements Inter {
    public void connect() {
        System.out.println("Connect OracleDB");
    }

    public void disconnect() {
        System.out.println("Disconnect OracleDB");
    }
}

class SyBase implements Inter {
    public void connect() {
        System.out.println("Connect SyBase");
    }

    public void disconnect() {
        System.out.println("Disconnect SyBase");
    }
}

public class Interface {
    public static void main(String args[])throws Exception {
        try {
            Class C = Class.forName(args[0]);

            Inter i = (Inter) C.newInstance();

            i.connect();
            i.disconnect();
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.toString());
        }
    }
}
