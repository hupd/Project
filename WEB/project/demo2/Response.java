package com.briup.jd1721.corejava.project.demo2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Response{
	private Socket socket;

	public Response(Socket socket){
		this.socket=socket;
	}

	public Socket getSocket(){
		return socket;
	}

	public void setSocket(Socket socket){
		this.socket=socket;
	}

	public void response(String sc,File file) throws IOException{
		OutputStream os=socket.getOutputStream();
		switch(sc){
			case "200":{
				os.write("HTTP/1.1 200 OK".getBytes());
				os.write("\r\n".getBytes());

				os.write("Content-Type: text/html".getBytes());
				os.write("\r\n".getBytes());

				os.write("\r\n".getBytes());
				os.flush();

				if(file!=null){
					FileInputStream fis=
						new FileInputStream(file);

					byte[] bytes=new byte[1024];
					int length;

					while((length=fis.read(bytes))!=-1){
						os.write(bytes,0,length);
						os.flush();
					}
					os.flush();
					socket.close();
				}
				break;
			}
			case "404":{
				os.write("HTTP/1.1 404 ERROR".getBytes());
				os.write("\r\n".getBytes());

				os.write("Content-Type: text/html".getBytes());
				os.write("\r\n".getBytes());

				os.write("\r\n".getBytes());
				os.flush();

				os.write("<h1>访问的资源不存在！</h1>".getBytes());
				os.flush();

				socket.close();

				break;
			}
		}
	}
}
