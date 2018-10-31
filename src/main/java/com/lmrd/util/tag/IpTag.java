package com.lmrd.util.tag;



import com.lmrd.util.DataUtil;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;
import java.io.IOException;

/**
 * @author uimagine
 * 自定义标签Long型转化IP地址
 */
public class IpTag extends TagSupport {

	/**
	 * Default SerialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	
	// Fields
	
	// long型IP地址
	private String value;

	@Override
	public int doStartTag() throws JspException {
		String result = "";
		long ipVlaue = 0L;
		if(this.getValue() == null || "".equals(this.getValue().trim())) {
			result = "";
		} else {
			ipVlaue = Long.valueOf(this.getValue());
			result = DataUtil.long2ip(ipVlaue);
		}
		try {
			pageContext.getOut().write(result);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return super.doStartTag();
	}
	
	// Property accessors

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}