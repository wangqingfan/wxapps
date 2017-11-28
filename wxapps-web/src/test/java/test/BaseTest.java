package test;

import java.io.Serializable;
import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.beixiao.system.domain.AnrongShareInfo;
import com.beixiao.system.service.AnrongShareInfoService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:/applicationContext.xml")
public class BaseTest {
	
	@Resource
	private RedisTemplate<Serializable, Serializable> redisTemplate;
	@Resource
	private AnrongShareInfoService anrongShareInfoService;
	
	@Test
	public void test1(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:/applicationContext.xml");
	}
	
	@Test
	public void test2(){
		ValueOperations<Serializable, Serializable> value = redisTemplate.opsForValue();
		value.set("ceshi1", "1");
		System.out.println(value.get("ceshi1"));
	}
	
	@Test
	public void test3(){
		try {
			AnrongShareInfo findById = anrongShareInfoService.findById(1);
			System.out.println("-----------"+findById.getLoanId());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
