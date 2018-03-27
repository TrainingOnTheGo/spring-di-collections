import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.traning.CollectionTest;


public class Application {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		//EmployeeService employeeService = applicationContext.getBean("employeeService", EmployeeService.class);
		CollectionTest ct = (CollectionTest)applicationContext.getBean("collectionTest");
		System.out.println(ct.getNameList());
		System.out.println(ct.getNameSet());
		System.out.println(ct.getNameMap());
		System.out.println(ct.getNameProp());
		((ConfigurableApplicationContext)applicationContext).close();
	}

}
