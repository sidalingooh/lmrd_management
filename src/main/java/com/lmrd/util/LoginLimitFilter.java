package com.lmrd.util;

import com.lmrd.entity.user.BackUser;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * 登录用工具类
 * ClassName: LoginLimitFilter 
 * @Description: TODO
 * @author LiuSiGuang
 * @date 2017年10月12日 上午11:40:34
 */
public class LoginLimitFilter implements Filter{

	private Log log = LogFactory.getLog(LoginLimitFilter.class);
	 
	  /**
	   * 销毁时的方法
	   */
	  @Override
	  public void destroy() {
	 
	  }
	 
	  /**
	   * 过滤请求
	   * @param request
	   * @param response
	   * @param filterChain
	   * @throws IOException
	   * @throws ServletException
	   */
	  @Override
	  public void doFilter(ServletRequest request, ServletResponse response,
	     FilterChain filterChain) throws IOException, ServletException {
	    HttpServletRequest servletRequest = (HttpServletRequest) request;
	    HttpServletResponse servletResponse = (HttpServletResponse) response;
	    HttpSession session = servletRequest.getSession();
	 
	    //获取项目路径
	    String path = servletRequest.getContextPath(); 
	    String basePath = servletRequest.getScheme()+"://"+servletRequest.getServerName()+":"+servletRequest.getServerPort()+path;
	 
	    try {
	      //获取用户信息，如果没获取到会抛出错误,我的是这样,代表用户还没有登录
	    	BackUser loginUser = (BackUser) session.getAttribute("loginUser");
	      if(loginUser != null){
	    	  Long loginId = loginUser.getBackUserId();
	    	  //判断当前用户的sessionId是否在loginUsers中，如果没有执行if后的操作
	    	  if(!LoginUserMap.isInLoginUsers(loginId, session.getId())) {
	    		  //当前用户logout
	    		  //调到登录页面，并表明退出方式为挤下线
	    		  servletResponse.sendRedirect(basePath + "/logout.action");
	    	  }
	      }
	    } catch (Exception e) {
	      log.debug("获取当前用户信息失败，用户未登陆！", e);
	    } finally {
	      filterChain.doFilter(request, response);
	    }
	  }
	 
	  /**
	   * 初始化方法
	   * @param arg0
	   * @throws ServletException
	   */
	  @Override
	  public void init(FilterConfig arg0) throws ServletException {
	 
	  }
}
