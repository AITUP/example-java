package com.xuqian.robot;


import com.xuqian.robot.socket.TcpClient;

public class App {

    public static void main(String[] args) throws Exception {

        System.out.println("start...");
        TcpClient client = new TcpClient("192.168.2.28",9090);
        client.run();

    }

}
