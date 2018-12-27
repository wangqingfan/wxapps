package test;
import java.util.Random;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:/applicationContext.xml")
public class BaseTest {

	@Test
	public void test1(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:/applicationContext.xml");
	}
	
	@Test
	public void test2(){
		StringBuffer codeSb = new StringBuffer();
		for(int i=0;i<6;i++){
			Random random = new Random();
			codeSb.append(String.valueOf(random.nextInt(10)));
		}
		System.out.println(codeSb.toString());
	}
}
