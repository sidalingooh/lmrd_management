package com.lmrd.util;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.log4j.Logger;

import java.util.*;

/**
 * 数据处理工具类
 * ClassName: DataUtil 
 * @Description: TODO
 * @author LiuSiGuang
 * @date 2017年10月12日 上午11:40:21
 */
public final class DataUtil {

	// Fields

	// 日志
	private static Logger logger = Logger.getLogger(DataUtil.class);

	/**
	 * 生成MD5密文
	 * @param source 明文
	 * @return 密文
	 */
	public static String generateMD5(byte[] source) {
		String result = null;
		char hexDigits[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
				'a', 'b', 'c', 'd', 'e', 'f' };
		try {
			java.security.MessageDigest md = java.security.MessageDigest
					.getInstance("MD5");
			md.update(source);
			byte tmp[] = md.digest();
			char str[] = new char[16 * 2];
			int k = 0;
			for (int i = 0; i < 16; i++) {
				byte byte0 = tmp[i];
				str[k++] = hexDigits[byte0 >>> 4 & 0xf];
				str[k++] = hexDigits[byte0 & 0xf];
			}
			result = new String(str);
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		return result;
	}

	/**
	 * IP地址字符串转换为long型数据
	 * @param ip IP地址字符串
	 * @return long long型数据
	 */
	public static long ip2long(String ip) {
		long result = 0L;
		try {
			String[] ip_strings = ip.split("\\.");
			if (ip_strings.length != 4) {
				throw new Exception("输入IP地址格式不正确");
			}
			int[] ip_ints = new int[4];
			for (int i = 0; i < 4; i++) {
				ip_ints[i] = Integer.parseInt(ip_strings[i]);
			}
			for (int i = 0; i < 4; i++) {
				result += ip_ints[i] * Math.pow(256, 3 - i);
			}
		} catch (Exception e) {
			logger.error(e.getStackTrace());
		}
		return result;
	}

	/**
	 * long型数据IP地址转换为字符串型IP地址
	 * @param ip long型数据IP地址
	 * @return String IP地址字符串
	 */
	public static String long2ip(long ip) {
		String result = "";
		result += ip % 256;
		ip /= 256;
		result = ip % 256 + "." + result;
		ip /= 256;
		result = ip % 256 + "." + result;
		ip /= 256;
		result = ip % 256 + "." + result;
		return result;
	}

	/**
	 * 验证字符串是否不为空[不是null和空串]
	 * @param source  输入字符串
	 * @param trim 是否trim
	 * @return boolean true-是 false-否
	 */
	public static boolean isNotEmpty(String source, boolean trim) {
		if (trim) {
			if (source == null || "".equals(source.trim())) {
				return false;
			} else {
				return true;
			}
		} else {
			if (source == null || "".equals(source)) {
				return false;
			} else {
				return true;
			}
		}
	}

	/**
	 * 生成随机密码
	 * @param length 密码长度
	 * @return String 密码明文
	 */
	public static String generatePassword(int length) {
		String val = "";
		Random random = new Random();
		for (int i = 0; i < length; i++) {
			String charOrNum = random.nextInt(2) % 2 == 0 ? "num" : "num";
			if ("char".equalsIgnoreCase(charOrNum)) {
				int choice = random.nextInt(2) % 2 == 0 ? 65 : 97;
				val += (char) (choice + random.nextInt(26));
			} else if ("num".equalsIgnoreCase(charOrNum)) {
				val += String.valueOf(random.nextInt(10));
			}
		}
		return val;
	}

	/**
	 * json转map
	 * @param jsonStr
	 * @return
	 */
	public static Map<String, Object> parseJSON2Map(String jsonStr) {
		Map<String, Object> map = new HashMap<String, Object>();
		// 最外层解析
		JSONObject json = JSONObject.fromObject(jsonStr);
		for (Object k : json.keySet()) {
			Object v = json.get(k);
			// 如果内层还是数组的话，继续解析
			if (v instanceof JSONArray) {
				List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
				@SuppressWarnings("unchecked")
				Iterator<JSONObject> it = ((JSONArray) v).iterator();
				while (it.hasNext()) {
					JSONObject json2 = it.next();
					list.add(parseJSON2Map(json2.toString()));
				}
				map.put(k.toString(), list);
			} else {
				map.put(k.toString(), v);
			}
		}
		return map;
	}
	
}