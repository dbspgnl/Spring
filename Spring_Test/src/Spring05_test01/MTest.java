package Spring05_test01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	public static void main(String[] args) {
		ApplicationContext factory = 
				new ClassPathXmlApplicationContext("Spring05_test01/applicationContext.xml");
		
		MyNickPrn my = (MyNickPrn)factory.getBean("myNickPrn");
		System.out.println(my);
	}
}
