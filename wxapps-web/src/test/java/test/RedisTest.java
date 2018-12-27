package test;

import java.io.Serializable;

import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

public class RedisTest  extends BaseTest{

	@Resource
	private RedisTemplate<Serializable, Serializable> redisTemplate;
	
	@Test
	public void testRedis(){
		ValueOperations<Serializable, Serializable> opsForValue = redisTemplate.opsForValue();
		opsForValue.set("aaaaaa1111", "1111");
		System.out.println(opsForValue.get("aaaaaa1111"));
	}
}
