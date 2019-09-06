package com.zhangyangyang.common.utils;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class StringUtilTest {

	@Test
	public void testHasLength() {
		boolean b = StringUtil.hasLength("");
		System.out.println(b);
	}

	@Test
	public void testHasText() {
		boolean b = StringUtil.hasText(" ");
		System.out.println(b);
	}

	@Test
	public void testRandomChineseString() {
		for (int i = 0; i < 10; i++) {
			String string = StringUtil.randomChineseString();
			System.out.print(string+" ");
		}
	}

	@Test
	public void testRandomChineseStringInt() {
		String string = StringUtil.randomChineseString(10);
		System.out.println(string);
	}

	@Test
	public void testGenerateChineseName() {
		for (int i = 0; i < 10; i++) {
			String name = StringUtil.generateChineseName();
			System.out.println(name);
		}
	}

	@Test
	public void randomSimpleChinese() {
		for (int i = 0; i < 10; i++) {
			String chinese = StringUtil.randomSimpleChinese();
			System.out.print(chinese+" ");
		}
	}
	
	@Test
	public void genderatePerson() {
		Calendar calendar = Calendar.getInstance();
		calendar.set(2010, 0,1);
		
		for (int i = 0; i < 10000; i++) {
			Person person = new Person(StringUtil.generateChineseName(), RandomUtil.random(1, 120), 
				StringUtil.randomChineseString(140), DateUtil.randomDate(calendar.getTime(), new Date()));
			System.out.println(person);
		}
	}
}
