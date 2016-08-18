package com.sysnet.dbsb.util;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

public class Dom4jUtil {
	SAXReader saxReader = new SAXReader();
	Document document;
	org.dom4j.io.OutputFormat format = OutputFormat.createPrettyPrint();
	// private String parentDirectory;
	
	public SAXReader getSaxReader() {
		return saxReader;
	}

	public void setSaxReader(SAXReader saxReader) {
		this.saxReader = saxReader;
	}

	public org.dom4j.io.OutputFormat getFormat() {
		return format;
	}

	public void setFormat(org.dom4j.io.OutputFormat format) {
		this.format = format;
	}

	// public String getParentDirectory() {
	// return parentDirectory;
	// }
	//
	// public void setParentDirectory(String parentDirectory) {
	// this.parentDirectory = parentDirectory;
	// }

	public Dom4jUtil(Document document) {
		this.document = document;
	}

	/**
	 * 
	 * @param file
	 *            文件路径 或�?�文件名
	 * @param filePathOrFileNames
	 *            true表示传的文件路径filePath, false表示传�?�的文件名FileName此文件明必须在本项目中有
	 * 
	 */
	public Dom4jUtil(String file, boolean filePathOrFileName) {
		try {
			// saxReader.setEncoding("UTF-8");
			String filePath = "";
			if (filePathOrFileName) {
				filePath = file;
				// BufferedReader br=new BufferedReader(new
				// InputStreamReader(new FileInputStream(filePath),"UTF-8"));
				BufferedReader br = new BufferedReader(new InputStreamReader(
						new FileInputStream(filePath), "GBK"));
				StringBuffer s = new StringBuffer();
				while (br.read() != -1) {
					s = s.append(br.readLine());
				}
				document = saxReader.read(br);
			} else {
				// URL url = this.getClass().getResource(file);
				// 我们不能用常规操作文件的方法来读取ResourceJar.jar中的资源文件res.txt�??
				// 但可以�?�过Class类的getResourceAsStream()方法来获�?? �??
				// 这种方法是如何读取jar中的资源文件的，这一点对于我们来说是透明的�??
				// 我们将Resource.java改写成：
				// InputStream
				// is=this.getClass().getResourceAsStream("/resource/res.txt");
				InputStream is = this.getClass().getResourceAsStream(file);
				// filePath = url.getPath();
				document = saxReader.read(is);
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * @param file
	 *            文件路径 或�?�文件名
	 * @param filePathOrFileNames
	 *            true表示传的文件绝对路径文件filePath, false表示传�?�的文件名FileName此文件明必须在本项目中有
	 */
	public void readFile(String file, boolean filePathOrFileName) {
		try {
			// saxReader.setEncoding("UTF-8");
			String filePath = "";
			if (filePathOrFileName) {
				filePath = file;

				// BufferedReader br=new BufferedReader(new
				// InputStreamReader(new FileInputStream(filePath),"UTF-8"));
				BufferedReader br = new BufferedReader(new InputStreamReader(
						new FileInputStream(filePath), "GBK"));
				// StringBuffer s=new StringBuffer();
				// while(br.read()!=-1){
				// s=s.append(br.readLine());
				// }
				document = saxReader.read(br);

				// String xml="";
				// //读资源文�??
				// document = this.initXML_TO_Document(xml)
			} else {
				URL url = Dom4jUtil.class.getResource(file);
				URLConnection urlConnection = url.openConnection();
				// 读资源文�??
				InputStream inputStream = urlConnection.getInputStream();
				BufferedReader in = new BufferedReader(new InputStreamReader(
						inputStream, "utf-8"));
				document = saxReader.read(in);
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Dom4jUtil() {
	}

	/**
	 * 
	 * @param document
	 * @throws IOException
	 */
	public void save(Document document, String path) {
		try {

			format.setEncoding("utf-8"); //$NON-NLS-1$
			XMLWriter writer = new XMLWriter(new FileWriter(new File(path)),
					format);
			writer.write(document);
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * @throws IOException
	 */
	public void save(String path) {
		try {

			format.setEncoding("utf-8"); //$NON-NLS-1$
			XMLWriter writer = new XMLWriter(new FileWriter(new File(path)),
					format);
			writer.write(document);
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @param document
	 * @return
	 */
	public Element getRootElement(Document document) {
		return document.getRootElement();
	}

	// public String getStringFromDocument() {
	// String text = document.asXML();
	// return text;
	// }

	/**
	 * 初始化document
	 */
	public Document initXML_TO_Document(String xml) {
		try {
			document = DocumentHelper.parseText(xml);

		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return document;
	}

	public Document getDocument() {
		return document;
	}

	public void setDocument(Document document) {
		this.document = document;
	}

	public void setDocument(String xml) {
		try {
			StringReader in = new StringReader(xml);
			document = saxReader.read(in);
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 修改属�??
	 * 
	 * @param nodeNameXpath
	 *            xpath查找对象 /books/book/@show
	 */

	public void modifyDocumentAttribute(String nodeNameXpath, String value) {
		/** 先用xpath查找对象 */

		Attribute attribute = (Attribute) document
				.selectSingleNode(nodeNameXpath);
		attribute.setValue(value);
		/**
		 * List list = document.selectNodes(nodeNameXpath); Iterator iter =
		 * list.iterator(); while (iter.hasNext()) { Attribute attribute =
		 * (Attribute) iter.next(); attribute.setValue(value); }
		 */
	}

	/**
	 * 修改元素
	 * 
	 * @param nodeNameXpath
	 *            xpath查找对象 /books/book/title
	 */
	public void modifyDocumentElement(String nodeNameXpath, String value) {
		/**
		 * List list = document.selectNodes(nodeNameXpath); Iterator iter =
		 * list.iterator(); if (iter.hasNext()) { Element ownerElement =
		 * (Element) iter.next(); ownerElement.setText(value); }
		 */
		Element element = (Element) document.selectSingleNode(nodeNameXpath);
		element.setText(value);
	}

	/**
	 * 删除元素
	 * 
	 * @param nodeNameXpathParent
	 *            xpath查找父对�?? /books/book/title
	 * @param nodeNameXpathChild
	 *            删除的子对象
	 */
	public boolean removeDocumentElement(String nodeNameXpathParent,
			String nodeNameXpathChild) {
		Element element_parent = (Element) document
				.selectSingleNode(nodeNameXpathParent);
		Element element_child = (Element) document
				.selectSingleNode(nodeNameXpathChild);
		boolean flag = element_parent.remove(element_child);
		return flag;
	}

	/**
	 * 删除特定的所有元素节�??
	 * 
	 * @param parentNodeNameXpath
	 *            /books/book/ xpath查找父对�??
	 * @param nodeNameXpath
	 *            /books/book/title 删除的子对象
	 */
	@SuppressWarnings("unchecked")
	public void removeDocumentElements(String parentNodeNameXpath,
			String nodeNameXpath) {
		// Element parentEnement = document.getRootElement();
		List<Element> element_parent_list = (List<Element>) document
				.selectNodes(parentNodeNameXpath);

		for (Iterator<Element> it = element_parent_list.iterator(); it
				.hasNext();) {
			Element parent = it.next();
			List<Element> element_child_list = (List<Element>) parent
					.selectNodes(nodeNameXpath);
			for (Iterator<Element> itt = element_child_list.iterator(); itt
					.hasNext();) {
				Element child = itt.next();
				parent.remove(child);
			}
			// String temp=e.getName();
			// if("STAFFINFORMATION".equals(temp.toUpperCase())){
			// e.remove(e);
			// }

		}
	}

	/**
	 * 删除属�??
	 * 
	 * @param nodeNameXpath
	 *            xpath查找父对�?? /books/book/title
	 * @param nodeNameXpathAttribute
	 *            /books/book/@show 删除的属�??
	 */
	public boolean removeDocumentAttribute(String nodeNameXpath,
			String nodeNameXpathAttribute) {
		Element element = (Element) document.selectSingleNode(nodeNameXpath);
		Attribute attribute = (Attribute) document
				.selectSingleNode(nodeNameXpathAttribute);
		boolean flag = element.remove(attribute);
		return flag;
	}

	/**
	 * 添加元素
	 * 
	 * @param nodeNameXpathParent
	 *            xpath查找父对�?? /books/book/title
	 * @param element_child
	 *            添加的子对象
	 */
	public void addDocumentElement(String nodeNameXpathParent,
			Element element_child) {
		Element element_parent = (Element) document
				.selectSingleNode(nodeNameXpathParent);
		element_parent.add(element_child);
	}

	/**
	 * 添加属�??
	 * 
	 * @param nodeNameXpathParent
	 *            xpath查找父对�?? /books/book/title
	 * @param element_child
	 *            添加的子对象
	 */
	public void addDocumentElementAttribute(String nodeNameXpathParent,
			Attribute attribute) {
		Element element_parent = (Element) document
				.selectSingleNode(nodeNameXpathParent);
		element_parent.add(attribute);
	}

	public String getDocumentToXmlString() {
		String temp = this.document.asXML();
		return temp;
	}

	public String getDocumentToFormatXmlString() {
		// 创建输出格式
		// OutputFormat类的createCompactFormat()方法或createPrettyPrint()方法格式化输出，默认采用createCompactFormat()方法，显示比较紧�??
		OutputFormat format = OutputFormat.createPrettyPrint();
		// 制定输出xml的编码类�??
		format.setEncoding("utf-8");
		StringWriter writer = new StringWriter();
		// 创建�??个文件输出流
		XMLWriter xmlwriter = new XMLWriter(writer, format);
		// 将格式化后的xml串写入到文件
		try {
			xmlwriter.write(document);
			String returnValue = writer.toString();
			writer.close();
			return returnValue;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 返回编译后的字符串格�??
		return null;
	}

	/**
	 * 格式化XML文件
	 * 
	 * @param xml
	 * @return
	 * @throws DocumentException
	 * @throws IOException
	 */
	@SuppressWarnings("unused")
	private String formatXml(final String xml) throws DocumentException,
			IOException {
		SAXReader saxReader = new SAXReader();
		Document document = saxReader.read(new ByteArrayInputStream(xml
				.getBytes()));
		// 创建输出格式
		// OutputFormat类的createCompactFormat()方法或createPrettyPrint()方法格式化输出，默认采用createCompactFormat()方法，显示比较紧�??
		OutputFormat format = OutputFormat.createPrettyPrint();
		// 制定输出xml的编码类�??
		format.setEncoding("utf-8");
		StringWriter writer = new StringWriter();
		// 创建�??个文件输出流
		XMLWriter xmlwriter = new XMLWriter(writer, format);
		// 将格式化后的xml串写入到文件
		xmlwriter.write(document);
		String returnValue = writer.toString();
		writer.close();
		// 返回编译后的字符串格�??
		return returnValue;
	}

	/**
	 * 获取根元�??
	 * 
	 * @return
	 */
	public Element getRootElement() {
		return this.document.getRootElement();
	}

	public Element getBodyElementByName(String name){
	  Element node = (Element) document.selectSingleNode("/root/body");
	  if (node !=null) {
		  return getNode(node,name);
	  }
	  
	  return null;
	}
    
	public Element getNode(Element element ,String name){
		//当前节点名称
		if (name.equalsIgnoreCase(element.getName())) {
			return element;
		}
		//递归遍历当前节点所有的子节点
		List<Element> listElement=element.elements();//所有一级子节点的list
		for(Element e:listElement){//遍历所有一级子节点
			return this.getNode(e,name);//递s归
		}
		
		return null;
	}
	public static void main(String[] args) {
		String xmlString = 
			"<root>\n" +
			"<head><group_id>1449809489705</group_id><bus_code>100018</bus_code><bus_sub_code>02</bus_sub_code><package_id>1</package_id></head>\n" + 
			"<body><outExportHospitalCompensation>\n" + 
			"    <status>0</status>\n" + 
			"    <msg>医保号为6104030012330030116_880071428的信息住院补偿失败�?�找不到提供的参保信息，请核查！</msg>\n" + 
			"    </outExportHospitalCompensation></body>\n" + 
			"</root>";
		Dom4jUtil dom4jUtil = new Dom4jUtil();
		
		dom4jUtil.setDocument(xmlString);
		Element element = dom4jUtil.getBodyElementByName("status");
		System.out.println(element.getText());
		}
}
