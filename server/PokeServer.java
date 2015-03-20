package server;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

import seed.GetPokeData;
import json.QCJSON.JSONInputStream;
import json.QCJSON.JSONOutputStream;



public class PokeServer{ 
	public static void main(String[] args){
		try {
			GetPokeData request = new GetPokeData();
			Thread t1 = new Thread(request);
			t1.start();
			System.out.print(request.getMap());
			//open a socket on the specified port
			ServerSocket ListeningSocket = new ServerSocket(9090);

			System.out.println("Waiting for client connection request.");
			Socket clientSocket = ListeningSocket.accept();
			//establish JSON streams
			JSONInputStream inFromClient = new JSONInputStream(clientSocket.getInputStream());
			JSONOutputStream outToClient = new JSONOutputStream(clientSocket.getOutputStream());

			System.out.println("Waiting for a message from the server.");
			HashMap Map = (HashMap)inFromClient.readObject();
			
			System.out.println("Received:" +Map+" processing request for client");
			myCommBean Response = new myCommBean("Done", 1, "Data"); 
			outToClient.writeObject(Response);     
			ListeningSocket.close();
			System.out.println("Listening Socket Closed.");

		} 
	catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.exit(1);
	}
}
}

