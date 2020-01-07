package SierraBeits.NetworkingAndThreads15;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;

public class VerySimpleChatServer {

    ArrayList<PrintWriter> clientOutputStream;

    public class ClientHandler implements Runnable {
        BufferedReader reader;
        Socket socket;

        public ClientHandler(Socket clientSocket) {
            try {
                socket = clientSocket;
                InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream());
                reader = new BufferedReader(inputStreamReader);
            } catch (Exception ex) { ex.printStackTrace(); }
        }

        public void run() {
            String message;
            try {
                while ((message = reader.readLine()) != null) {
                    System.out.println("read" + message);
                    tellEveryone(message);
                }
            } catch (Exception ex) { ex.printStackTrace(); }
        }
    }

        public static void main(String[] args) {
            new VerySimpleChatServer().go();
        }

        public void go() {
            clientOutputStream = new ArrayList<PrintWriter>();
            try {
                ServerSocket serverSocket = new ServerSocket(5000);

                while (true) {
                    Socket clientSocket = serverSocket.accept();
                    PrintWriter printWriter = new PrintWriter(clientSocket.getOutputStream());
                    clientOutputStream.add(printWriter);

                    Thread thread = new Thread(new ClientHandler(clientSocket));
                    thread.start();
                    System.out.println("got a connection");
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

        public void tellEveryone(String message) {
            Iterator iterator = clientOutputStream.iterator();
            while (iterator.hasNext()) {
                try {
                    PrintWriter printWriter = (PrintWriter) iterator.next();
                    printWriter.println(message);
                    printWriter.flush();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }
    }


