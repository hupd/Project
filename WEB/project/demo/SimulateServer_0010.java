package com.briup.jd1721.corejava.project.demo;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SimulateServer_0010{
}

class Server{
	public static void main(String[] args) throws IOException{
		System.out.println("服务器已启动。。。");
		ServerSocket ss=new ServerSocket(50000);
		while(true){
			Socket s=ss.accept();
			InputStream is=s.getInputStream();
			byte[] bytes=new byte[1024];
			int length;
			while((length=is.read(bytes))!=-1){
				System.out.println(
					new String(bytes,0,length));
			}
			PrintWriter pw=
				new PrintWriter(
					s.getOutputStream(),true);
			pw.println("浏览器，你好！！！");
			pw.println(
				"<font color='red'>浏览器，你好！</font>");
			s.close();
		}
	}
}










