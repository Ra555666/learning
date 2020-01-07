package SierraBeits.NetworkingAndThreads15;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class DailyAdviceServer {
    String[] adviceList = {"Eat smaller meals", "Buy tight jeans","Two words: not good","Be honest at least today","GO to the hairdresser"};
    public void go(){
        try{
            ServerSocket serverSocket = new ServerSocket(4242);
            while (true){
                Socket socket = serverSocket.accept();
                PrintWriter writer = new PrintWriter(socket.getOutputStream());
                String advice = getAdvice();
                writer.println();
                writer.close();
                System.out.println(advice);
            }
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }

    private String getAdvice(){
        int random = (int)(Math.random()*adviceList.length);
        return adviceList[random];
    }

//    public static void main(String[] args) {
//        DailyAdviceServer server = new DailyAdviceServer();
//        server.go();
//    }
}
