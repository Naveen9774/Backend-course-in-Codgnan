package program1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class MainApp {
	public static void main(String[] args) {
		ClassPathResource resource = new ClassPathResource("applicationContext.xml");
		BeanFactory beanfact= new XmlBeanFactory(resource);
		
		Employee e =(Employee)beanfact.getBean("emp");
		System.out.println(e.getId());
		System.out.println(e.getName());
		System.out.println(e.getSalary());
		System.out.println(e.getCompany());
	}

}
