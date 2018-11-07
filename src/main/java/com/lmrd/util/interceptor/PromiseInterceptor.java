package com.lmrd.util.interceptor;


import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.List;

/**
 * 拦截器
 * ClassName: PromiseInterceptor 
 * @Description: TODO
 * @author LiuSiGuang
 * @date 2017年10月12日 上午11:42:07
 */
@Component
public class PromiseInterceptor extends HandlerInterceptorAdapter {

	/*@Autowired
	private BackMenuService backMenuService;*/

	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		String[] withoutInteceptor = new String[] {
				//不被拦截的地址
		         "/index",
		         "/login",
				 "/auth",
				 "/js",
				 "/css",
				 "/img",
				 "/images",
				 "/common",
				"/region/selectProvince",
				"/region/getByRegionCode",
				"/frame",
				"/json",
		         //"/content.action",
		         //"/main.action",
		         //"/uploadController/imgUploadByUeditor.action",
		         //"/uploadController/uploadImage.action",
		         "/logout"
                 
		};
		/*Enumeration enu=request.getParameterNames();  
		while(enu.hasMoreElements()){  
		String paraName=(String)enu.nextElement();  
		System.out.println("~~~~~~~~~~~~"+paraName+": "+request.getParameter(paraName));  
		}*/
		String uri = null;
		if (null == request.getQueryString()
				|| "".equals(request.getQueryString())) {
			uri = request.getRequestURI();
		} else {
			uri = request.getRequestURI() + "?" + request.getQueryString();
		}
		String conString = request.getHeader("REFERER");
		boolean isInteceptor = true;
		for (String str : withoutInteceptor) {
			if (uri.indexOf(str) != -1) {
				isInteceptor = false;
				break;
			}
		}
		if (isInteceptor) {
			if(conString == null || "".equals(conString)){
				if(request.getSession().getAttribute("loginUser")==null){
					PrintWriter out = response.getWriter();
					StringBuilder builder = new StringBuilder();
					String default_url = request.getScheme() + "://"
							+ request.getServerName() + ":"
							+ request.getServerPort() + request.getContextPath();
					builder.append("<script>");
					builder.append("parent.location='" + default_url
							+ "/index';");
					builder.append("</script>");
					out.print(builder.toString());
					out.close();
					return false;
				}
			}else if (request.getSession().getAttribute("loginUser")==null&&!uri.contains("index")) {
				PrintWriter out = response.getWriter();
				StringBuilder builder = new StringBuilder();
				String default_url = request.getScheme() + "://"
						+ request.getServerName() + ":"
						+ request.getServerPort() + request.getContextPath();
				builder.append("<script>");
				builder.append("parent.location='" + default_url
						+ "/index';");
				builder.append("</script>");
				out.print(builder.toString());
				out.close();
				return false;
			}
		}
		/*BackUser backUser = (BackUser)request.getSession().getAttribute("loginUser");
		List<BackMenu> menuList = backMenuService.selectByBackUserId(backUser.getBackUserId());
		for (BackMenu menu : menuList) {
			System.out.println(menu.getName());
		}*/
		return super.preHandle(request, response, handler);
	}

}
