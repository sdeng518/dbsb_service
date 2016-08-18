/**
* @Title: AppJsonHttpMessageConverter.java
* @Package com.sysnet.base.converter
* @Description: 
* @author 秦晓东
* @date 2015年12月16日 下午3:08:26
* @version V1.0
*/
package com.sysnet.common.base.converter;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;

import org.apache.commons.lang3.ArrayUtils;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.AbstractHttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

/**
* @ClassName: AppJsonHttpMessageConverter
* @Description: 继承FastJsonHttpMessageConverter，解决Controller传null，显示null的问题
* @author 秦晓东
* @see com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter
* @date 2015年12月16日 下午3:08:26
*/
public class AppJsonHttpMessageConverter extends AbstractHttpMessageConverter<Object> {
	public final static Charset UTF8 = Charset.forName("UTF-8");

	private Charset charset = UTF8;

	private SerializerFeature[] features = new SerializerFeature[0];

	public AppJsonHttpMessageConverter() {
		super(new MediaType("application", "json", UTF8), new MediaType("application", "*+json", UTF8));
	}

	@Override
	protected boolean supports(Class<?> clazz) {
		return true;
	}

	public Charset getCharset() {
		return this.charset;
	}

	public void setCharset(Charset charset) {
		this.charset = charset;
	}

	public SerializerFeature[] getFeatures() {
		return features;
	}

	public void setFeatures(SerializerFeature... features) {
		this.features = features;
	}

	@Override
	protected Object readInternal(Class<? extends Object> clazz, HttpInputMessage inputMessage)
			throws IOException, HttpMessageNotReadableException {

		ByteArrayOutputStream baos = new ByteArrayOutputStream();

		InputStream in = inputMessage.getBody();

		byte[] buf = new byte[1024];
		for (;;) {
			int len = in.read(buf);
			if (len == -1) {
				break;
			}

			if (len > 0) {
				baos.write(buf, 0, len);
			}
		}

		byte[] bytes = baos.toByteArray();
		return JSON.parseObject(bytes, 0, bytes.length, charset.newDecoder(), clazz);
	}

	@Override
	protected void writeInternal(Object obj, HttpOutputMessage outputMessage)
			throws IOException, HttpMessageNotWritableException {

		OutputStream out = outputMessage.getBody();
		String text = JSON.toJSONString(obj, features);
		if (text.contains("null")) {
			if (ArrayUtils.contains(features, SerializerFeature.UseSingleQuotes)) {
				text = text.replace("null", "\'\'");
			}
			text = text.replace("null", "\"\"");
		}
		byte[] bytes = text.getBytes(charset);
		out.write(bytes);
	}
}
