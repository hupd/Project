package com.briup.jd1721.corejava.project.demo1;

import java.io.IOException;
import java.net.ServerSocket;

public class StartServer{
	public static void main(String[] args) throws IOException{
		new Thread(
			new Server(
				new ServerSocket(50000))).start();
	}
}
