package com.lmrd.util.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author uimgaine 校验手机号
 */
public class TelphoneTag extends TagSupport {

	/**
	 * Default SerialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	// Fields

	// long型日期值
	private String validate;
	// 日期格式
	private String value;

	@Override
	public int doStartTag() throws JspException {
		String result = "";
		Pattern p = Pattern.compile("^(1[0-9][0-9])\\d{8}$");
		Matcher m = p.matcher(validate);
		boolean matches = m.matches();
		if (matches) {
			result = "";
		} else {
			result = "手机号有误";
		}
		try {
			pageContext.getOut().write(result);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return super.doStartTag();
	}

	public String getValidate() {
		return validate;
	}

	public void setValidate(String validate) {
		this.validate = validate;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}