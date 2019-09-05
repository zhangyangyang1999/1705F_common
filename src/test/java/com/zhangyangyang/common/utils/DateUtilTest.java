package com.zhangyangyang.common.utils;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class DateUtilTest {

	@Test
	public void testGetDateByInitMonth() {
		Calendar c = Calendar.getInstance();
		c.set(2000,8, 18);
		
		Date date = DateUtil.getDateByInitMonth(c.getTime());
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String format = df.format(date);
		System.out.println(format);
	}

	@Test
	public void testGetDateByFullMonth() {
		Calendar c = Calendar.getInstance();
		c.set(2000,1, 18);
		
		Date date = DateUtil.getDateByFullMonth(c.getTime());
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String format = df.format(date);
		System.out.println(format);
	}
	/**
	 * 拼接下面根据时间范围查询订单的SQL：
		String sql = "select * from t_order where create_time>='{1}'
		 and create_time<='{2}' ";
		将上面{1}的位置使用DateUtil工具类中的getDateByInitMonth()返回值替换，
		将上面{2}的位置使用DateUtil工具类中的getDateByFullMonth()返回值替换。
		最后打印出正确拼接的SQL字符串。
	 */
	@Test
	public void testSql() {
		String sql  = "select * from t_order where create_time>='{1}' and create_time<='{2}' ";
		Date date1 = DateUtil.getDateByInitMonth(new Date());
		Date date2 = DateUtil.getDateByFullMonth(new Date());
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String string = sql.replace("{1}",df.format(date1)).replace("{2}", df.format(date2));
		System.out.println(string);
	}
}
