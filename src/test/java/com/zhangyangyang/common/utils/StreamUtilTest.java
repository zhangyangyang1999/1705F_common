package com.zhangyangyang.common.utils;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.junit.Test;

public class StreamUtilTest {

	@Test
	public void testCloseAll() {
		
	}

	@Test
	public void testReadTextFileInputStream() {
		try {
			String file = StreamUtil.readTextFile(new FileInputStream("D:\\eula\\eclipse\\B\\test.txt"));
			System.out.println(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testReadTextFileFile() throws Exception {
		String file = StreamUtil.readTextFile(new File("D:\\eula\\eclipse\\B\\test.txt"));
		System.out.println(file);
	}

}
