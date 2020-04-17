package com.nttdata.Ioc.Setter.Collection;

import java.awt.image.SampleModel;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {
public static void main(String[] args) {
	Resource res=new ClassPathResource("SpringSet.xml");
	BeanFactory  factory=new XmlBeanFactory(res);
	
	Object o=factory.getBean("id1");
	SamplBean b=(SamplBean)o;
	b.print();

	
}
}
