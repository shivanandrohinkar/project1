package project1;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assertion_testng {
	
	@Test
	public void m1() {
		String str1="shivanand";
		String str2="shivanand";
		Assert.assertEquals(str1, str2,"not a equal");
	}
	
	@Test
	public void m2() {
		
		String str1="ok";
		String str2="not ok";
		Assert.assertNotEquals(str1, str2, null);
	}
	
	@Test
	public void m3() {
		
		
		String str1=null;
		Assert.assertNull(str1, "null");
		
	}
	
	

}
