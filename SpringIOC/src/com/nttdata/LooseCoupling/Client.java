package com.nttdata.LooseCoupling;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {
public static void main(String[] args) {
	Resource res=new ClassPathResource("SpringCar.xml");
	BeanFactory  factory=new XmlBeanFactory(res);
	
	Resource res1=new ClassPathResource("SpringTravelerConfig.xml");
	BeanFactory fac=new XmlBeanFactory(res1,factory);
	Object o=fac.getBean("id");
	Journey j=(Journey)o;
	j.startjourney();
	
}
}
