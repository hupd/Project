package com.briup.jd1721.corejava.project.demo1;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server implements Runnable{
	private ServerSocket ss;
	private Socket socket;
	private Request request;
	private Response response;

	public Server(Socket socket){
		this.socket=socket;
	}

	public Server(ServerSocket ss){
		this.ss=ss;
	}

	@Override
	public void run(){
		while(true){
			try{
				socket=ss.accept();
				// 获取浏览器的请求对象。
				request=new Request();
				request.set(socket.getInputStream());
				String srcPath=request.getSrcPath();
				System.out.println(srcPath);
				response=new Response();
				response.setFilePath(srcPath);
				response.resp(socket.getOutputStream());
				//System.out.println(srcPath);
				socket.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}
}
