package test;

import org.junit.Test;

import com.beixiao.common.util.Properties;

public class ProertiesTest extends BaseTest{

	@Test
	public void testPropeties() throws Exception{
		String value = Properties.getValue(Properties.PROPERTIES_INTERFACE, Properties.WECHAT_LOGIN);
		System.out.println(value);
	}
}
