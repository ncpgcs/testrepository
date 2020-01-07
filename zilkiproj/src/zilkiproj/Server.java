package zilkiproj;

import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	ServerSocket ss;Socket s;
	public Server() {
		try {
			ss=new ServerSocket(2000);
			System.out.println("server is ready...");
			s=ss.accept();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new Server();
	}
}
