package com.tosit.lottery.ui;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by DELL on 2016/8/22.
 */
public class TcpResponse {

    public TcpResponse() {

    }


    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(8888);
            while(true)
            {
                Socket socket = server.accept();
                new ResponseThread(socket).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
