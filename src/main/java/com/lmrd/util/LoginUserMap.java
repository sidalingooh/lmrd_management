package com.lmrd.util;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 登录用工具类
 * ClassName: LoginUserMap 
 * @Description: TODO
 * @author LiuSiGuang
 * @date 2017年10月12日 上午11:40:44
 */
public class LoginUserMap {

	private static Map<Long, String> loginUsers = new ConcurrentHashMap<Long, String>();
	 
	  /**
	   * 将用户和sessionId存入map
	   * @param loginId
	   * @param sessionId
	   */
	  public static void setLoginUsers(Long loginId, String sessionId) {
	    loginUsers.put(loginId, sessionId);
	  }
	 
	  /**
	   * 获取loginUsers
	   * @return
	   */
	  public static Map<Long, String> getLoginUsers() {
	    return loginUsers;
	  }
	 
	  /**
	   * 根据sessionId移除map中的值
	   * @param sessionId
	   */
	  public static void removeUser(String sessionId) {
	    for (Map.Entry<Long, String> entry : loginUsers.entrySet()) {
	      if (sessionId.equals(entry.getValue())) {
	        loginUsers.remove(entry.getKey());
	        break;
	      }
	    }
	  }
	 
	  /**
	   * 判断用户是否在loginusers中
	   * @param loginId
	   * @param sessionId
	   * @return
	   */
	public static boolean isInLoginUsers(Long loginId, String sessionId) {
	    return (loginUsers.containsKey(loginId) && sessionId.equals(loginUsers.get(loginId)));
	  }
}
