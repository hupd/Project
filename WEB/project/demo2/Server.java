package com.briup.jd1721.corejava.project.demo2;

import java.io.File;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server{
	public static void main(String[] args) throws IOException{
		ServerSocket ss=new ServerSocket(50000);
		while(true){
			Socket s=ss.accept();
			new Thread(new Handle(s)).start();
		}
	}
}

class Handle implements Runnable{
	// 设置Web服务器的根目录（“/”），实际上
	// 对应的是Web服务器所在的计算机上的
	// 某个真实的路径
	private static final String ROOT="P:\\server";
	private static Request request;
	private static Response response;
	private Socket socket;

	public Handle(Socket socket){
		this.socket=socket;
	}

	@Override
	public void run(){
		try{
			handle(socket);
		}catch(IOException e){
			e.printStackTrace();
		}
	}

	private static void handle(Socket s)
		throws IOException{
		request=new Request(s);
		request.parse();
		String src=request.getSrcPath();
		File file=new File(ROOT,src);
		response=new Response(s);
		if(file.exists()){
			response.response("200",file);
		}else{
			response.response("404",null);
		}
	}
}
