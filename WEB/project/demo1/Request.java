package com.briup.jd1721.corejava.project.demo1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Request{
	private String method;
	private String srcPath;

	// region 这是构造器和get/set方法
	public Request(){
	}

	public Request(String method,String srcPath){
		this.method=method;
		this.srcPath=srcPath;
	}

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

	public void set(InputStream is) throws IOException{
		BufferedReader br=
			new BufferedReader(
				new InputStreamReader(is));
		// 获取请求行的数据，请求行是以“ ”分割
		String line=br.readLine();
		String[] strs=line.split(" ");
		if(strs.length==3){
			method=strs[0];
			// 由于当请求方式为GET的时候，
			// URL后面有可能会跟参数，
			// 在封装资源路径的时候，需要去掉参数
			srcPath=strs[1].split("[?]")[0];
		}
	}
}
