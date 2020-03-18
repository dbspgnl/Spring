package Spring05_test02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	public static void main(String[] args) {
		ApplicationContext factory =
				new ClassPathXmlApplicationContext("Spring05_test02/applicationContext.xml");
		School school = (School)factory.getBean("mySchool");
		System.out.println(school);
	}
}
