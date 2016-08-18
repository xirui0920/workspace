package com.tutorialspoint;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
@SuppressWarnings("deprecation")
public class MainApp {
	public static void main(String[] args) {
		FileSystemXml();
	}
	public static void ClassPathXml(){
		XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("Beans.xml"));
		Helloworld obj = (Helloworld) factory.getBean("helloWorld");
		obj.getMessage();
	}
	public static void FileSystemXml(){
		ApplicationContext context = new FileSystemXmlApplicationContext("C:/Users/zhujing/Desktop/葸锐/workspace/HelloSpring/src/Beans.xml");
		Helloworld obj = (Helloworld) context.getBean("helloWorld");
		obj.getMessage();
	}
}