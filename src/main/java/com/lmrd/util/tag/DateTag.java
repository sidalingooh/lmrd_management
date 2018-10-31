package com.lmrd.util.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * @author uimgaine
 * 自定义标签转换Long型日期
 */
public class DateTag extends TagSupport {

	/**
	 * Default SerialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	
	// Fields
	
	// long型日期值
	private String value;
	// 日期格式
	private String format;

	@Override
	public int doStartTag() throws JspException {
		String result = "";
		long time = 0L;
		if(this.getValue() == null || "".equals(this.getValue().trim())) {
			time = -1L;
		} else {
			time = Long.valueOf(this.getValue());
		}
		if(time < 0) {
			result = "";
		} else {
			Calendar c = Calendar.getInstance();
			c.setTimeInMillis(time);
			SimpleDateFormat dateformat = new SimpleDateFormat(this.getFormat());
			result  = dateformat.format(c.getTime());
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

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

}