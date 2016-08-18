package xirui.NETtest;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Xirui on 2015/11/3.
 */
public  class TCPClient {
    public static void main(String[] args){
        ExecutorService Client = Executors.newFixedThreadPool(3); //创建线程池
        Client.execute(new setTCP("aaaaaaaaaaaaaa"));
        Client.execute(new setTCP("bbbbbbbbbbbbbb"));
        Client.execute(new setTCP("cccccccccccccc"));
        Client.shutdown();
    }

    static class setTCP implements Runnable{
        String str;
        public setTCP(String str){
            this.str = str;
        }

        public void run() {
            //String sentence;
            String modifiedSentence;
            Socket clientSocket = null;   //创建套接字
            try {
                clientSocket = new Socket("111.114.118.34", 6789);
                DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());  //程序输出流 客户机发送到网络的字符流入它
                BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));   //创建输入流 连接套接字 从网络来的字符流入它
                //sentence = inFromUser.readLine();
                outToServer.writeBytes(str + '\n');
                modifiedSentence = inFromServer.readLine();
                System.out.println("FROM SERVER: " + modifiedSentence);
                clientSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
