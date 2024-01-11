// Client.java
import java.net.*;
import java.io.*;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 5000);
        System.out.println("Connected");

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        DataInputStream in = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
        DataOutputStream out = new DataOutputStream(socket.getOutputStream());

        String line = "";
        while (!line.equals("Over")) {
            try {
                line = input.readLine();
                out.writeUTF(line);
                String result = in.readUTF();
                System.out.println("Result: " + result);
            } catch (IOException i) {
                System.out.println(i);
            }
        }
        System.out.println("Closing connection");
        socket.close();
        input.close();
    }
}