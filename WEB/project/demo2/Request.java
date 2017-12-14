package com.briup.jd1721.corejava.project.demo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Request{
	private String method;
	private String srcPath;
	private Socket socket;

	// region Constructor
	public Request(){
	}

	public Request(Socket socket){
		this.socket=socket;
	}

	public Request(String method,String srcPath){
		this.method=method;
		this.srcPath=srcPath;
	}
	// endregion

	// region Get/Set
	public String getMethod(){
		return method;
	}

	public void setMethod(String method){
		this.method=method;
	}

	public String getSrcPath(){
		return srcPath;
	}

	public void setSrcPath(String srcPath){
		this.srcPath=srcPath;
	}
	// endregion

	public void parse() throws IOException{
		BufferedReader br=
			new BufferedReader(
				new InputStreamReader(
					socket.getInputStream()));
		String line=br.readLine();
		String[] strs=line.split(" ");
		method=strs[0];
		// 172.0.0.1:50000/index.html?name=zhangsan&age=10
		srcPath=strs[1].split("[?]")[0];
		//srcPath=strs[1];
	}
}
