// Server.java
import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(5000);
        System.out.println("Server started. Waiting for a client ...");
        Socket socket = serverSocket.accept();
        System.out.println("Client accepted.");

        DataInputStream in = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
        DataOutputStream out = new DataOutputStream(socket.getOutputStream());

        String line = "";
        while (!line.equals("Over")) {
            try {
                line = in.readUTF();
                String[] parts = line.split(" ");
                double result = 0;
                switch (parts[0]) {
                    case "add":
                        result = Double.parseDouble(parts[1]) + Double.parseDouble(parts[2]);
                        break;
                    case "sub":
                        result = Double.parseDouble(parts[1]) - Double.parseDouble(parts[2]);
                        break;
                    case "mul":
                        result = Double.parseDouble(parts[1]) * Double.parseDouble(parts[2]);
                        break;
                    case "div":
                        result = Double.parseDouble(parts[1]) / Double.parseDouble(parts[2]);
                        break;
                    case "sqrt":
                        result = Math.sqrt(Double.parseDouble(parts[1]));
                        break;
                    case "pow":
                        result = Math.pow(Double.parseDouble(parts[1]), Double.parseDouble(parts[2]));
                        break;
                    case "sin":
                        double radian = Math.toRadians(Double.parseDouble(parts[1]));
                        result = Math.sin(radian);
                        break;
                    case "cos":
                        radian = Math.toRadians(Double.parseDouble(parts[1]));
                        result = Math.cos(radian);
                        break;
                    case "tan":
                        radian = Math.toRadians(Double.parseDouble(parts[1]));
                        result = Math.tan(radian);
                        break;
                    case "log":
                        result = Math.log(Double.parseDouble(parts[1]));
                        break;
                }
                out.writeUTF(Double.toString(result));
            } catch (IOException i) {
                System.out.println(i);
            }
        }
        System.out.println("Closing connection");
        socket.close();
        in.close();
    }
}