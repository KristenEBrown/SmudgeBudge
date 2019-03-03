package edu.gatech.buildgt.smudgebudge.model;

import java.io.IOException;
import java.io.DataOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;


public class Client {

    public static final String TAG = Client.class.getSimpleName();
    public static final String SERVER_IP = "192.168.43.156"; //server IP address
    public static final int SERVER_PORT = 25565;
    private DataOutputStream out;
    private Socket socket;

    /**
     * Constructor of the class. OnMessagedReceived listens for the messages received from server
     */
    public Client() {
        
    }

    /**
     * Sends the message entered by client to the server
     *
     * @param message text entered by client
     */
    public void sendMessage(final int message) {
        while (out == null) {
            try {
                InetAddress serverAddr = InetAddress.getByName(SERVER_IP);

                socket = new Socket(serverAddr, SERVER_PORT);
                out = new DataOutputStream(socket.getOutputStream());

            } catch (UnknownHostException e1) {
                e1.printStackTrace();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }

        try {
            out.writeInt(message);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    /**
     * Close the connection and release the members
     */
    public void stopClient() {
        try {
            socket.close();
        } catch (IOException e1) {
            e1.printStackTrace();
        }

    }

}