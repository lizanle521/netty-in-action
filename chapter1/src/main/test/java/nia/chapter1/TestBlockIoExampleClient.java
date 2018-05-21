package nia.chapter1;

import org.junit.Test;

import java.io.*;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;

public class TestBlockIoExampleClient {
    @Test
    public void testClient() throws IOException, InterruptedException {
        Socket socket = new Socket();
        socket.connect(new InetSocketAddress(9898) {

        });
        PrintWriter out =
                new PrintWriter(socket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(
                new InputStreamReader(socket.getInputStream()));
        while (true){
            Thread.sleep(1000L);
            out.println("aaa");
            System.out.println(in.readLine());
        }
    }
}
