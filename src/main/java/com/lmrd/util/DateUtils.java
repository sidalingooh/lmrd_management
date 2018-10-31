package com.lmrd.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang.StringUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 日期工具类
 * ClassName: DateUtils 
 * @Description: TODO
 * @author LiuSiGuang
 * @date 2017年10月13日 下午5:23:13
 */
public class DateUtils {

	// 把传入的String转为date时间类型
	public static Date stringToTime(String time) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = null;
		try {
			date = format.parse(time);
		} catch (ParseException e) {
			System.out.println("时间格式不匹配");
			e.printStackTrace();
		}
		return date;
	}

	// 把传入的String转为date日期类型
	public static Date stringToDay(String time) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		try {
			date = format.parse(time);
		} catch (ParseException e) {
			System.out.println("日期格式不匹配");
			e.printStackTrace();
		}
		return date;
	}

	// 把传入的String转为自定义Date类型
	public static Date stringToDiyDate(String time, String pattern) {
		SimpleDateFormat format = new SimpleDateFormat(pattern);
		Date date = null;
		try {
			date = format.parse(time);
		} catch (ParseException e) {
			System.out.println("日期格式不匹配");
			e.printStackTrace();
		}
		return date;
	}

	public static String StringToString(String time, String pattern) {
		System.out.println(time);
		SimpleDateFormat format = new SimpleDateFormat(pattern);
		String retDate = "";
		try {
			Date date = format.parse(time);
			System.out.println(date);
			SimpleDateFormat format2 = new SimpleDateFormat(pattern);
			retDate = format2.format(date);
			System.out.println(retDate);
		} catch (ParseException e) {
			System.out.println("日期格式不匹配");
			e.printStackTrace();
		}
		return retDate;
	}

	// 把传入的Date转为自定义的格式
	public static String dateToString(Date date, String pattern) {
		if (date != null) {
			SimpleDateFormat format = new SimpleDateFormat(pattern);
			String day = format.format(date);
			return day;
		}
		return null;
	}

	// 根据传入的Date获取当前日期
	public static String getDayByDate(Date date) {
		if (date != null) {
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			String today = format.format(date);
			return today;
		}
		return null;
	}
	
	// 根据传入的Date获取当前日期
	public static String getDayByLong(Long date) {
		if (date != null) {
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			String today = format.format(date);
			return today;
		}
		return null;
	}
	

	// 根据传入的Date获取当前时间
	public static String getTimeByDate(Date date) {
		if (date != null) {
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String currentTime = format.format(date);
			return currentTime;
		}
		return null;
	}

	// 获取当前时间
	public static String getCurrentTime() {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String currentTime = format.format(new Date());
		return currentTime;
	}

	// 获取当前日期
	public static String getToday() {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		String today = format.format(new Date());
		return today;
	}

	// 把传入的自定义String转为Long类型
	public static Long stringDiyToLong(String time, String pattern) throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat(pattern);
		Date date = format.parse(time);
		return date.getTime();
	}

	// 把日期格式时间转化为time
	public static Long getTimeByformatyyyyMMddHHmmss(String date) throws Exception {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date parse = format.parse(date);
		Long time = parse.getTime();
		return time;
	}

	// 把日期格式时间转化为time
	public static Long getTimeByformatyyyyMMdd(String date) throws Exception {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date parse = format.parse(date);
		Long time = parse.getTime();
		return time;
	}

	/**
	 * 
	 * @Title: getTodayStartTime
	 * @Description: 获取当天开始时间
	 * @param @return 
	 * @return Date 
	 * @throws
	 */
	public static Date getTodayStartTime() {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.MILLISECOND, 0);
		return cal.getTime();
	}

	/**
	 * 
	 * @Title: getTodayEndTime
	 * @Description: 获取当天结束时间
	 * @param @return 
	 * @return Date 
	 * @throws
	 */
	public static Date getTodayEndTime() {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, 23);
		cal.set(Calendar.SECOND, 59);
		cal.set(Calendar.MINUTE, 59);
		cal.set(Calendar.MILLISECOND, 0);
		return cal.getTime();
	}

	/**
	 * 
	 * @Title: getStartYestaday
	 * @Description: 获取昨天开始时间
	 * @param @return 
	 * @return Date 
	 * @throws
	 */
	public static Date getStartYestaday() {
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		cal.add(Calendar.DAY_OF_MONTH, -1);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MILLISECOND, 0);
		Date startTime = cal.getTime();
		return startTime;
	}

	/**
	 * 
	 * @Title: getEndYestaday
	 * @Description: 获取昨天结束时间
	 * @param @return 
	 * @return Date 
	 * @throws
	 */
	public static Date getEndYestaday() {
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		cal.add(Calendar.DAY_OF_MONTH, -1);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.HOUR_OF_DAY, 23);
		cal.set(Calendar.SECOND, 59);
		cal.set(Calendar.MINUTE, 59);
		cal.set(Calendar.MILLISECOND, 0);
		Date endTime = cal.getTime();
		return endTime;
	}

	/**
	 * 
	 * @Title: getStartBeforeYestaday
	 * @Description: 获取前天开始的时间
	 * @param @return 
	 * @return Date 
	 * @throws
	 */
	public static Date getStartBeforeYestaday() {
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		cal.add(Calendar.DAY_OF_MONTH, -2);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MILLISECOND, 0);
		Date startTime = cal.getTime();
		return startTime;
	}

	/**
	 * 
	 * @Title: getEndBeforeYestaday
	 * @Description: 获取前天结束的时间
	 * @param @return 
	 * @return Date 
	 * @throws
	 */
	public static Date getEndBeforeYestaday() {
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		cal.add(Calendar.DAY_OF_MONTH, -2);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.HOUR_OF_DAY, 23);
		cal.set(Calendar.SECOND, 59);
		cal.set(Calendar.MINUTE, 59);
		Date endTime = cal.getTime();
		return endTime;
	}

	/**
	 * 
	 * @Title: getStartTimeForWeek
	 * @Description: 获取本周开始时间
	 * @param @return 
	 * @return Date 
	 * @throws
	 */
	public static Date getStartTimeForWeek() {
		Calendar cal = Calendar.getInstance();
		cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONDAY), cal.get(Calendar.DAY_OF_MONTH), 0, 0, 0);
		cal.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
		return cal.getTime();
	}

	/**
	 * 
	 * @Title: getEndTimeForWeek
	 * @Description:获得本周结束时间
	 * @param @return 
	 * @return Date 
	 * @throws
	 */
	public static Date getEndTimeForWeek() {
		Calendar cal = Calendar.getInstance();
		cal.setTime(getStartTimeForWeek());
		cal.add(Calendar.DAY_OF_WEEK, 6);
		cal.set(Calendar.HOUR_OF_DAY, 23);
		cal.set(Calendar.SECOND, 59);
		cal.set(Calendar.MINUTE, 59);
		return cal.getTime();
	}

	/**
	 * 
	 * @Title: getStartTimeForMonth
	 * @Description: 获取本月开始时间
	 * @param @return 
	 * @return Date 
	 * @throws
	 */
	public static Date getStartTimeForMonth() {
		Calendar cal = Calendar.getInstance();
		cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONDAY), cal.get(Calendar.DAY_OF_MONTH), 0, 0, 0);
		cal.set(Calendar.DAY_OF_MONTH, cal.getActualMinimum(Calendar.DAY_OF_MONTH));
		return cal.getTime();
	}

	/**
	 * 
	 * @Title: getTimesMonthLast
	 * @Description: 获取本月结束时间
	 * @param @return 
	 * @return Date 
	 * @throws
	 */
	public static Date getEndTimeForMonth() {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.MONTH, 1);
		cal.set(Calendar.DAY_OF_MONTH, 0);
		cal.set(Calendar.HOUR_OF_DAY, 23);
		cal.set(Calendar.SECOND, 59);
		cal.set(Calendar.MINUTE, 59);
		return cal.getTime();
	}

	/**
	 * 获取某一天的0点和24点的long数组
	 * @Description: TODO
	 * @param @param day
	 * @param @return
	 * @param @throws Exception   
	 * @return Long[]  
	 * @throws
	 * @author LiuSiGuang
	 * @date 2017年10月13日 下午5:23:36
	 */
	public static Long[] getStartAndEndLongByYMD(String day) throws Exception {
		if(StringUtils.isNotBlank(day)){
			Long startTime = getTimeByformatyyyyMMdd(day);
			Long endTime = startTime + 1000*60*60*24L;
			return new Long[]{startTime, endTime};
		}
		return null;
	}
	
	public static void main(String[] args) {

		System.out.println(StringToString("2013-12-12","yyyy-MM-dd"));

		JSONObject jsonObject = new JSONObject();
		jsonObject.put("time", DateUtils.getCurrentTime());
		jsonObject.put("hbjtfhyj","1111");
		JSONArray jsonArray = new JSONArray();
		jsonArray.add(jsonObject);
		System.out.println(jsonObject.toString());
		System.out.println(jsonArray.toString());
	}

}
