package com.briup.jd1721.corejava.project.demo1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Response{
	private String statuCode;
	private String contentType;
	private String filePath;
	// 指定服务器本地的某个目录作为服务器应用程序的
	// 根目录
	private static final String root="P:\\server";

	// region 构造器，get/set方法
	public Response(){
	}

	public Response(String statuCode,String contentType,String filePath){
		this.statuCode=statuCode;
		this.contentType=contentType;
		this.filePath=filePath;
	}

	public String getStatuCode(){
		return statuCode;
	}

	public void setStatuCode(String statuCode){
		this.statuCode=statuCode;
	}

	public String getContentType(){
		return contentType;
	}

	public void setContentType(String contentType){
		this.contentType=contentType;
	}

	public String getFilePath(){
		return filePath;
	}

	public void setFilePath(String filePath){
		this.filePath=filePath;
	}
	// endregion

	public void resp(OutputStream os) throws IOException{
		File file=new File(root,filePath);
		/**
		 * 如果文件存在，
		 * 状态码：HTTP/1.1 202 OK
		 * 内容类型：text/html
		 */
		if(file.exists()){
			statuCode="HTTP/1.1 202 OK";
			contentType="text/html";
			// 将响应行回传给浏览器
			os.write(statuCode.getBytes());
			os.write("\r\n".getBytes());
			// 将响应头信息回传给浏览器
			os.write(contentType.getBytes());
			os.write("\r\n".getBytes());
			// 回传一个空行给浏览器
			os.write("\r\n".getBytes());
			os.flush();
			// 读取文件，并将文件的数据返回给浏览器
			FileInputStream fis=
				new FileInputStream(file);
			byte[] bytes=new byte[1024];
			int length;
			while((length=fis.read(bytes))!=-1){
				os.write(bytes,0,length);
				os.flush();
			}
			os.flush();
		}else{
			OutputStreamWriter
				osw=new OutputStreamWriter(os,"GBK");
			//os.write("文件不存在。".getBytes());
			//os.flush();
			osw.write("文件不存在。");
			osw.flush();
		}
	}
}
