package com.wanqing;




import org.junit.Assert;
import org.junit.Test;

public class HelloTest {

	@Test
	public void addtest() {
		Hello hello = new Hello();
		int a=0,b=1;
		int c = hello.add(a, b);
		Assert.assertEquals(1, c);
	}

}
