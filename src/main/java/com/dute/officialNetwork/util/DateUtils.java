/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.dute.officialNetwork.util;

import org.apache.commons.lang3.time.DateFormatUtils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 日期工具类, 继承org.apache.commons.lang.time.DateUtils类
 *
 * @author ThinkGem
 * @version 2014-4-15
 */
public class DateUtils extends org.apache.commons.lang3.time.DateUtils {

	private static String[] parsePatterns = {
			"yyyy-MM-dd", "yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd HH:mm", "yyyy-MM",
			"yyyy/MM/dd", "yyyy/MM/dd HH:mm:ss", "yyyy/MM/dd HH:mm", "yyyy/MM",
			"yyyy.MM.dd", "yyyy.MM.dd HH:mm:ss", "yyyy.MM.dd HH:mm", "yyyy.MM"};

	/**
	 * 获取两个时间点间隔的分钟数
	 *
	 * @param beginTime
	 * @param endTime
	 * @return
	 * @throws ParseException
	 */
	public static long getMinsBetweenTowTime(String beginTime, String endTime) {
		Date beginDate = new Date(), endDate = new Date();

		if (StringUtils.isEmpty(endTime)) endTime = DateUtils.formatDate(endDate, "HH:mm");
		if (after(beginTime, endTime)) endDate = DateUtils.addDays(endDate, 1);

		Date endDatetime = DateUtils.parseDate(DateUtils.formatDate(endDate, "yyyy-MM-dd ") + endTime),
				beginDateTime = DateUtils.parseDate(DateUtils.formatDate(beginDate, "yyyy-MM-dd ") + beginTime);
		return (endDatetime.getTime() - beginDateTime.getTime()) / 1000 / 60;
	}

	public static long getMinsBetweenTowTime12(String beginTime, String endTime) {
		String regexp = "^([01]?[0-9]):([0-5][0-9])$";
		Pattern pattern = Pattern.compile(regexp);

		if (StringUtils.isEmpty(beginTime) || StringUtils.isEmpty(endTime) ||
				!beginTime.matches(regexp) || !endTime.matches(regexp) ||
				StringUtils.equals(beginTime, endTime)) return 0;

		Matcher matcher = pattern.matcher(beginTime);
		matcher.find();
		int bh = Integer.parseInt(matcher.group(1)), bm = Integer.parseInt(matcher.group(2));

		matcher = pattern.matcher(endTime);
		matcher.find();
		int eh = Integer.parseInt(matcher.group(1)), em = Integer.parseInt(matcher.group(2));

		Calendar begin = Calendar.getInstance();
		begin.set(Calendar.HOUR, bh);
		begin.set(Calendar.MINUTE, bm);
		Calendar end = Calendar.getInstance();
		end.set(Calendar.HOUR, eh < bh ? eh + 12 : eh);
		end.set(Calendar.MINUTE, em);

		return (end.getTimeInMillis() - begin.getTimeInMillis()) / 1000 / 60;
	}

	/**
	 * 两个时间相差距离分钟数
	 *
	 * @param startTime 时间参数 1 格式：1990-01-01 12:00:00
	 * @param endTime   时间参数 2 格式：2009-01-01 12:00:00
	 * @return String 返回值为：分钟数
	 */
	public static long getDistanceMinute(String startTime, String endTime) {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date one;
		Date two;
		long day = 0;
		long hour = 0;
		long min = 0;
		long sec = 0;
		try {
			one = df.parse(startTime);
			two = df.parse(endTime);
			long time1 = one.getTime();
			long time2 = two.getTime();
			long diff;
			diff = time2 - time1;
			min = ((diff / (60 * 1000)));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return min;
	}

	/**
	 * 得到当前日期字符串 格式（yyyy-MM-dd）
	 */
	public static String getDate() {
		return getDate("yyyy-MM-dd");
	}

	/**
	 * 得到当前日期字符串 格式（yyyy-MM-dd） pattern可以为："yyyy-MM-dd" "HH:mm:ss" "E"
	 */
	public static String getDate(String pattern) {
		return DateFormatUtils.format(new Date(), pattern);
	}

	/**
	 * 得到日期字符串 默认格式（yyyy-MM-dd） pattern可以为："yyyy-MM-dd" "HH:mm:ss" "E"
	 */
	public static String formatDate(Date date, Object... pattern) {
		String formatDate = null;
		if (date != null) {
			if (pattern != null && pattern.length > 0) {
				formatDate = DateFormatUtils.format(date, pattern[0].toString());
			} else {
				formatDate = DateFormatUtils.format(date, "yyyy-MM-dd");
			}
		}
		return formatDate;
	}

	/**
	 * 得到日期时间字符串，转换格式（yyyy-MM-dd HH:mm:ss）
	 */
	public static String formatDateTime(Date date) {
		return formatDate(date, "yyyy-MM-dd HH:mm:ss");
	}

	/**
	 * 得到日期时间字符串，转换格式（yyyy-MM-dd HH:mm:ss）
	 */
	public static Date getNowDateTime() {
		SimpleDateFormat dateFormater = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = null;
		try {
			date = dateFormater.parse(dateFormater.format(new Date()));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}

	/**
	 * 得到当前时间字符串 格式（HH:mm:ss）
	 */
	public static String getTime() {
		return formatDate(new Date(), "HH:mm:ss");
	}

	/**
	 * 得到当前日期和时间字符串 格式（yyyy-MM-dd HH:mm:ss）
	 */
	public static String getDateTime(Date date) {
		return formatDate(date, "yyyy-MM-dd HH:mm:ss");
	}

	/**
	 * 得到当前日期和时间字符串 格式（yyyy-MM-dd HH:mm:ss）
	 */
	public static String getDateTime() {
		return formatDate(new Date(), "yyyy-MM-dd HH:mm:ss");
	}

	public static String getDiffDateTime(Date date,int num) {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.MONTH, num);	//得到num个月
		Date formNow3Month = calendar.getTime();
		System.out.println(DateUtils.formatDateTime(formNow3Month));
		return formatDate(formNow3Month, "yyyy-MM-dd HH:mm:ss");
	}

	/**
	 * 得到当前年份字符串 格式（yyyy）
	 */
	public static String getYear() {
		return formatDate(new Date(), "yyyy");
	}

	public static String getYear(Date date) {
		return formatDate(date, "yyyy");
	}

	/**
	 * 得到当前月份字符串 格式（MM）
	 */
	public static String getMonth() {
		return formatDate(new Date(), "MM");
	}

	/**
	 * 得到当天字符串 格式（dd）
	 */
	public static String getDay() {
		return formatDate(new Date(), "dd");
	}

	/**
	 * 得到当前星期字符串 格式（E）星期几
	 */
	public static String getWeek() {
		return formatDate(new Date(), "E");
	}

	public static int getWeek(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);

		return calendar.get(Calendar.DAY_OF_WEEK) - 1;
	}

	/**
	 * @param time - HH:mm
	 * @return
	 */
	public static boolean before(String time) {
		Date now = new Date();
		try {
			return now.before(DateUtils.parseDate(DateUtils.formatDate(now, "yyyy-MM-dd ") + time, "yyyy-MM-dd HH:mm"));
		} catch (ParseException e) {
			return true;
		}
	}

	/**
	 * @param time - HH:mm
	 * @return
	 */
	public static boolean after(String time) {
		return DateUtils.formatDate(new Date(), "HH:mm").compareTo(time) > 0;
	}

	public static boolean before(String beginTime, String endTime) {
		return beginTime.compareTo(endTime) < 0;
	}

	public static boolean after(String beginTime, String endTime) {
		if (StringUtils.equals(beginTime, endTime)) return false;
		return !before(beginTime, endTime);
	}

	/**
	 * 日期型字符串转化为日期 格式
	 * { "yyyy-MM-dd", "yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd HH:mm",
	 * "yyyy/MM/dd", "yyyy/MM/dd HH:mm:ss", "yyyy/MM/dd HH:mm",
	 * "yyyy.MM.dd", "yyyy.MM.dd HH:mm:ss", "yyyy.MM.dd HH:mm" }
	 */
	public static Date parseDate(String str) {
		if (str == null) {
			return null;
		}
		try {
			return parseDate(str.toString(), parsePatterns);
		} catch (ParseException e) {
			return new Date();
		}
	}

	/**
	 * 获取过去的天数
	 *
	 * @param date
	 * @return
	 */
	public static long pastDays(Date date) {
		long t = new Date().getTime() - date.getTime();
		return t / (24 * 60 * 60 * 1000);
	}

	/**
	 * 获取过去的小时
	 *
	 * @param date
	 * @return
	 */
	public static long pastHour(Date date) {
		long t = new Date().getTime() - date.getTime();
		return t / (60 * 60 * 1000);
	}

	/**
	 * 获取过去的分钟
	 *
	 * @param date
	 * @return
	 */
	public static long pastMinutes(Date date) {
		long t = new Date().getTime() - date.getTime();
		return t / (60 * 1000);
	}

	/**
	 * 转换为时间（天,时:分:秒.毫秒）
	 *
	 * @param timeMillis
	 * @return
	 */
	public static String formatDateTime(long timeMillis, char format) {
		long day = timeMillis / (24 * 60 * 60 * 1000);
		long hour = (timeMillis / (60 * 60 * 1000) - day * 24);
		long min = ((timeMillis / (60 * 1000)) - day * 24 * 60 - hour * 60);
		long s = (timeMillis / 1000 - day * 24 * 60 * 60 - hour * 60 * 60 - min * 60);
		long sss = (timeMillis - day * 24 * 60 * 60 * 1000 - hour * 60 * 60 * 1000 - min * 60 * 1000 - s * 1000);
		String result = "";
		switch (format) {
		case '2':
			result = (day * 24 + hour) + "小时" + min + "分" + s + "秒";
			break;
		case '3':
			hour = day * 24 + hour;
			if (hour > 0){
				result = hour + "小时";
			}
			if (min > 0) {
				result += min + "分钟";
			}
			break;
		default:
			result = (day > 0 ? day + "," : "") + hour + ":" + min + ":" + s + "." + sss;
		}
		return result;
	}

	public static String formatBigDateTime(long d) {
		int years = 0, months = 0, days = 0;
		while (d >= 365) {
			d = d - 365;
			years++;
		}
		while (d >= 30) {
			d = d - 30;
			months++;
		}
		days = (int) d;
		return (years > 0 ? years + "年" : "") + (months > 0 ? months + "个月" : "") + days + "天";
	}

	/**
	 * 获取两个日期之间的天数
	 *
	 * @param before
	 * @param after
	 * @return
	 */
	public static double getDistanceOfTwoDate(Date before, Date after) {
		long beforeTime = before.getTime();
		long afterTime = after.getTime();
		return (afterTime - beforeTime) / (1000 * 60 * 60 * 24);
	}

	/**
	 * 年龄：虚岁
	 *
	 * @param birthDate
	 * @return
	 */
	public static int getAge(Date birthDate) {
		if (birthDate == null) return 0;
		Calendar t = Calendar.getInstance();
		//		int year = t.get(Calendar.YEAR) - Integer.parseInt(DateUtils.getYear(birthDate)) + 1;
		int year = t.get(Calendar.YEAR) - Integer.parseInt(DateUtils.getYear(birthDate));
		return year;
	}

	/**
	 * 年龄：三周岁以下
	 *
	 * @param birthDate
	 * @return *岁*个月
	 */
	public static String getYearMonthByAge(Date birthDate) {
		if (birthDate == null) return "";
		Calendar cal = Calendar.getInstance();
		cal.setTime(birthDate);
		Calendar now = Calendar.getInstance();
		int day = now.get(Calendar.DAY_OF_MONTH)
				- cal.get(Calendar.DAY_OF_MONTH);
		int month = now.get(Calendar.MONTH) - cal.get(Calendar.MONTH);
		int year = now.get(Calendar.YEAR) - cal.get(Calendar.YEAR);
		if (day < 0) {
			month -= 1;
			now.add(Calendar.MONTH, -1);
			day = day + now.getActualMaximum(Calendar.DAY_OF_MONTH);
		}
		if (month < 0) {
			month = (month + 12) % 12;
			year--;
		}
		String yearMonth = "";
		if(year >= 3){
			yearMonth = year + "岁";
		}else{
			if (year == 0 && month != 0) {
				if (month == 11 && day > 0) yearMonth = (year + 1) + "岁";
				else if (month < 11 && day > 0) yearMonth = (month + 1) + "个月";
				else yearMonth = month + "个月";
			} else if (year != 0 && month == 0) {
				if (month == 11 && day > 0) yearMonth = (year + 1) + "岁";
				else if (month < 11 && day > 0) yearMonth = year + "岁" + (month + 1) + "个月";
				else yearMonth = year + "岁";
			} else if (year == 0 && month == 0) {
				yearMonth = (month + 1) + "个月";
			} else {
				if (month == 11 && day > 0) yearMonth = (year + 1) + "岁";
				else if (month < 11 && day > 0) yearMonth = year + "岁" + (month + 1) + "个月";
				else yearMonth = year + "岁" + month + "个月";
			}
		}
		return yearMonth;
	}

	/**
	 * 年龄：周岁
	 *
	 * @param birthDate
	 */
	public static int getAge1(Date birthDate) {
		Date b = new Date(birthDate.getTime());
		Calendar t = Calendar.getInstance();

		int year = t.get(Calendar.YEAR) - Integer.parseInt(DateUtils.getYear(b));
		String bdate = DateUtils.formatDate(b, "MM-dd"), tdate = DateUtils.formatDate(t.getTime(), "MM-dd");
		if (tdate.compareToIgnoreCase(bdate) < 0) {
			year--;
		}
		return year;
	}

	public static String getReadableTime(String lastReplyTime) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date lastReplyTimeDate= null;
		try {
			lastReplyTimeDate = format.parse(lastReplyTime);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Date nowDate = new Date();

		if (DateUtils.getDistanceOfTwoDate(lastReplyTimeDate, nowDate) >= 3) {
			//return lastReplyTime;
			return formatDate(lastReplyTimeDate,"yyyy-MM-dd");
		}

		long miniteLong = nowDate.getTime() - lastReplyTimeDate.getTime();
		int minite = (int) (Math.ceil((double) (miniteLong / 60000)));

		String strMinite = "";

		if (minite == 0) strMinite = "刚刚";
		else if (minite < 60) strMinite = minite + "分钟之前";
		else if (minite >= 60 && minite < 60 * 24) strMinite = (int) (Math.ceil((double) (minite / 60))) + "小时之前";
		else if (minite >= 60 * 24 && minite < 60 * 24 * 30)
			strMinite = (int) (Math.ceil((double) (minite / (60 * 24)))) + "天之前";
		else if (minite >= 60 * 24 * 30 && minite < 60 * 24 * 30 * 12)
			strMinite = (int) (Math.ceil((double) (minite / (60 * 24 * 30)))) + "月之前";
		else if (minite >= 60 * 24 * 30 * 12)
			strMinite = (int) (Math.ceil((double) (minite / (60 * 24 * 30 * 12)))) + "年之前";

		return strMinite;
	}

	public static List<Map<String,Object>> getReadableTime(List<Map<String,Object>> list,String readTimeKey){
		list.stream().forEach(map->{
			Object ob = map.get(readTimeKey);
			try {
				if( ob instanceof Date){
					Date date = (Date)ob;
					SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

					map.put(readTimeKey, DateUtils.getReadableTime(format.format(date)));
				}else if(ob instanceof String){
					map.put(readTimeKey, DateUtils.getReadableTime((String)ob));
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		});
		return list;
	}

	public static long formatDate(String date){

		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			return format.parse(date).getTime();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
	}
	public static Date formatToDateTime(String date){
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			return format.parse(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	public static Date formatToDate(String date){
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		try {
			return format.parse(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	public static String formatDatetoString(long date){
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return format.format(new Date(date));
	}

	public static String formatDatetoStringYmd(long date){
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		return format.format(new Date(date));
	}

	public static String formatStringToDate(String date){
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		try {
			return format.format(format.parse(date));
		} catch (ParseException e) {
			return "";
		}
	}


	public static boolean isValidDate(String str) {
		boolean convertSuccess=true;
		// 指定日期格式为四位年/两位月份/两位日期，注意yyyy/MM/dd区分大小写；
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			// 设置lenient为false. 否则SimpleDateFormat会比较宽松地验证日期，比如2007/02/29会被接受，并转换成2007/03/01
			format.setLenient(false);
			format.parse(str);
		} catch (ParseException e) {
			// e.printStackTrace();
			// 如果throw java.text.ParseException或者NullPointerException，就说明格式不对
			convertSuccess=false;
		} 
		return convertSuccess;
	}

	public static Date addSecond(Date date,int secord) {    
		Calendar calendar = Calendar.getInstance();    
		calendar.setTime(date);    
		calendar.add(Calendar.SECOND, secord);    
		return calendar.getTime();    
	} 

}
