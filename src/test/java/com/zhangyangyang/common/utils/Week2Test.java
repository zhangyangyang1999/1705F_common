package com.zhangyangyang.common.utils;

import org.junit.Test;

public class Week2Test {

	/**
	 * 
	    * @Title: toHtml
	    * @Description:(1)测试StringUtil工具类中toHtml()方法，传一段文本进去，输出带html标签的文本。
	    * @param     参数
	    * @return void    返回类型
	    * @throws
	 */
	@Test
	public void toHtml() {
		String html = StringUtil.toHtml("aaaa");
		System.out.println(html);
	}
	
	/**
	 * 
	    * @Title: isPhone
	    * @Description: 测试StringUtil工具类中的是否为中国地区手机号码isPhone()工具方法
	    * @param     参数
	    * @return void    返回类型
	    * @throws
	 */
	@Test
	public void isPhone() {
		boolean phoneNumber = StringUtil.isPhoneNumber("13331191132");
		if (phoneNumber) {
			System.out.println("手机号正确");
		} else {
			System.out.println("手机号不合法");
		}
	}
	
	/**
	 * 
	    * @Title: isPhone
	    * @Description: 测试StringUtil工具类中的是否为邮箱isEmail()工具方法
	    * @param     参数
	    * @return void    返回类型
	    * @throws
	 */
	@Test
	public void isEmail() {
		boolean email = StringUtil.isEmail("number@163.com");
		if (email) {
			System.out.println("邮箱正确");
		} else {
			System.out.println("邮箱不合法");
		}
	}
}
