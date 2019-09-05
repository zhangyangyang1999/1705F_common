package com.zhangyangyang.common.utils;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * 
    * @ClassName: StreamUtil
    * @Description: 流处理工具类
    * @author 张洋洋
    * @date 2019年9月5日
    *
 */
public class StreamUtil {
	/*
	* 方法1：批量关闭流，参数能传无限个。(3分)
	* 例如传入FileInputStream对象、JDBC中Connection对象都可以关闭。
	*/
	public static void closeAll(AutoCloseable ... ables){
		if (ables.length!=0) {
			for (AutoCloseable autoCloseable : ables) {
				try {
					autoCloseable.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	/*
	* 方法2：传入一个文本文件对象，默认为UTF-8编码，返回该文件内容(3分)，要求方法内部调用上面第1个方法关闭流(3分)
	*/
	public static String readTextFile(InputStream src){
		//字节输出流
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		byte[] b = new byte[1024];
		String str = "";
		int len = 0;
		try {
			while ((len=src.read(b))!=-1) {
				bos.write(b);
			}
			str = bos.toString("UTF-8");
		} catch (IOException e) {
			e.printStackTrace();
		}
		//关流
		closeAll(bos,src);
 		return str;
	
	}
	
	/*
	* 方法3：传入文本文件对象，返回该文件内容(3分)，并且要求内部调用上面第2个方法(5分)。* 这是典型的方法重载，记住了吗？少年…
	*/
	public static String readTextFile(File txtFile) throws Exception{
		String file = readTextFile(new FileInputStream(txtFile));
		return file;
	}
}
